package com.tutorials.hp.swpeandclicktabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hp on 3/22/2016.
 */
public class DocumentaryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.documentary_fragment,null);

        return rootView;
    }

    @Override
    public String toString() {
        return "Documentary";
    }
}
