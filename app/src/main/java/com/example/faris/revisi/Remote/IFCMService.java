package com.example.faris.revisi.Remote;

import com.example.faris.revisi.Model.FCMResponse;
import com.example.faris.revisi.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA8gfDQnc:APA91bGDdaZcNVqOH0DyPQP6M6QhT0qSd-5DXpaptKFNpr-r17qlWYDvZ5Sfh5y8QXFwyhv7wPYe0xXBwNH50NF6BtsWUXNERbWgD7KTJwZ8VrHjZaxC24vH1S_a8Kf9e_fVwTBXeyGf"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
