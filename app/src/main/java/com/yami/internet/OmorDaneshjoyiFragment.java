package com.yami.internet;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OmorDaneshjoyiFragment extends Fragment {


    public OmorDaneshjoyiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView ORecycler = (RecyclerView)inflater.inflate(
                R.layout.omordaneshjoyifragment, container, false);
        String[] TitleArray = new String[Omordaneshjoyi.omor.length];
        for (int i = 0; i < TitleArray.length; i++) {
            TitleArray[i] = Omordaneshjoyi.omor[i].getTitle();
        }
        int[] idd = new int[Omordaneshjoyi.omor.length];
        for (int i = 0; i < idd.length; i++) {
            idd[i] = Omordaneshjoyi.omor[i].getImageResourceId();
        }
        boolean[] acct = new boolean[Omordaneshjoyi.omor.length];
        for (int i = 0; i < acct.length; i++) {
            acct[i] = Omordaneshjoyi.omor[i].getact();
        }
        OmorDaneshjoyiAdaptor adapter = new OmorDaneshjoyiAdaptor(TitleArray, idd, acct);
        ORecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        ORecycler.setLayoutManager(layoutManager);
        return ORecycler;
    }

}
