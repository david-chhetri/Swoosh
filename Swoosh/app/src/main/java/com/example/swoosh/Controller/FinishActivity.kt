package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

       val  league = intent.getStringExtra(EXTRA_LEAGUE).toString()
       val  skill = intent.getStringExtra(EXTRA_SKILL).toString()

        searchLeaguesText.text = "Looking for $league $skill near you ...."

    }
}
