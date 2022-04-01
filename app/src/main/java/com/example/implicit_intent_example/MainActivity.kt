package com.example.implicit_intent_example

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var numb : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCall = findViewById<Button>(R.id.btnCall)
        val txtPhoneNum = findViewById<EditText>(R.id.txtPhoneNum)
        numb = txtPhoneNum.text.toString()

    }
    fun clickMe (view: View){
        // make a phone call
        val number : Uri = Uri.parse("tel:"+numb)
        val callIntent : Intent = Intent(Intent.ACTION_DIAL, number)
        startActivity(callIntent)
    }
}