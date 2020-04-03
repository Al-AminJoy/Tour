package com.vectorit.tour;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PostDetailsViewPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> fragmentList=new ArrayList<>();
    private final ArrayList<String> titleList=new ArrayList<>();
    public PostDetailsViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
