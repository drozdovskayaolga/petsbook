package com.example.petsbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.petsbook.R
import com.example.petsbook.data.PetsData
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class PetsListAdapter(private val items: List<PetsData>)
    : RecyclerView.Adapter<PetsListAdapter.MyViewHolder>() {

    var onItemClickListener:((item:PetsData)->Unit)? = null
    var selectedPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val photoView = inflater.inflate(R.layout.item_in_pets_list, parent, false)
        return MyViewHolder(photoView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val imageView: ImageView = itemView.findViewById(R.id.ivPetsList)

        fun bind(data: PetsData){

            if(selectedPosition==adapterPosition){
                imageView.alpha = 1f
            }else{
                imageView.alpha = 0.6f
            }

            Picasso.with(itemView.context)
                .load(data.petImage)
                .transform(CropCircleTransformation())
                .into(imageView)

            itemView.setOnClickListener{
                onItemClickListener?.invoke(data)
                selectedPosition = adapterPosition
                notifyDataSetChanged()
            }
        }

    }
}