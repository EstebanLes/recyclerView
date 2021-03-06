package com.example.recyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render(superHeroModel: SuperHero) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        binding.ivSuperHero.setOnClickListener {
            Toast.makeText(binding.ivSuperHero.context, "Clicked on ${superHeroModel.superHero}", Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, "Clicked on ${superHeroModel.superHero}", Toast.LENGTH_SHORT).show()
        }
    }
}