package com.yami.internet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Fragment fragment = new profilenav();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.profile_content, fragment);
        ft.commit();

    }

    public void resetpass(View view)
    {
        Intent i = new Intent(this, rstpass.class);
        startActivity(i);
    }
    public void resetmobile(View view)
    {
        Intent i = new Intent(this, rstmobile.class);
        startActivity(i);
    }
    public void messbtn(View view)
    {
        Intent i = new Intent(this, inbox.class);
        startActivity(i);
    }
    public void tasviyebtn(View view)
    {
        Intent i = new Intent(this, tasviyeact.class);
        startActivity(i);
    }
    public void shutdown(View view)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
       /* AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("آیا مایلید که از برنامه خارج شوید؟");
        alertDialogBuilder.setIcon(R.drawable.shutdown);
        alertDialogBuilder.setTitle("خروج از برنامه");
                alertDialogBuilder.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                //finishAffinity();
                                //System.exit(0);
                                finish();
                            }
                        });

        alertDialogBuilder.setNegativeButton("خیر",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

          AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        */
        Button yesButton = (Button) dialog.findViewById(R.id.yes);
        yesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button noButton = (Button) dialog.findViewById(R.id.no);
        noButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
    public void help(View view)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.infodialog);
       /* AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("آیا مایلید که از برنامه خارج شوید؟");
        alertDialogBuilder.setIcon(R.drawable.shutdown);
        alertDialogBuilder.setTitle("خروج از برنامه");
                alertDialogBuilder.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                //finishAffinity();
                                //System.exit(0);
                                finish();
                            }
                        });

        alertDialogBuilder.setNegativeButton("خیر",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

          AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        */
        Button yesButton = (Button) dialog.findViewById(R.id.yes);
        yesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
