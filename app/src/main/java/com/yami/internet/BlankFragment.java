package com.yami.internet;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView inboxRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_inbox, container, false);
        String[] inboxTitle = new String[messages.mess.length];
        for (int i = 0; i < inboxTitle.length; i++) {
            inboxTitle[i] = messages.mess[i].getTitle();
        }
        String[] inboxContent = new String[messages.mess.length];
        for (int i = 0; i < inboxContent.length; i++) {
            inboxContent[i] = messages.mess[i].getContent();
        }
        inboxAdapter adapter = new inboxAdapter(inboxTitle, inboxContent);
        inboxRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        inboxRecycler.setLayoutManager(layoutManager);
        return inboxRecycler;
    }

}
