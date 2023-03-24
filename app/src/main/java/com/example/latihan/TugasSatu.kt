package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivityTugasSatuBinding

class TugasSatu : AppCompatActivity() {
    lateinit var binding: ActivityTugasSatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugasSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            val bundle = Bundle()
            val move = Intent(this, TugasDua::class.java)
            bundle.putString("nama", binding.etName.text.toString())
            bundle.putInt("tahunLahir", binding.etTahunLahir.text.toString().toInt())
            move.putExtras(bundle)
            startActivity(move)


        }
    }
}