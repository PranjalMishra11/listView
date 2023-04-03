package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId", R.drawable.pic1)

        val nameTv = findViewById<TextView>(R.id.TVName)
        val phoneTv = findViewById<TextView>(R.id.TVNumber)
        val imageID = findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text=name
        phoneTv.text = phoneNumber
        imageID.setImageResource(imageId)
    }
}