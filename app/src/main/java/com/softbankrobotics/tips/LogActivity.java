package com.softbankrobotics.tips;

import android.os.Bundle;
import android.util.Log;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.QiSDK;
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks;
import com.aldebaran.qi.sdk.design.activity.RobotActivity;


public class LogActivity extends RobotActivity implements RobotLifecycleCallbacks {

    private static final String TAG = "MyLogTagJava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate method called");
        // Register the RobotLifecycleCallbacks to this Activity.
        QiSDK.register(this, this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy method called");
        // Unregister the RobotLifecycleCallbacks for this Activity.
        QiSDK.unregister(this, this);
        super.onDestroy();
    }

    @Override
    public void onRobotFocusGained(QiContext qiContext) {
        // The robot focus is gained.
        Log.i(TAG, "onRobotFocusGained method called");
    }

    @Override
    public void onRobotFocusLost() {
        // The robot focus is lost.
        Log.i(TAG, "onRobotFocusLost method called");
    }

    @Override
    public void onRobotFocusRefused(String reason) {
        // The robot focus is refused.
        Log.i(TAG, "onRobotFocusRefused method called" + reason);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method called");
    }

}
