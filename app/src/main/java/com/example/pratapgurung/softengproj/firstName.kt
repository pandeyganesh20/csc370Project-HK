package com.example.pratapgurung.softengproj

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_first_name.*
import java.util.*

class firstName : AppCompatActivity() {
    private val db_name = "mydb" // databse name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_name)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }



        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    fun retClientFirstName(view : View){
        val name = findViewById<Button>(R.id.saveBtn).text
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent);

        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }
}
