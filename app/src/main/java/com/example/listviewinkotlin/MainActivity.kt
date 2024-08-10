package com.example.listviewinkotlin


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //array adapter and define array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Maths","Chemistry","Biology","English","Kiswahili"
        )


        //accessing listview from the xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,users)
        mListView.adapter = arrayAdapter
    }
}