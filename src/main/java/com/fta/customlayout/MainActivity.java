package com.fta.customlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fta.customlayout.custom.dialog.CustomDialog;
import com.fta.customlayout.custom.dialog.MyDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //使用mydialog
    private void createMyDialog() {
        MyDialog myDialog = new MyDialog(this, R.style.Dialog);
        myDialog.show();
    }

    //使用自定义dialog
    private void createCustomDialog() {
        CustomDialog.Builder builder = new CustomDialog.Builder(this);
        builder.style(R.style.Dialog).heightdp(250).widthdp(200).view(R.layout.dialog_layout).addViewOnclick(R.id.practice_btn, listener);
        builder.build().show();
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
