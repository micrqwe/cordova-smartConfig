package net.kingsilk.www;

import android.text.TextUtils;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SmartConfigPlugin extends CordovaPlugin {
    private static String TAG = "AliPayPlugin";

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        try {
            JSONObject arguments = args.getJSONObject(0);
            final String params = arguments.getString("params");
            final CallbackContext callbackContexts = callbackContext;
            cordova.getThreadPool().execute(new Runnable() {
                @Override
                public void run() {
//                    callbackContexts.success(payResult.toJson());
                    // 构造PayTask 对象
                    callbackContexts.error("{code:1}");
                }
            });
        } catch (JSONException e) {
            callbackContext.error(new JSONObject());
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
