package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.knowledgehub.databinding.ActivityHomeScreenBinding
import java.util.zip.Inflater

class HomeScreen : AppCompatActivity() {
    companion object{
        const val KEY = "com.example.knowledgehub"
    }
    private lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.supportBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "7347290281"))
            startActivity(intent)
        }


        binding.cardAndroid.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "Android")
            startActivity(intent)
        }

        binding.cardWeb.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "Web")
            startActivity(intent)
        }

        binding.cardiOS.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "iOS")
            startActivity(intent)
        }
        binding.cardML.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "ML")
            startActivity(intent)
        }
        binding.cardDev.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "Dev")
            startActivity(intent)
        }

        binding.cardBlock.setOnClickListener {
            intent = Intent(this, KnowMore::class.java)
            intent.putExtra(KEY, "Block")
            startActivity(intent)
        }


    }
}