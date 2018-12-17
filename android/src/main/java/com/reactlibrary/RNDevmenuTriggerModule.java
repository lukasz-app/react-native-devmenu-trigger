package com.reactlibrary;

/**
 * Created by lukaszchludzinski on 30/08/2018.
 */

import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.os.Handler;
import android.view.KeyEvent;

public class RNDevmenuTriggerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDevmenuTriggerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNDevmenuTrigger";
  }

  @ReactMethod
    public void show() {
        Handler mainHandler = new Handler(getReactApplicationContext().getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                getReactApplicationContext().getCurrentActivity().onKeyUp(KeyEvent.KEYCODE_MENU,new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_MENU));
                ((ReactActivity) getCurrentActivity()).onKeyUp(KeyEvent.KEYCODE_MENU, null);
            }
        });
    }
}