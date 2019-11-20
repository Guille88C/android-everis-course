package com.everis.myapplication.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.everis.myapplication.R
import com.everis.myapplication.global.GlobalActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etLogin?.doAfterTextChanged {
            bLogin.isEnabled = !it.isNullOrEmpty()
        }

        bLogin?.setOnClickListener {
            startActivity(Intent(this, GlobalActivity::class.java))
        }
    }
}
