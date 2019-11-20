package com.everis.myapplication.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // TODO: Enable button when etLogin has non empty text
        // Use doAfterTextChanged function from etLogin

        bLogin?.setOnClickListener {
            // TODO: Navigate to GlobalActivity.
            // Use startActivity() function
        }
    }
}
