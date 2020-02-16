package com.example.lifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycle.R
import com.example.lifecycle.util.LogError

class MainActivity : AppCompatActivity() {


    private var name: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "onCreate".LogError()
    }

    override fun onStart() {
        super.onStart()

        "onStart".LogError()
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart".LogError()
    }


    override fun onResume() {
        super.onResume()

        "onResume".LogError()
    }

    override fun onPause() {
        super.onPause()

        "onPause".LogError()
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".LogError()
    }

    override fun onStop() {
        super.onStop()

        "onStop".LogError()
    }

    override fun onContentChanged() {
        super.onContentChanged()

        "onContentChanged".LogError()
    }

    override fun onBackPressed() {
        super.onBackPressed()

        "onBackPressed".LogError()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        "onOptionsItemSelected".LogError()

        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        super.onOptionsMenuClosed(menu)

        "onOptionsMenuClosed".LogError()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        "onCreateOptionsMenu".LogError()

        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        "onPrepareOptionsMenu".LogError()

        return super.onPrepareOptionsMenu(menu)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState".LogError()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onCreate".LogError()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        "onSaveInstanceState".LogError()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

        "startActivityForResult".LogError()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction".LogError()
    }
}
