package com.slotz.ggdrop

import android.app.Application
import android.content.Intent
import com.onesignal.OneSignal


class OneSignalApp : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(appId)
        OneSignal.setNotificationOpenedHandler { result ->
            startActivity(Intent(this@OneSignalApp,WebViewActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                .putExtra("url",result.notification.launchURL.toString())
            )
        }
    }

    companion object{
        const val appId = "bd250581-3962-4619-a8bc-8d2c14fe2091"
    }
}