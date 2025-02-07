package com.su.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.su.myapplication.fragment.PostListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, PostListFragment())
            .commit()
    }
}