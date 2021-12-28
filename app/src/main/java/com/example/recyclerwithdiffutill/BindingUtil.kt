package com.example.recyclerwithdiffutill

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import org.w3c.dom.Text

@BindingAdapter("recyclername")
fun TextView.Setname(item: InfoData) {
    item.let {
            text=item.name
    }
}
@BindingAdapter("recyclerage")
fun TextView.Setage(item: InfoData)
{
    item.let {
        text=item.age.toString()
    }
}
@BindingAdapter("recyclerImage")
fun ImageView.Setimage(item: InfoData){
    setImageResource(item.image)
}