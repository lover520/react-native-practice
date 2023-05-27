package com.example;

import com.cheroee.cherosdk.ChSdkManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CheroModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

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
}