package com.example.doctors



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctors.util.ItemTouchHelperAdapter
import java.util.*

class DoctorsAdapter(var context: Context, var list: MutableList<Doctor>) :
    RecyclerView.Adapter<DoctorsAdapter.MyHolder>(), ItemTouchHelperAdapter {

    override fun onItemMove(fromPosition: Int, toPosition:Int){
        if (fromPosition < toPosition){
            for (i in fromPosition until toPosition){
                Collections.swap(list, i, i+1)
            }
        }
        else{
            for (i in fromPosition downTo toPosition +1 ){
                Collections.swap(list,i ,i-1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

    override fun onItemDismiss(position: Int){
        list.removeAt(position)
        notifyItemRemoved(position)
    }
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val image: ImageView = itemView.findViewById(R.id.img)
        val occupation: TextView = itemView.findViewById(R.id.occupation)
        val loaction: TextView = itemView.findViewById(R.id.location)
        val rating: TextView = itemView.findViewById(R.id.rating)
        val reviews: TextView = itemView.findViewById(R.id.reviews)
        val main : CardView = itemView.findViewById(R.id.main)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.doctors_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val doctors = list[position]
        holder.name.text = doctors.name
        holder.occupation.text = doctors.occupation
        holder.loaction.text = doctors.location
        holder.rating.text = doctors.rating
        holder.reviews.text = doctors.reviews
        holder.image.setImageResource(doctors.img)

        var anim = AnimationUtils.loadAnimation(context, R.anim.offer_anim)
        holder.main.startAnimation(anim)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
