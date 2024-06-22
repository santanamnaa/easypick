package com.example.easypick

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.easypick.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentReplace(HomeFragment())


        binding.buttonNavigation.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home ->fragmentReplace(HomeFragment())
                R.id.order ->fragmentReplace(OrderFragment())
                R.id.account ->fragmentReplace(AccountFragment())

                else ->{

                }

            }
            true

        }

    }

    private fun fragmentReplace(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}
