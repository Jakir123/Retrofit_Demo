package com.cse24gmail.jakir.retrofit_demo.rest;

import com.cse24gmail.jakir.retrofit_demo.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by RFsoftLab on 7/12/2016.
 */
public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Part("id") int id, @Query("api_key") String apiKey);
}
