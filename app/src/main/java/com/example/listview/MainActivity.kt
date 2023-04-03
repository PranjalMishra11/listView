package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Small Baby","Modi ji", "Leonel Messi","Virat Kohli", "Dwane Johnson")

        val lastMsg =  arrayOf("I am 2 years old","I am PM of India","I am GOAT","I have 75 int 100's", "I am Rock")

        val lstMsgTime = arrayOf("4:45 PM" , "6:25 PM" , "7:10 PM", "7:15 AM","6:30 PM")

        val phoneNumber = arrayOf("7668465489" , "8888899999", "9010101010", "9818181818","9876543210")

        val imgId = arrayOf(R.drawable.pic1, R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5)

        userArrayList = ArrayList()

        for (i in name.indices){
            val user = User(name[i], lastMsg[i], lstMsgTime[i],phoneNumber[i],imgId[i])

            userArrayList.add(user)
        }

        val listview = findViewById<ListView>(R.id.listView)
        listview.isClickable= true
        listview.adapter= MyAdapter(this, userArrayList)

        listview.setOnItemClickListener { parent, view, position, id ->
            val userName = name[position]
            val userPhone = phoneNumber[position]
            val imageId = imgId[position]

            val i =Intent(this, UserActivity::class.java)


            i.putExtra("name",userName)
            i.putExtra("phone",userPhone)
            i.putExtra("imageId",imageId)
            startActivity(i)

        }
    }
}