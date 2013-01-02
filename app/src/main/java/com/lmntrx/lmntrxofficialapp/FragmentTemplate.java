package com.lmntrx.lmntrxofficialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/***
 * Created by livin on 7/4/16.
 */
public class FragmentTemplate extends Fragment {

    static String arr[] = new String[50];
    static int i=0;

    public static FragmentTemplate newFragment(String text){
        /*Bundle stuff=new Bundle();
        stuff.putString("TXT", text);
        template.setArguments(stuff);*/

        arr[i++]=text;

        return new FragmentTemplate();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank,container,false);
        ((TextView) view.findViewById(R.id.sampleTxt)).setText(arr[getArguments().getInt("FragmentPagerItem:Position")]);
        return view;

    }
}
