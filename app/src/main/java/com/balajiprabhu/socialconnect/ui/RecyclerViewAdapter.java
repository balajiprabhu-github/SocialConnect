package com.balajiprabhu.socialconnect.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.balajiprabhu.socialconnect.databinding.ItemContactGoogleDuoBinding;
import com.balajiprabhu.socialconnect.databinding.ItemContactViberBinding;
import com.balajiprabhu.socialconnect.databinding.ItemContactWhatsappBinding;
import com.balajiprabhu.socialconnect.view_model.ItemContactViewModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemContactViewModel> itemContactViewModelList;

    public RecyclerViewAdapter(List<ItemContactViewModel> itemContactViewModelList) {
        this.itemContactViewModelList = itemContactViewModelList;
    }


    @Override
    public int getItemViewType(int position) {
        return itemContactViewModelList.get(position).getContactType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType){

            case 0:
                LayoutInflater viberLayoutInflater = LayoutInflater.from(parent.getContext());
                ItemContactViberBinding itemContactViberBinding = ItemContactViberBinding.inflate(viberLayoutInflater, parent, false);
                return new ViberViewHolder(itemContactViberBinding);

            case 1:

                LayoutInflater whatsappLayoutInflater = LayoutInflater.from(parent.getContext());
                ItemContactWhatsappBinding itemContactWhatsappBinding = ItemContactWhatsappBinding.inflate(whatsappLayoutInflater, parent, false);
                return new WhatsAppViewHolder(itemContactWhatsappBinding);

            case 2:

                LayoutInflater googleDuoLayoutInflater = LayoutInflater.from(parent.getContext());
                ItemContactGoogleDuoBinding itemContactGoogleDuoBinding = ItemContactGoogleDuoBinding.inflate(googleDuoLayoutInflater, parent, false);
                return new GoogleDuoViewHolder(itemContactGoogleDuoBinding);


        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()){

            case 0:
                ViberViewHolder viberViewHolder = (ViberViewHolder)holder;
                ItemContactViewModel itemWeatherViewModel = itemContactViewModelList.get(position);
                viberViewHolder.bind(itemWeatherViewModel);
                break;

            case 1:
                WhatsAppViewHolder whatsAppViewHolder = (WhatsAppViewHolder) holder;
                ItemContactViewModel itemWeatherViewModel1 = itemContactViewModelList.get(position);
                whatsAppViewHolder.bind(itemWeatherViewModel1);
                break;

            case 2:
                GoogleDuoViewHolder googleDuoViewHolder = (GoogleDuoViewHolder)holder;
                ItemContactViewModel itemWeatherViewModel2 = itemContactViewModelList.get(position);
                googleDuoViewHolder.bind(itemWeatherViewModel2);
                break;

        }

    }

    @Override
    public int getItemCount() {
        return itemContactViewModelList.size();
    }



    public class ViberViewHolder extends RecyclerView.ViewHolder {

        ItemContactViberBinding  itemContactViberBinding;

        public ViberViewHolder(@NonNull  ItemContactViberBinding  itemContactViberBinding) {
            super(itemContactViberBinding.getRoot());
            this.itemContactViberBinding = itemContactViberBinding;
        }

        public void bind(ItemContactViewModel itemContactViewModel) {

            itemContactViberBinding.setViewModel(itemContactViewModel);
            itemContactViberBinding.executePendingBindings();
        }
    }

    public class WhatsAppViewHolder extends RecyclerView.ViewHolder {

        ItemContactWhatsappBinding itemContactWhatsappBinding;

        public WhatsAppViewHolder(@NonNull ItemContactWhatsappBinding itemContactWhatsappBinding) {
            super(itemContactWhatsappBinding.getRoot());
            this.itemContactWhatsappBinding = itemContactWhatsappBinding;
        }

        public void bind(ItemContactViewModel itemContactViewModel) {

            itemContactWhatsappBinding.setViewModel(itemContactViewModel);
            itemContactWhatsappBinding.executePendingBindings();
        }
    }


    public class GoogleDuoViewHolder extends RecyclerView.ViewHolder {

        ItemContactGoogleDuoBinding itemContactGoogleDuoBinding;

        public GoogleDuoViewHolder(@NonNull ItemContactGoogleDuoBinding itemContactGoogleDuoBinding) {
            super(itemContactGoogleDuoBinding.getRoot());
            this.itemContactGoogleDuoBinding = itemContactGoogleDuoBinding;
        }

        public void bind(ItemContactViewModel itemContactViewModel) {

            itemContactGoogleDuoBinding.setViewModel(itemContactViewModel);
            itemContactGoogleDuoBinding.executePendingBindings();
        }
    }





}
