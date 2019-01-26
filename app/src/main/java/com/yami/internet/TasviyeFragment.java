package com.yami.internet;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.support.constraint.Constraints.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class TasviyeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView TRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_tasviye, container, false);

        String[] TitleArray = new String[tasviye.tasviyyye.length];
        for (int i = 0; i < TitleArray.length; i++) {
            TitleArray[i] = tasviye.tasviyyye[i].getTitle();
        }
        int[] idd = new int[tasviye.tasviyyye.length];
        for (int i = 0; i < idd.length; i++) {
            idd[i] = tasviye.tasviyyye[i].getimageResourceId();
        }
        boolean[] acct = new boolean[tasviye.tasviyyye.length];
        for (int i = 0; i < acct.length; i++) {
            acct[i] = tasviye.tasviyyye[i].getact();
        }
        tasviyeAdapter adapter = new tasviyeAdapter(TitleArray, idd, acct);
        TRecycler.setAdapter(adapter);
       GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        TRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new tasviyeAdapter.Listener() {
            public void onClick(int position) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Amozesh.class);
                    intent.putExtra(Amozesh.EXTRA_Amozesh_ID, position);
                    getActivity().startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Daneshjoyi.class);
                    intent.putExtra(Daneshjoyi.EXTRA_Daneshjoyi_ID, position);
                    getActivity().startActivity(intent);
                }
            }
        });
        return TRecycler;
    }
}
