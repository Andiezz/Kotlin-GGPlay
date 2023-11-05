package com.example.ggplaystore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Prepare arrays of data
        val appList = arrayListOf<AppModel>()

        for (i in 1..20){
            appList.add(AppModel(resources.getIdentifier("thumb$i", "drawable", packageName),"App $i","4." + (i%10).toString()))
        }
        val adapter = AppAdapter(appList)

        val suggestView : RecyclerView = findViewById(R.id.dexuat_list)
        suggestView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        suggestView.adapter = adapter

        val popularView : RecyclerView = findViewById(R.id.phobien_list)
        popularView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        popularView.adapter = adapter

        val priceView : RecyclerView = findViewById(R.id.tinhphi_list)
        priceView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        priceView.adapter = adapter

        val updateView : RecyclerView = findViewById(R.id.capnhat_list)
        updateView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        updateView.adapter = adapter
    }
}