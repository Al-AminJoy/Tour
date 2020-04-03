package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SignUpAditionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_aditional_info);
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent(this,OTPVerificationActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        finish();
        super.onBackPressed();
    }
}
