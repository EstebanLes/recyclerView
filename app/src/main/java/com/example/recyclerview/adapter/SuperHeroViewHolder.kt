package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val superHero: TextView by lazy { view.findViewById<TextView>(R.id.tvSuperHeroName) }
    private val realName: TextView by lazy { view.findViewById<TextView>(R.id.tvRealName) }
    private val publisher: TextView by lazy { view.findViewById<TextView>(R.id.tvPublisher) }
    private val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero) {
        superHero.text = superHeroModel.superHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)

    }
}