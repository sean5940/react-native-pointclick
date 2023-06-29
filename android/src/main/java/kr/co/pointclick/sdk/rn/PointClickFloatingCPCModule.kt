package kr.co.pointclick.sdk.rn

import android.util.Log
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kr.co.pointclick.sdk.offerwall.core.PointClickAd

class PointClickFloatingCPCModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "PointClickFloatingCPCModule";
  }

  @ReactMethod
  fun showFloatingCPC(title: String, btnTemplate: Int, promise: Promise) {
    Log.d(name, title);
    Log.d(name, "btnTemplate: $btnTemplate");

    PointClickAd.showFloatingCPC(currentActivity, title, btnTemplate);
    promise.resolve(null)
  }
}
