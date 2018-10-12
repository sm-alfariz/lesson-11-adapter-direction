/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 11:25 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 10:05 PM
 */

package com.coursedicoding.ngajaruiadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast

import com.coursedicoding.ngajaruiadapter.adapter.TopBestEmployeeAdapter
import com.coursedicoding.ngajaruiadapter.model.ModelEmployee


import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var image = arrayOf(R.drawable.ic_people, R.drawable.ic_people, R.drawable.ic_people, R.drawable.ic_people, R.drawable.ic_people)
    private var namaLengkap = arrayOf("Alfredo Sinaga ", "Wawanku", "Ade Capri", "Axel", "Bagas Raga")
    private var phoneNum = arrayOf("081232", "082524", "0812345", "0811234", "086241")

    private var vote = floatArrayOf(5f, 4f, 4f, 3f, 5f)
    private var umur = intArrayOf(23, 21, 31, 24, 22)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ////Init RecyclerView Top BestEmployee
        val recyclerTopEmp = findViewById<RecyclerView>(R.id.rv_topbestemployee)
        val arrayEmployee = ArrayList<ModelEmployee.Employee>()

        for (i in image.indices) {
            val fiilEmployee: ModelEmployee.Employee = ModelEmployee.Employee(namaLengkap[i], phoneNum[i], umur[i], image[i], vote[i], null)
            arrayEmployee.add(fiilEmployee)
        }

        val mLayoutManager: RecyclerView.LayoutManager
        mLayoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerTopEmp.layoutManager = mLayoutManager
        recyclerTopEmp.itemAnimator = DefaultItemAnimator()
        recyclerTopEmp.adapter = TopBestEmployeeAdapter(arrayEmployee, object : TopBestEmployeeAdapter.OnItemClickListener {
            override fun onItemClick(item: ModelEmployee.Employee) {
                Toast.makeText(this@MainActivity, item.namaLengkap, Toast.LENGTH_LONG).show()
            }
        })
        //end init RecyclerView view

    }
}
