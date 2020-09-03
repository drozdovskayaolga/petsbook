package com.example.petsbook.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.petsbook.R
import com.example.petsbook.data.BreedsData
import com.example.petsbook.data.PetsData
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class BreedsListAdapter(private val items: List<BreedsData>)
    : RecyclerView.Adapter<BreedsListAdapter.MyViewHolder>() {

    var onItemClickListener:((item: BreedsData)->Unit)? = null
    var selectedPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val photoView = inflater.inflate(R.layout.item_in_breeds_list, parent, false)
        return MyViewHolder(photoView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val textView: TextView = itemView.findViewById(R.id.tvBreedsList)


        fun bind(data: BreedsData){

            if(selectedPosition==adapterPosition){
                textView.setTextColor(ContextCompat.getColor(itemView.context, R.color.colorPrimary))
                textView.background = ContextCompat.getDrawable(itemView.context, R.drawable.selected_breed_text_shape)
            } else{
                textView.setTextColor(ContextCompat.getColor(itemView.context, R.color.colorPrimaryDark))
                textView.background = ContextCompat.getDrawable(itemView.context, R.drawable.breed_text_shape)
            }

            textView.text = data.breed

            itemView.setOnClickListener{
                onItemClickListener?.invoke(data)
                selectedPosition = adapterPosition
                notifyDataSetChanged()
            }
        }

    }
}