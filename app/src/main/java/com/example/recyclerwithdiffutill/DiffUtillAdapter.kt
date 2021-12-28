package com.example.recyclerwithdiffutill

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerwithdiffutill.databinding.RecyclerlayoutBinding
import timber.log.Timber


class DiffUtillAdapter:
    ListAdapter<InfoData, DiffUtillAdapter.MyviewHolder>(DiffUtillRecyclerView()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {

        Timber.i("recyclerlayout called")
        return MyviewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        Timber.i("list called")
       val item=getItem(position)
        holder.bindView(item)
    }
     class MyviewHolder(val binding: RecyclerlayoutBinding):RecyclerView.ViewHolder(binding.root){
        companion object{
        fun from(parent:ViewGroup):MyviewHolder{
            val layoutinflater=LayoutInflater.from(parent.context)
            val binding=RecyclerlayoutBinding.inflate(layoutinflater,parent,false)

            return MyviewHolder(binding)
        }
        }


        fun bindView(item:InfoData) {
           binding.recycler=item
            binding.executePendingBindings()
        }

    }
    class DiffUtillRecyclerView: DiffUtil.ItemCallback<InfoData>()
    {

        override fun areItemsTheSame(oldItem: InfoData, newItem: InfoData): Boolean {
            return oldItem.name==newItem.name
        }

        override fun areContentsTheSame(oldItem: InfoData, newItem: InfoData): Boolean {
            return areItemsTheSame(oldItem,newItem)
        }

    }
}