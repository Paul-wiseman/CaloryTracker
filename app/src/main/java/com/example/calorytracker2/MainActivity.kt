package com.example.calorytracker2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.plcoding.calorytracker.ui.theme.CaloryTrackerTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
               WelcomeScreen()
            }
        }
    }
}