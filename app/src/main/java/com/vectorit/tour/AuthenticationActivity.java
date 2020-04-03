package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class AuthenticationActivity extends AppCompatActivity implements View.OnClickListener {

    //Variables
    ImageView logo;
    TextView welcome,tv_caption;
    Animation top,anti_top,bottom,fade;
    AnimationSet animSet;
    MaterialButton login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        //Hooks
        logo = findViewById(R.id.iv_app_logo);
        welcome = findViewById(R.id.tv_welcome);
        login = findViewById(R.id.button_login_now);
        signup = findViewById(R.id.button_signup);
        tv_caption = findViewById(R.id.tv_caption_auth);

        //Animation
        top = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        fade = AnimationUtils.loadAnimation(this,R.anim.fade_in_from_bottom);

       /* top.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                logo.startAnimation(anti_top);
                welcome.setAnimation(null);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });*/

       /* animSet = new AnimationSet(false);
        animSet.addAnimation(top);
        animSet.addAnimation(bottom);*/

        logo.setAnimation(top);
        welcome.setAnimation(bottom);
        login.setAnimation(fade);
        signup.setAnimation(fade);
        tv_caption.setAnimation(fade);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent it;
        switch (v.getId()){
            case R.id.button_login_now:

                it = new Intent(this,LoginActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                break;

            case R.id.button_signup:

                it = new Intent(this,SignUpPhoneNumber.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                break;

            default:
                break;
        }
    }
}
