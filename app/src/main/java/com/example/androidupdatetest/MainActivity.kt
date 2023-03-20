package com.example.androidupdatetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display
import com.github.javiersantos.appupdater.enums.UpdateFrom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appUpdater = AppUpdater(this)
            .setUpdateFrom(UpdateFrom.JSON)
            .setUpdateJSON("https://raw.githubusercontent.com/drimaes-wade/AndroidAutoUpdateTest/main/app/update.json")
            .setDisplay(Display.DIALOG)
            .showAppUpdated(true)
            .start()
    }
}