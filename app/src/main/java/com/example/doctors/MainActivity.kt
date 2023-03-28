package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.doctors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var doctors = mutableListOf<Doctor>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )
        doctors.add(
            Doctor(
                "Dr. Johnny Sins",
                R.drawable.img,
                "Urology",
                "Brothers Hospital",
                "4.2",
                "(5,376 reviews)"
            )
        )


//        binding.rv.layoutManager =
//            LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
//        val adapter = DoctorsAdapter(list)
//        binding.rv.adapter = adapter
        binding.rv.adapter = DoctorsAdapter(this,doctors)
    }
}
