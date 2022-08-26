package kr.co.pointclick.sdk.rn

import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import kr.co.pointclick.sdk.offerwall.core.PointClickAd
import kr.co.pointclick.sdk.offerwall.core.events.PackageReceiver

class PointclickRnModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {
  private lateinit var packageReceiver: PackageReceiver

  override fun getName(): String {
    return "PointclickRn"
  }

  override fun initialize() {
    try {
      val intentFilter = IntentFilter()
      intentFilter.addAction(Intent.ACTION_PACKAGE_ADDED)
      intentFilter.addAction(Intent.ACTION_PACKAGE_REMOVED)
      intentFilter.addDataScheme("package")
      packageReceiver = PackageReceiver()
      reactApplicationContext.registerReceiver(packageReceiver, intentFilter)
    } catch (e: Exception) {
      e.printStackTrace()
    }
  }

  override fun invalidate() {
    reactApplicationContext.unregisterReceiver(packageReceiver)
  }

  @ReactMethod
  fun showOfferwall(title: String, adInfo: ReadableMap) {
    Log.d(TAG, title);
    adInfo.getString("placementUid")?.let { Log.d(TAG, it) };
    adInfo.getString("pickerUid")?.let { Log.d(TAG, it) };

    var placementUid = adInfo.getString("placementUid");
    var pickerUid = adInfo.getString("pickerUid");

    PointClickAd.init(placementUid, pickerUid);

    PointClickAd.showOfferwall(currentActivity, title);
  }

  companion object {
    private const val TAG = "PointclickRnModule";
  }

}
