package com.example.myrestaurantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    private val splashTime = 3000L
    private lateinit var myHandler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        myHandler = Handler()

        myHandler.postDelayed({
            gotoLoginActivity()
        }, splashTime)
    }

    private fun gotoLoginActivity(){

        val loginActivityIntent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(loginActivityIntent)
        finish()
    }
}
