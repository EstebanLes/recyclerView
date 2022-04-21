package com.example.recyclerview.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero


class SuperHeroAdapter(private val superheroList: List<SuperHero>): // tiene que recibir una lista de superheroes sino no haria nada
    RecyclerView.Adapter<SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {// se encarga de llenar los datos de cada superheroe
        val item = superheroList[position] // obtenemos el superheroe de la lista
        holder.render(item)// le pasamos el superheroe al viewholder
    }

    override fun getItemCount(): Int = superheroList.size // retorna la cantidad de superheroes que hay en la lista para que se vean todas en el recyclerview

}