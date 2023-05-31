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

import android.util.Log;
public class CheroModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    private Handler mHandler;
    private Handler mHandler;
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

    // 获取心电SDK版本号
    @ReactMethod
    public void getVersion(Callback successCallback) {
        successCallback.invoke(ChSdkManager.getInstance().getVersion());
    }

    // 初始化接口
    @ReactMethod
    public void initialize() {
        Looper mainLooper = Looper.getMainLooper();
        mHandler = new Handler(mainLooper) {
            @Override
            public void handleMessage(Message msg) {
                onReceiveEvent(msg);
            }
        };
        boolean initResult = ChSdkManager.getInstance().init(mHandler, reactContext.getApplicationContext());
        Log.d("tag", "ChSdkManager 初始化：" + initResult);
    }
    
    // private void bindViews() {
    // // 绑定视图的逻辑
    // }

    private void onReceiveEvent(Message msg) {
        // 处理接收到的事件的逻辑
    }
}