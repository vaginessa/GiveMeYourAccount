package com.woshixwn.givemeyouraccount;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by woshi on 2016-08-21.
 */
public class MyFloatService extends Service {

    private static final String TAG = "MyFloatService";
    private FloatViewManager manager;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate(){
        manager = FloatViewManager.getInstance(this);
        manager.showFloatCircleView();
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}

