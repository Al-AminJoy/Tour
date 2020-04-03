package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    MaterialCardView cv_login_form;
    LinearLayout ll_back;
    TextInputLayout til_phone,til_password;
    MaterialButton login;
    Animation fade_in_from_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hooks
        cv_login_form = findViewById(R.id.cv_login_form);
        ll_back = findViewById(R.id.ll_back);
        til_phone = findViewById(R.id.til_phone_numner);
        til_password = findViewById(R.id.til_password);
        login = findViewById(R.id.button_login);


        //Animation
        fade_in_from_bottom = AnimationUtils.loadAnimation(this,R.anim.fade_in_from_bottom);
        cv_login_form.setAnimation(fade_in_from_bottom);

        login.setOnClickListener(this);
        ll_back.setOnClickListener(this);

//        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
    }

    @Override
    public void onClick(View v) {
        Intent it;
        switch (v.getId()){

            case R.id.ll_back:
                it = new Intent(this,AuthenticationActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                finish();
                break;

            case R.id.button_login:
                it = new Intent(this,HomeActivity.class);
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
