package com.islamxpro.crazy_puzzle

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.islamxpro.mark.n_puzzle.Back.isHome

lateinit var handler: Handler
private lateinit var music: MediaPlayer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        handler = Handler()
        music = MediaPlayer.create(this,R.raw.load_music)
        music.start()
        isHome = false
        handler.postDelayed({
            startActivity(Intent(this,PuzzleActivity::class.java))
            music.stop()
        },3000)
    }
}