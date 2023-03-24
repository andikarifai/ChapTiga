package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chaptiga.databinding.ActivitySeriazableSatuBinding
import java.io.Serializable

class SeriazableSatu : AppCompatActivity() {
    lateinit var binding: ActivitySeriazableSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeriazableSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val contact = Contact(
                name = binding.etName.text.toString(),
                email = binding.etEmail.text.toString(),
                phone = binding.etPhone.text.toString(),
                address = binding.etAddress.text.toString(),
                age = binding.etAge.text.toString().toInt()
            )

            val intent = Intent(this, SeriazableDua::class.java)
            intent.putExtra("contact", contact)
            startActivity(intent)
        }
    }

    data class Contact(
        val name: String,
        val email: String,
        val phone: String,
        val address: String,
        val age: Int
    ) : Serializable
}
