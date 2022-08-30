package com.slotz.ggdrop

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.androidbrowserhelper.trusted.TwaLauncher

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        jlkfwefwe()
    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun jlkfwefwe(){
        val ojwerwewf = intent.getStringExtra("url")
        val ppwqwqww = TwaLauncher(this)
        ppwqwqww.launch(Uri.parse(ojwerwewf))
    }
}