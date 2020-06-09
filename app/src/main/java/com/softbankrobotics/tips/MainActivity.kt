package com.softbankrobotics.tips

import android.os.Bundle
import android.util.Log
import com.aldebaran.qi.sdk.QiContext
import com.aldebaran.qi.sdk.QiSDK
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks
import com.aldebaran.qi.sdk.design.activity.RobotActivity

private const val TAG = "MyLogTag"

class MainActivity : RobotActivity(), RobotLifecycleCallbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i( TAG, "onCreate method called")
        super.onCreate(savedInstanceState)
        QiSDK.register(this, this)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        // Unregister the RobotLifecycleCallbacks for this Activity.
        Log.i(TAG, "onDestroy method called")
        QiSDK.unregister(this, this)
        super.onDestroy()
    }

    override fun onRobotFocusGained(qiContext: QiContext?) {
        Log.i( TAG, "onRobotFocusGained method called")
    }

    override fun onRobotFocusRefused(reason: String?) {
        Log.i( TAG, "onRobotFocusRefused method called because : $reason")
    }

    override fun onRobotFocusLost() {
        // The robot focus is lost.
        Log.i(TAG, "onRobotFocusLost method called")

    }

    override fun onStart() {
        Log.i( TAG, "onStart method called")
        super.onStart()
    }

    override fun onRestart() {
        Log.i( TAG, "onRestart method called")
        super.onRestart()
    }

    override fun onResume() {
        Log.i( TAG, "onResume method called")
        super.onResume()
    }

    override fun onPause() {
        Log.i( TAG, "onPause method called")
        super.onPause()
    }

    override fun onStop() {
        Log.i( TAG, "onStop method called")
        super.onStop()
    }
}


