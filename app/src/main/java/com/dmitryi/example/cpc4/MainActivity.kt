package com.dmitryi.example.cpc4

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Есть 2 варианта решения задачи. Ниже будет представлен только 1 вариант на мой выбор.
        val letters = ('A'..'Z').toList()
        Log.d(TAG,"${letters}\n")
        for(i in letters.indices step(2)) {
            Log.d(TAG, "${letters[i + 1]}\t")
        }
    }
}