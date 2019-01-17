package com.webwerks.loginexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class User : Serializable{

    @Expose
    @field:SerializedName("role_id")
    var roleId: Int? = null
    @Expose
    @field:SerializedName("first_name")
    var firstName: String = ""
    @Expose
    @field:SerializedName("last_name")
    var last_name: String = ""
    @Expose
    @field:SerializedName("email")
    var email: String = ""
    @Expose
    @field:SerializedName("username")
    var username: String = ""
    @Expose
    @field:SerializedName("profile_pic")
    var profile_pic: String = ""
    @Expose
    @field:SerializedName("country_id")
    var country_id: String = ""
    @Expose
    @field:SerializedName("gender")
    var gender: String = ""
    @Expose
    @field:SerializedName("phone_no")
    var phone_no: String = ""
    @Expose
    @field:SerializedName("dob")
    var dob: String = ""
    @Expose
    @field:SerializedName("is_active")
    var is_active: Boolean = false
    @Expose
    @field:SerializedName("created")
    var created: Date? = null
    @Expose
    @field:SerializedName("modified")
    var modified: Date? = null
    @Expose
    @field:SerializedName("access_token")
    var access_token: String = ""

}