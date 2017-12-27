package com.androidbie.slidingtabsupportdesign.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.androidbie.slidingtabsupportdesign.fragments.KA;
import com.androidbie.slidingtabsupportdesign.fragments.TI;
import com.androidbie.slidingtabsupportdesign.fragments.SI;
import com.androidbie.slidingtabsupportdesign.fragments.MI;
import com.androidbie.slidingtabsupportdesign.fragments.TK;

/**
 * Created by putuguna on 13/01/17.
 */

public class SlidingTabAdapter extends FragmentStatePagerAdapter {

    public SlidingTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TI();
        }else if(position==1){
            return new SI();
        }else if(position==2){
            return new MI();
        }else if(position==3){
            return new TK();
        }else{
            return new KA();
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
}
