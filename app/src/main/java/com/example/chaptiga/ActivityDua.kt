package com.example.chaptiga

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivityDuaBinding

class ActivityDua : AppCompatActivity() {
    lateinit var binding: ActivityDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWeb.setOnClickListener{
            val move = Intent(Intent.ACTION_VIEW)
            move.data = Uri.parse("https://www.binaracademy.com/")
            startActivity(move)
        }

        //ambil data nama
        val getbundle = intent.extras
        val name = getbundle?.getString("nama")
        binding.tvact2.text = "Haloo " + name


        val getDataStudent = intent.getSerializableExtra("DATASTUDENT") as StudentAndroid
        val nama = getDataStudent.name

        binding.btnSer.text = getDataStudent.name



    }
}