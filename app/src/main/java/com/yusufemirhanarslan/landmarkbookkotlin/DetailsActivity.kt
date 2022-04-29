package com.yusufemirhanarslan.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusufemirhanarslan.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.yusufemirhanarslan.landmarkbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intent = intent
        //casting
        val selectedLandMark = intent.getSerializableExtra("landmark") as Landmark


        binding.nameText.text = selectedLandMark.name
        binding.countryText.text = selectedLandMark.country
        binding.imageView.setImageResource(selectedLandMark.image)

    }
}