package com.example.faris.revisi.Common;

import android.location.Location;

import com.example.faris.revisi.Model.User;
import com.example.faris.revisi.Remote.FCMClient;
import com.example.faris.revisi.Remote.IFCMService;
import com.example.faris.revisi.Remote.IGoogleApi;
import com.example.faris.revisi.Remote.RetrofitClient;

public class Common {


    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static User currentUser;

    public static Location mLastLocation=null;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IGoogleApi getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
