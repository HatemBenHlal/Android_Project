package com.vogella.imdbtopratedmovies.api;


import com.vogella.imdbtopratedmovies.models.Result;
import com.vogella.imdbtopratedmovies.models.TopRatedMovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface MovieService {

    @GET("movie/top_rated")
    Call<TopRatedMovies> getTopRatedMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language,
                @Query("page") int pageIndex
    );

    @GET("movie/{id}")
    Call<Result> getDetailsById(
            @Path("id") int id,
            @Query("api_key") String apiKey

    );

}
