package com.develop.kunakorn.smartclinic.home.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.develop.kunakorn.smartclinic.R;

public class HomePresenterImpl extends AppCompatActivity implements HomePresenterInterface {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initPresenter();
        initView();
    }

    private void initPresenter() {
    }

    private void initView() {
    }

    @Override
    public void callListData() {

    }
}
