package kr.co.pointclick.sdk.rn

import android.util.Log
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kr.co.pointclick.sdk.offerwall.core.PointClickAd

class PointClickOfferwallModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "PointClickOfferwallModule";
  }

  @ReactMethod
  fun showOfferwall(title: String, promise: Promise) {
    Log.d(name, title);

    PointClickAd.showOfferwall(currentActivity, title);

    promise.resolve(null)
  }
}
