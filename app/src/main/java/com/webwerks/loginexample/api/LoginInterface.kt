package com.webwerks.loginexample.api

import com.webwerks.loginexample.model.ResponseData
import com.webwerks.loginexample.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginInterface {
    @POST("users/login")
    @FormUrlEncoded
    fun authenticate(@Field("email") email:String,
                     @Field("password") password:String): Call<ResponseData>
}