package com.example.recyclerwithfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    private lateinit var adapter: RecyclerViewAdapter
    val listData: ArrayList<DataModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        buildDisplayData()
        initRecyclerview(view)
        return view
    }

    private fun initRecyclerview(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = RecyclerViewAdapter(listData)
        recyclerView.adapter = adapter
    }

    private fun buildDisplayData() {
        listData.add(DataModel("Hello"))
        listData.add(DataModel("Hi"))
        listData.add(DataModel("Welcome"))
        listData.add(DataModel("Bye"))
        listData.add(DataModel("Blessings"))
        listData.add(DataModel("Have a good day"))
        listData.add(DataModel("Hello"))
        listData.add(DataModel("Hi"))
        listData.add(DataModel("Welcome"))
        listData.add(DataModel("Bye"))
        listData.add(DataModel("Blessings"))
        listData.add(DataModel("Have a good day"))
        listData.add(DataModel("Hello"))
        listData.add(DataModel("Hi"))
        listData.add(DataModel("Welcome"))
        listData.add(DataModel("Bye"))
        listData.add(DataModel("Blessings"))
        listData.add(DataModel("Have a good day"))
        listData.add(DataModel("Hello"))
        listData.add(DataModel("Hi"))
        listData.add(DataModel("Welcome"))
        listData.add(DataModel("Bye"))
        listData.add(DataModel("Blessings"))
        listData.add(DataModel("Have a good day"))

    }
}