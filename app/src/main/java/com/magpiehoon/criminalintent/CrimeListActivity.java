package com.magpiehoon.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by magpiehoon on 2017. 5. 26..
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
