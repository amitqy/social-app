package com.example.socialapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.socialapp.R
import com.example.socialapp.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postDao: PostDao
    private lateinit var postButton : Button
    private lateinit var postInput : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        postDao = PostDao()
        postInput = findViewById(R.id.postInput)
        postButton = findViewById(R.id.postButton)
        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }
        }
    }

}