package com.annamorgiel.popularmovies4udacity.rest.service;

import android.graphics.Movie;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Anna Morgiel on 17.04.2017.
 */

public interface MovieService {

    @GET("/movie/{sortby}?api_key")
    Call<ArrayList<Movie>> getMovies(
            @Path("sortby") String sortby,
            @Query("apiKey") String apiKey);
}
