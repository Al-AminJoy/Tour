package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpPhoneNumber extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ll_submit_back,ll_submit_phone_number;
    TextInputLayout til_signup_number;
    MaterialButton button_submit_number;
    Animation fade_in_from_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_phone_number);

        //Hooks
        ll_submit_phone_number = findViewById(R.id.ll_submit_phone_number);
        ll_submit_back = findViewById(R.id.ll_submit_back);
        til_signup_number = findViewById(R.id.til_signUp_phone_numner);
        button_submit_number = findViewById(R.id.button_submit_number);

        //Animation
        fade_in_from_bottom = AnimationUtils.loadAnimation(this,R.anim.fade_in_from_bottom);
        ll_submit_phone_number.setAnimation(fade_in_from_bottom);

        button_submit_number.setOnClickListener(this);
        ll_submit_back.setOnClickListener(this);

//        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);

    }

    @Override
    public void onClick(View v) {
        Intent it;
        switch(v.getId()){
            case R.id.ll_submit_back:
                it = new Intent(this,AuthenticationActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                break;

            case R.id.button_submit_number:
                it = new Intent(this,OTPVerificationActivity.class);
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
        Intent it = new Intent(this,AuthenticationActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        finish();
        super.onBackPressed();
    }
}
