package com.example.birthdaywisher


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createBirthdayButton.setOnClickListener{
            val name =nameInput.editableText.toString()
            Toast.makeText(this, " hi $name", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this , "happy birthday $name", Toast.LENGTH_SHORT).show()
            val sa21=Intent(this,birthdaygreet::class.java)


            sa21.putExtra(birthdaygreet.NAME_EXTRA,name)
            startActivity(sa21)
        }

    }

//<SAYAK_SINHGA>

}