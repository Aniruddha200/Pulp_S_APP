package com.example.pulpsapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.sapereaude.maskedEditText.MaskedEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var editText: MaskedEditText? = findViewById(R.id.edit_Text)
        var show: Button? = null

//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun showText(v: View) {
            Toast.makeText(this, "${editText?.getText()}", Toast.LENGTH_LONG).show()
        }

    }
}