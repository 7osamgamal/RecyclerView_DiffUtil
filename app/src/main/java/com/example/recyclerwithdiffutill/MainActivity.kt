package com.example.recyclerwithdiffutill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerwithdiffutill.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("activity layout called")
         binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        Timber.i("activity layout called")
        val infolist=ArrayList<InfoData>()
        infolist.add(InfoData("laila",26,R.drawable.butter))
        infolist.add(InfoData("hazem",26,R.drawable.cow))
        infolist.add(InfoData("hosam",26,R.drawable.eagle))
        infolist.add(InfoData("dina",26,R.drawable.butter))
        infolist.add(InfoData("gamal",26,R.drawable.eagle))
        infolist.add(InfoData("maysona",26,R.drawable.butter))
        infolist.add(InfoData("hosam",26,R.drawable.butter))
      // val recyclerview=findViewById<RecyclerView>(R.id.MyrecyclerView)
       val adpter=DiffUtillAdapter()
        binding.MyrecyclerView.adapter=adpter
        // recyclerview.adapter=adpter
        adpter.submitList(infolist)

        Timber.i("adapter called")



    }
}