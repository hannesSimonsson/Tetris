package com.example.tego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView


const val EXTRA_MESSAGE = "com.example.Tego.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declare animation
        val logoAnim = AnimationUtils.loadAnimation(this, R.anim.logo)
        val repeatLogoAnim = AnimationUtils.loadAnimation(this, R.anim.inf_logo)

        val tegoLogo = findViewById<ImageView>(R.id.logotype)

        // set animation
        var logoSet = AnimationSet(true)
        logoSet.addAnimation(logoAnim)
        logoSet.addAnimation(repeatLogoAnim)
        tegoLogo.startAnimation(logoSet)
        //tegoLogo.startAnimation(logoAnim)
        //tegoLogo.startAnimation(repeatLogoAnim)

    }

 /*   fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
*/
    fun playGame(view: View) {
        val intent = Intent(this, GamePlatform::class.java)
        startActivity(intent)
    }
}
