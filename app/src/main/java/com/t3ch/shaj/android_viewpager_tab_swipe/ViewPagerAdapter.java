package com.t3ch.shaj.android_viewpager_tab_swipe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Shakil Ahmed Shaj on 22-Jan-19.
 * shakilahmedshaj@gmail.com
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        DemoFragment demoFragment = new DemoFragment();

        i = i + 1;

        Bundle bundle = new Bundle();

        bundle.putString("message", "This is Page : " + i);

        demoFragment.setArguments(bundle);


        return demoFragment;


    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position + 1;

        return "Tab "+position;
    }
}
