package com.example;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

import com.cheroee.cherosdk.ChSdkManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CheroModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    // public CheroModule(ReactApplicationContext context) {
    // super(context);
    // reactContext = context;
    // }

    public CheroModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "CheroModule";
    }

    // @ReactMethod
    // public void initialize() {
    // bindViews();
    // mHandler = new Handler() {
    // @Override
    // public void handleMessage(Message msg) {
    // onReceiveEvent(msg);
    // }
    // };
    // // 初始化 ChSdkManager
    // ChSdkManager.getInstance().init(mHandler,
    // reactContext.getApplicationContext());
    // }

    // private void bindViews() {
    // // 绑定视图的逻辑
    // }

    // private void onReceiveEvent(Message msg) {
    // // 处理接收到的事件的逻辑
    // }

    // 获取心电SDK版本号
    @ReactMethod
    public void getVersion(Callback successCallback) {
        successCallback.invoke(ChSdkManager.getInstance().getVersion());
    }
    // 初始化接口
}