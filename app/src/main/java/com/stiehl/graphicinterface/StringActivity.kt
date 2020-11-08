package com.stiehl.graphicinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_string.*

class StringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        btOK.setOnClickListener { showMessage(txtName.text.toString()) }
    }

    private fun showMessage(name: String) {
        lbMessage.text = getString(R.string.welcome_message, name, 32)
    }
}