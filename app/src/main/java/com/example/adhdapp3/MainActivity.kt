package com.example.adhdapp3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home_screen.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(SavedInstanceState: Bundle?){
        super.onCreate(SavedInstanceState)
        setContentView(R.layout.login_screen)

        val loginBtn = findViewById<Button>(R.id.Login_Button)

    loginBtn.setOnClickListener{
        loginBtn.isEnabled = false
        loginBtn.postDelayed(Runnable { loginBtn.isEnabled = true }, 300)
            val intent = Intent(this, com.example.adhdapp3.homeScreen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
        val signBtn = findViewById<Button>(R.id.SignUp_Button)

        signBtn.setOnClickListener{
            signBtn.isEnabled = false
            signBtn.postDelayed(Runnable { signBtn.isEnabled = true }, 300)
            val intent = Intent(this, com.example.adhdapp3.homeScreen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

        }



}
}

