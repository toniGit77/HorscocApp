package com.amengu.horscocapp.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.amengu.horscocapp.R
import com.amengu.horscocapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Configuracion para el binding
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Configuracion para el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //inicializar metodos
        iniUi()
    }

    private fun iniUi() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavView.setupWithNavController(navController)
    }
}