package com.example.notificationplayground

import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseInstanceIDService: FirebaseMessagingService() {
    override fun onNewToken(newToken: String) {
        super.onNewToken(newToken)
    }
}