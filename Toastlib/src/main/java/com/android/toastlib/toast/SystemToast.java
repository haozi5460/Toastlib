package com.android.toastlib.toast;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by hao.shi on 2016/4/20.
 * Please use this for normal Toast ,or it will exception for above Build7.1.1
 */
public class SystemToast implements IToast {
    private final static String TAG = "SystemToast";
    private Toast toast;

    public SystemToast(Context context) {
        toast = Toast.makeText(context,"",Toast.LENGTH_SHORT);
    }

    @Override
    public void showToast(CharSequence s) {
        toast.setText(s);
        toast.show();
    }

    @Override
    public void cancel() {
        toast.cancel();
    }

    @Override
    public View getView() {
        return toast.getView();
    }
}
