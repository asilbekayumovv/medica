package com.example.doctors

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.doctors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var doctors = mutableListOf<Doctor>()
    private var offerAdapter = mutableListOf<DoctorsAdapter>()
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


        val itemTouchHelper = object : ItemTouchHelper.Callback(){
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                val dragFlags = UP or DOWN
                val swipeFlags = START or END
                return makeMovementFlags(dragFlags, swipeFlags)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                offerAdapter.onItemMove(viewHolder.adapterPosition, target.adapterPosition)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                offerAdapter.onItemDismiss(viewHolder.adapterPosition)
            }
        }

        val itemTouch = ItemTouchHelper(itemTouchHelper)
        itemTouch.attachToRecyclerView(binding.rv)
        binding.rv.adapter = DoctorsAdapter(this, doctors)
//        binding.rv.layoutManager =
//            LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
//        val adapter = DoctorsAdapter(list)
//        binding.rv.adapter = adapter



    }
}

private fun <E> List<E>.onItemDismiss(adapterPosition: Int) {


}

private fun <E> MutableList<E>.onItemMove(adapterPosition: Int, adapterPosition1: Int) {
    TODO("Not yet implemented")
}


