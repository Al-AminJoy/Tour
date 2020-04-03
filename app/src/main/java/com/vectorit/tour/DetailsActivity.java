package com.vectorit.tour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DetailsActivity extends AppCompatActivity {
  private ViewPager vpDetails;
  private TabLayout tlDetails;
  private  PostDetailsViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        idFinder();
        viewPagerAdapter=new PostDetailsViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new PostDetailsFragment(),"Details");
        viewPagerAdapter.addFragment(new PhotosFragment(),"Photo");
        viewPagerAdapter.addFragment(new VideoFragment(),"Video");
        viewPagerAdapter.addFragment(new ReviewFragment(),"Review");
        vpDetails.setAdapter(viewPagerAdapter);
        tlDetails.setupWithViewPager(vpDetails);
    }

    private void idFinder() {
        tlDetails=findViewById(R.id.tlDetailsId);
        vpDetails=findViewById(R.id.vpDetailsId);
    }
}
