package com.webwerks.loginexample.api

interface ResultCallBack {
    fun onSuccess(message: String)
    fun onFailure(message: String)
    fun onValidationFailure(message: String)
}