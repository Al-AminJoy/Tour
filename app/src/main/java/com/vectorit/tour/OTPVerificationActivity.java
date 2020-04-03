package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class OTPVerificationActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ll_otp_back,ll_otp;
    TextInputLayout til_otp_code;
    TextView tv_click_here;
    MaterialButton button_submit_otp;
    Animation fade_in_from_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverification);

        //Hooks
        ll_otp = findViewById(R.id.ll_otp);
        ll_otp_back = findViewById(R.id.ll_otp_back);
        til_otp_code = findViewById(R.id.til_otp_code);
        button_submit_otp = findViewById(R.id.button_submit_otp_code);
        tv_click_here = findViewById(R.id.tv_otp_click_here);

        //Animation
        fade_in_from_bottom = AnimationUtils.loadAnimation(this,R.anim.fade_in_from_bottom);
        ll_otp.setAnimation(fade_in_from_bottom);

        button_submit_otp.setOnClickListener(this);
        ll_otp_back.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent it;
        switch(v.getId()){
            case R.id.ll_otp_back:
                it = new Intent(this,SignUpPhoneNumber.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                break;

            case R.id.button_submit_otp_code:
                it = new Intent(this,SignUpAditionalInfoActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                break;

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent(this,SignUpPhoneNumber.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        finish();
        super.onBackPressed();
    }
}
