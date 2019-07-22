package com.balajiprabhu.socialconnect.view_model;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import com.balajiprabhu.socialconnect.R;
import com.balajiprabhu.socialconnect.ui.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ContactsViewModel extends ViewModel implements LifecycleObserver {

    private RecyclerViewAdapter recyclerViewAdapter;
    private List<ItemContactViewModel> itemContactViewModelList = new ArrayList<>();

    @Inject
    public ContactsViewModel() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void init() {

        createContacts();

    }


    public RecyclerViewAdapter setRecyclerViewAdapter(){
        return recyclerViewAdapter = new RecyclerViewAdapter(itemContactViewModelList);
    }

    private void createContacts() {

        ItemContactViewModel itemContactViewModel = new ItemContactViewModel();
        itemContactViewModel.setContactType(0);
        itemContactViewModel.setName("Ram");
        itemContactViewModel.setProfilePicId(R.drawable.ic_launcher_background);
        itemContactViewModel.setViberId("V008");
        itemContactViewModel.setLastSeenTime("2 mins ago");
        itemContactViewModelList.add(itemContactViewModel);

        ItemContactViewModel itemContactViewModel2 = new ItemContactViewModel();
        itemContactViewModel2.setContactType(1);
        itemContactViewModel2.setName("Suresh");
        itemContactViewModel2.setAvailabilityStatusResId(R.drawable.ic_launcher_foreground);
        itemContactViewModelList.add(itemContactViewModel2);


        ItemContactViewModel itemContactViewModel1 = new ItemContactViewModel();
        itemContactViewModel1.setContactType(2);
        itemContactViewModel1.setName("Ramesh");
        itemContactViewModel1.setEmail("ramesh@ford.com");
        itemContactViewModelList.add(itemContactViewModel1);



    }


}
