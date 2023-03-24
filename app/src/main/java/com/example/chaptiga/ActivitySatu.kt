package com.example.chaptiga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivitySatuBinding


class ActivitySatu : AppCompatActivity() {
    lateinit var binding: ActivitySatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSatu.setOnClickListener {
            val bundle = Bundle()
            val move = Intent(this, ActivityDua::class.java)
            val namaStudent = binding.etName.text.toString()
            bundle.putString("nama", "Andika")
            bundle.putInt("umur", 23)
            move.putExtras(bundle)
            startActivity(move)
        }
        val bund = Bundle().apply {
            putString("name","andika")
        }
    }
}