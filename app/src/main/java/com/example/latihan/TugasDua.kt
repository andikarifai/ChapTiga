package com.example.latihan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivityTugasDuaBinding
import java.util.*

class TugasDua : AppCompatActivity() {
    lateinit var binding: ActivityTugasDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugasDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ambil data nama
        val getbundle = intent.extras
        val name = getbundle?.getString("nama")
        val umur = getbundle?.getInt("tahunLahir")
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - umur!!

        binding.tvName.text = "Nama: $name"
        binding.tvAge.text = "Umur: $age tahun"
    }
}