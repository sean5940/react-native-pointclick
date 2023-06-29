package kr.co.pointclick.sdk.rn

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager


class PointClickPackage : ReactPackage {
  override fun createNativeModules(
    reactContext: ReactApplicationContext
  ): MutableList<NativeModule> = listOf(
    PointClickAdModule(reactContext),
    PointClickOfferwallModule(reactContext),
    PointClickFloatingCPCModule(reactContext)
  ).toMutableList()

  override fun createViewManagers(
    reactContext: ReactApplicationContext
  ): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()
}
