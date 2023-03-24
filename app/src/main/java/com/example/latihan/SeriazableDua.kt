package com.example.latihan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivitySeriazableDuaBinding

class SeriazableDua : AppCompatActivity() {
    lateinit var binding: ActivitySeriazableDuaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeriazableDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contact = intent.getSerializableExtra("contact") as? SeriazableSatu.Contact

        binding.tvName.text = "Name: ${contact?.name}"
        binding.tvEmail.text = "Email: ${contact?.email}"
        binding.tvPhone.text = "Phone: ${contact?.phone}"
        binding.tvAddress.text = "Address: ${contact?.address}"
        binding.tvAge.text = "Age: ${contact?.age}"
    }
}
