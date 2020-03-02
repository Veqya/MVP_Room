package com.luseen.mvp_room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.luseen.mvp_room.MVP_view.LoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , LoginView {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Fragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment=new MainFragment();
        initFragment(mainFragment,"main");
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void loginValidations() {

    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginError() {

    }

    @Override
    public void initFragment(Fragment mFragment, String tag) {
        FragmentManager manager;
        FragmentTransaction mTransaction;
        manager = getSupportFragmentManager();
        mTransaction = manager.beginTransaction();
        mTransaction.add(R.id.fragment_conteyner, mFragment, tag).commit();
    }
}
