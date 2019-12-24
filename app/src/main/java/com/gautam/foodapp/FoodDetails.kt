package com.gautam.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        var bundle = intent.extras

        if (bundle != null) {
            imgDisplay.setImageResource(bundle.getInt("img"))
            descDisplay.text = bundle.getString("desc")
            namDisplay.text = bundle.getString("name")
        }
    }
}
