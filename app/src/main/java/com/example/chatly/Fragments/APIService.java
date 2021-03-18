package com.example.chatly.Fragments;

import com.example.chatly.Notifications.MyResponse;
import com.example.chatly.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers (
        {
            "Content-Type:application/json",
            "Authorization:key=AAAAiOxH6ZI:APA91bEJtZ9Au-mZ4n9i425k0G0fekJylYV5Gs1UAYDB4VdxoR1iJhLzT9FU2LVn-zbBPbK8CSuDCFiXUHyng-_EfGzckhV99fpqlLInojX7ZdqOi0-d6LGqmASkG-FLfBYCjaIeFQlZ"
        }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
