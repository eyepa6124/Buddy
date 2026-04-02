package com.buddyapp.Buddy

import android.app.Application
import com.chaquo.python.android.AndroidPlatform
import com.chaquo.python.Python

class BuddyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start the embedded Python interpreter once when app launches
        if (!Python.isStarted()) {
            Python.start(AndroidPlatform(this))
        }
    }
}
