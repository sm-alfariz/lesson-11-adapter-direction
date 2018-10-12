/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 11:10 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 11:10 PM
 */

package com.coursedicoding.ngajaruiadapter.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

import com.coursedicoding.ngajaruiadapter.R
import com.coursedicoding.ngajaruiadapter.model.ModelEmployee

class TopBestEmployeeAdapter(private val employeeList: List<ModelEmployee.Employee>, private val listener: OnItemClickListener) : RecyclerView.Adapter<TopBestEmployeeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.items_topbestemployee, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(employeeList[position], listener)
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView = view.findViewById(R.id.img_employee)
        var empName: TextView = view.findViewById(R.id.tv_empname)
        var empPhone: TextView = view.findViewById(R.id.tv_emp_phone)
        var voting: RatingBar = view.findViewById(R.id.rate_vote)

        fun bind(item: ModelEmployee.Employee, listener: OnItemClickListener) {
            voting.rating = item.vote!!
            empName.text = item.namaLengkap
            empPhone.text = item.phoneNumber
            voting.setIsIndicator(true)
            itemView.setOnClickListener { listener.onItemClick(item) }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(item: ModelEmployee.Employee)
    }

}
