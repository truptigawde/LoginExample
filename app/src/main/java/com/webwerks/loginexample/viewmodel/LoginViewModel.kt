package com.webwerks.loginexample.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View
import com.webwerks.loginexample.BR
import com.webwerks.loginexample.api.ApiClient
import com.webwerks.loginexample.api.LoginInterface
import com.webwerks.loginexample.api.ResultCallBack
import com.webwerks.loginexample.model.ResponseData
import com.webwerks.loginexample.model.User
import com.webwerks.loginexample.model.UserCredentials
import com.webwerks.loginexample.utils.CallBackHelper
import com.webwerks.loginexample.view.LoginActivity
import retrofit2.Call
import retrofit2.Response

class LoginViewModel(private val listner: ResultCallBack) : BaseObservable() {


    val userCredentials: UserCredentials

    @get:Bindable
    var dataEmail: String? = null
        set(email) {
            field = email
            userCredentials.email = email
            notifyPropertyChanged(BR.dataEmail)
        }

    @get:Bindable
    var dataPassword: String? = null
        set(password) {
            field = password
            userCredentials.password = password
            notifyPropertyChanged(BR.dataPassword)
        }

    init {
        this.userCredentials = UserCredentials()
    }

    fun onLoginButtonClicked(): View.OnClickListener {
        return View.OnClickListener { view ->

            if (isValidData()) {
                callApi()

            } else {
                listner.onValidationFailure("please enter valid email and password")
            }
        }
    }

    private fun callApi() {

        val apiService = ApiClient.getClient().create(LoginInterface::class.java)
        val call = apiService.authenticate(userCredentials.email!!, userCredentials.password!!)
        call.enqueue(object : CallBackHelper(listner) {
            override fun onResponse(call: Call<ResponseData>?, response: Response<ResponseData>?) {

                var user: User = response?.body()?.data!!
                listner.onSuccess("success")
            }
        })
    }

    fun isValidData(): Boolean {
        return !(dataEmail.isNullOrEmpty() && dataPassword.isNullOrEmpty())
    }


}