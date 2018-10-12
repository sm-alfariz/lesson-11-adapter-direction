/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 11:10 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 11:10 PM
 ************************************************/

package com.coursedicoding.ngajaruiadapter.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.coursedicoding.ngajaruiadapter.R;
import com.coursedicoding.ngajaruiadapter.model.Employee;

import java.util.List;

public class TopBestEmployeeAdapter extends RecyclerView.Adapter<TopBestEmployeeAdapter.ViewHolder> {
    private List<Employee> employeeList;
    private final OnItemClickListener listener;

    public TopBestEmployeeAdapter(List<Employee> employeeList, OnItemClickListener listener) {
        this.employeeList = employeeList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_topbestemployee, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(employeeList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView empName, empPhone;
        RatingBar voting;

        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.img_employee);
            empName = view.findViewById(R.id.tv_empname);
            empPhone = view.findViewById(R.id.tv_emp_phone);
            voting = view.findViewById(R.id.rate_vote);
        }
        public void bind(final Employee item, final OnItemClickListener listener)
        {
            voting.setRating(item.getVote());
            empName.setText(item.getNamaLengkap());
            empPhone.setText(item.getPhoneNumber());
            voting.setIsIndicator(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Employee item);
    }

}
