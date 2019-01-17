package com.webwerks.loginexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResponseData : Serializable {

    @Expose
    @field:SerializedName("status")
    var status: Int? = null
    @Expose
    @field:SerializedName("data")
    var data: User = User()
    @Expose
    @field:SerializedName("message")
    var message: String = ""
    @Expose
    @field:SerializedName("email")
    var user_msg: String = ""
}