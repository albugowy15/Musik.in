package com.bughowi.musikin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_author)

        supportActionBar?.hide()
    }
}