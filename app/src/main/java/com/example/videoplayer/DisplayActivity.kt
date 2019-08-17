package com.example.videoplayer

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.display_layout.*
import kotlinx.android.synthetic.main.list_view.view.*
import java.math.MathContext

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_layout)

        //val data = mutableListOf<String>("hello","this","is ","ashish")
        recyclerView.layoutManager = GridLayoutManager(this, 4)
        recyclerView.adapter = MyRecyclerViewAdaptor(this,data)
    }


    companion object {
        class MyRecyclerViewAdaptor(val context: Context, val data: List<String>) : RecyclerView.Adapter<MyRecyclerViewAdaptor.MyViewHolder>(){
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                val view = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false)
                return MyViewHolder(view)
            }

            override fun getItemCount(): Int {
                return data.size
            }

            override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                holder.setData(data, position)
            }

            class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                fun setData(data: List<String>, position: Int) {
                    itemView.textView.text = data[position]
                }
            }
        }
    }
}