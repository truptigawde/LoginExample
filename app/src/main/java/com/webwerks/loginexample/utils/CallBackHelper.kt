package com.webwerks.loginexample.utils

import com.webwerks.loginexample.api.ResultCallBack
import com.webwerks.loginexample.model.ResponseData
import com.webwerks.loginexample.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class CallBackHelper(private val listner: ResultCallBack) : Callback<ResponseData> {
    override fun onFailure(call: Call<ResponseData>?, t: Throwable?) {
        listner.onFailure("failure")

    }

    override fun onResponse(call: Call<ResponseData>?, response: Response<ResponseData>?) {

    }
}