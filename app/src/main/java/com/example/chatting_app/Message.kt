package com.example.chatting_app

//import android.content.IntentSender
//import android.security.identity.AccessControlProfileId

class Message {
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message = message
        this.senderId = senderId
    }
}