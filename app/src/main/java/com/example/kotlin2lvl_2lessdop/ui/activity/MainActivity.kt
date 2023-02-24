package com.example.kotlin2lvl_2lessdop.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin2lvl_2lessdop.R
import com.example.kotlin2lvl_2lessdop.databinding.ActivityMainBinding
import com.example.kotlin2lvl_2lessdop.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager){
            tab, position ->
            when(position){
                0 -> {
                    tab.text = "first"
                }
                1 -> {
                    tab.text = "second"
                }
            }
        }.attach()
    }
}