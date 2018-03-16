package com.fta.customlayout.custom.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.fta.customlayout.R;
import com.fta.customlayout.util.DensityUtil;


/**
 * Created by nian on 18/3/16.
 */

public class MyDialog extends Dialog {
    private Context mContext;

    public MyDialog(@NonNull Context context) {
        this(context, 0);
    }

    public MyDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        mContext = context;
    }

    protected MyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(mContext, R.layout.dialog_layout, null);
        setContentView(view);

//        setCanceledOnTouchOutside(false);

        Window window = getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.gravity = Gravity.CENTER;
        lp.height = DensityUtil.dip2px(mContext, 250);
        lp.width = DensityUtil.dip2px(mContext, 200);
        window.setAttributes(lp);


        view.findViewById(R.id.practice_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });


    }
}
