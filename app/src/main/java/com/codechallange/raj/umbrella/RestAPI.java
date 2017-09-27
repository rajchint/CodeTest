package com.codechallange.raj.umbrella;

import com.codechallange.raj.umbrella.Model.WeatherData;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RestAPI {

    @GET("api/{apiKey}/conditions/hourly/q/{zipCode}.json")
    Call<WeatherData> getAll(@Path("apiKey") String apiKey, @Path("zipCode") String zipCode);
}
