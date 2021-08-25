package com.tictac.tictactoe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;

import com.tictac.tictactoe3.Dialog.SettingDialog;

public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        String Data = getIntent().getStringExtra(SettingDialog.PRIVACY_POLICY_KEY);


        TextView textView = findViewById(R.id.textView1);

        textView.setText(Html.fromHtml(Data));

    }
}