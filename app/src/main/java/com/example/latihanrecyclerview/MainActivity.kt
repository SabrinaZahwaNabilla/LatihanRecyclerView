package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //3 var recycler view
    //recycler view
    private lateinit var recyclerView: RecyclerView
    //recycler adapter
    private lateinit var recyclearAdapter: RecyclerView.Adapter<*>
    //layout manager
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.listData)
        //isi data
        val data = arrayOf<String>(
            "Anto", "Bambang", "Cahyo", "Danang", "Eko", "Feronika"
        )
        //inisialisasi layout
        viewManager = LinearLayoutManager(this)
        //ambil data adapter
        recyclearAdapter = SiswaAdapter(data)
        //menampilkan adapter ke recyclearview
        recyclerView.adapter = recyclearAdapter
        //show data from adapter to layout interface
        recyclerView.layoutManager = viewManager
    }
}