package com.example.lemondohomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lemondohomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        setupBottomNavigationMenu()
    }

    //For bottom nav
    private fun setupBottomNavigationMenu() {
        binding.bottomNavigation.setupWithNavController(binding.lemondoNavHostFragment.findNavController())
    }

}