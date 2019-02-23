package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends Activity {

    private final static int SEND_SMS_PERMISSION_REQUEST_CODE = 111;
    private Button sendMessage;

    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sendMessage = (Button) findViewById(R.id.send_message);
        final EditText message = (EditText) findViewById(R.id.message);
        sendMessage.setEnabled(false);
        if (checkPermission(Manifest.permission.SEND_SMS)) {
        }
        else {
        }
        }
        private boolean checkPermission(String permission) {
            int checkPermission = ContextCompat.checkSelfPermission(this, permission);
            return checkPermission == PackageManager.PERMISSION_GRANTED;
        }


}
