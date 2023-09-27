package com.example.project2664

class Login {
    var username = ""
    var password = ""


    fun loginCheck():Boolean{
        if(username.equals("anas") && password.equals("ipin")){
            return true
        }else{
            return false
        }
    }
}