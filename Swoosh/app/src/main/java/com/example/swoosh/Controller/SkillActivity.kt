package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        //println(league)
        finishBtn.setOnClickListener {
            if(skill.isEmpty()){
                Toast.makeText(this,"Select skill level.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL,skill)
            startActivity(finishIntent)
        }
    }

    fun onBeginnerSkillClick(view: View){

        ballerSkillBtn.isChecked = false
        skill ="beginner"

    }

    fun onBallerSkillClick(view: View){

        beginnerSkillBtn.isChecked = false
        skill = "baller"

    }
}
