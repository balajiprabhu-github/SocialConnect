package com.balajiprabhu.socialconnect.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.balajiprabhu.socialconnect.R;
import com.balajiprabhu.socialconnect.databinding.ActivityMainBinding;
import com.balajiprabhu.socialconnect.view_model.ContactsViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    ContactsViewModel contactsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidInjection.inject(this);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        this.getLifecycle().addObserver(contactsViewModel);

        RecyclerViewAdapter recyclerViewAdapter = contactsViewModel.setRecyclerViewAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        activityMainBinding.recyclerView.setLayoutManager(linearLayoutManager);
        activityMainBinding.recyclerView.setHasFixedSize(true);

        activityMainBinding.recyclerView.setAdapter(recyclerViewAdapter);


    }
}
