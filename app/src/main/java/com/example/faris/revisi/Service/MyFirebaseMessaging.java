package com.example.faris.revisi.Service;

import android.content.Intent;

import com.example.faris.revisi.CustomerCall;
import com.example.faris.revisi.Model.NotifikasiModel;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;

public class MyFirebaseMessaging extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        //Because i will send
        //LatLng customer_location = new Gson().fromJson(remoteMessage.getNotification().getBody(),LatLng.class);
        NotifikasiModel customer_location = new Gson().fromJson(remoteMessage.getNotification().getBody(),NotifikasiModel.class);

        Intent intent = new Intent(getBaseContext(),CustomerCall.class);
        intent.putExtra("lat",customer_location.latitude);
        intent.putExtra("lng",customer_location.longitude);
        intent.putExtra("phone",customer_location.phone);
        intent.putExtra("customer",remoteMessage.getNotification().getTitle());

        startActivity(intent);
    }
}
