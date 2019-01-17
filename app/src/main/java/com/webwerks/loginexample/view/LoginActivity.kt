package com.webwerks.loginexample.view

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.webwerks.loginexample.R
import com.webwerks.loginexample.api.ResultCallBack
import com.webwerks.loginexample.databinding.ActivityLoginBinding
import com.webwerks.loginexample.model.ResponseData
import com.webwerks.loginexample.model.User
import com.webwerks.loginexample.model.UserCredentials
import com.webwerks.loginexample.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity(), ResultCallBack {


    override fun onValidationFailure(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    override fun onFailure(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private var activity: Activity? = null
    private var binding: ActivityLoginBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        activity = this
        val loginViewModel = LoginViewModel(this)
        binding!!.setLoginData(loginViewModel)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

    }

}


