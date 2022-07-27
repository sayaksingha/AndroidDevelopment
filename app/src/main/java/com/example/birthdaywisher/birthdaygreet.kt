package com.example.birthdaywisher


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreet.*

class birthdaygreet : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreet)
        val name=intent.getStringExtra(NAME_EXTRA)
        textView11.text="HAPPY BIRTHDAY $name"
    }
}
//<SAYAK_SINHGA>