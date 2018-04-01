package com.example.khimi.igustipututresnanata_1202150025_modul6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NewPostFragment();
            case 1:
                return new MyPostFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return  mNumOfTabs;
    }
}
