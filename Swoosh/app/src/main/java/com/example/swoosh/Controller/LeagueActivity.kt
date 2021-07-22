package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        if (savedInstanceState != null) {
            super.onRestoreInstanceState(savedInstanceState)
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(player.league.isEmpty()){
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
            return
        }
        val skillActivity = Intent(this, SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_PLAYER, player)
        startActivity(skillActivity)
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked=false
        player.league = "mens"

    }


    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked=false
        player.league = "womens"

    }

    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked=false
        player.league = "co-ed"

    }






}
