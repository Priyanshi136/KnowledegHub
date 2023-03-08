package com.example.knowledgehub

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.knowledgehub.databinding.ActivityHomeScreenBinding
import com.example.knowledgehub.databinding.ActivityKnowMoreBinding

class KnowMore : AppCompatActivity() {

    private lateinit var binding: ActivityKnowMoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKnowMoreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val wht: String? = intent.getStringExtra(HomeScreen.KEY)

        when (wht) {
            "Android" -> {
                binding.tVHeading.text = "Android App Development"
                binding.cardView1.text = "Kotlin"
                binding.cardView2.text = "XML"
                binding.cardView3.text = "Firebase"
                binding.cardView4.text = "Database"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://developer.android.com/")
                    startActivity(intent)
                }
            }
            "Web" -> {
                binding.tVHeading.text = "Web Development"
                binding.cardView1.text = "HTML"
                binding.cardView2.text = "CSS"
                binding.cardView3.text = "JavaScript"
                binding.cardView4.text = "SQL"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://en.wikipedia.org/wiki/Web_development")
                    startActivity(intent)
                }
            }
            "iOS" -> {
                binding.tVHeading.text = "iOS App Development"
                binding.cardView1.text = "Swift"
                binding.cardView2.text = "XCode"
                binding.cardView3.text = "BackEnd"
                binding.cardView4.text = "GitHub"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://developer.apple.com/tutorials/app-dev-training")
                    startActivity(intent)
                }
            }
            "ML" -> {
                binding.tVHeading.text = "Machine Learning"
                binding.cardView1.text = "Maths"
                binding.cardView2.text = "Python"
                binding.cardView3.text = "NLP"
                binding.cardView4.text = "Networks"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://en.wikipedia.org/wiki/Machine_learning")
                    startActivity(intent)
                }
            }
            "Dev" -> {
                binding.tVHeading.text = "DevOps"
                binding.cardView1.text = "Ruby"
                binding.cardView2.text = "Version Control"
                binding.cardView3.text = "Linux"
                binding.cardView4.text = "Javascript"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://en.wikipedia.org/wiki/DevOps")
                    startActivity(intent)
                }
            }
            else -> {
                binding.tVHeading.text = "BlockChain"
                binding.cardView1.text = "Cryptography"
                binding.cardView2.text = "Database"
                binding.cardView3.text = "Networking"
                binding.cardView4.text = "Python"
                binding.moreBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://en.wikipedia.org/wiki/Blockchain")
                    startActivity(intent)
                }
            }
        }
    }
}