package com.nayandhabarde.wingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.nayandhabarde.wingo.databinding.ActivityHomeBinding
import com.nayandhabarde.wingo.ui.LeagueFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            supportFragmentManager.commit {
                add(R.id.fragmentContainerView, LeagueFragment())
            }
        }

    }
}