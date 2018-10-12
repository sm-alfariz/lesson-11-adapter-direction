/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 11:25 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 10:05 PM
 ************************************************/

package com.coursedicoding.ngajaruiadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.coursedicoding.ngajaruiadapter.adapter.TopBestEmployeeAdapter;
import com.coursedicoding.ngajaruiadapter.model.Employee;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Integer image[] = {R.drawable.ic_people,R.drawable.ic_people,R.drawable.ic_people,R.drawable.ic_people,R.drawable.ic_people};
    String namaLengkap[] = {"Alfredo Sinaga ","Wawanku","Ade Capri","Axel","Bagas Raga"};
    String phoneNum[] = {"081232","082524","0812345","0811234","086241"};

    float vote[] = new float[] {5, 4, 4, 3, 5};
    int[] umur = new int[] {23,21,31,24,22};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////Init RecyclerView Top BestEmployee
        RecyclerView recyclerTopEmp = findViewById(R.id.rv_topbestemployee);
        ArrayList<Employee> beanClassForDashboards = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            Employee beanClassForRecyclerView_contacts;
            beanClassForRecyclerView_contacts = new Employee(namaLengkap[i],phoneNum[i],umur[i],image[i],vote[i]);
            beanClassForDashboards.add(beanClassForRecyclerView_contacts);
        }

        RecyclerView.LayoutManager mLayoutManager;
        mLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerTopEmp.setLayoutManager(mLayoutManager);
        recyclerTopEmp.setItemAnimator(new DefaultItemAnimator());
        recyclerTopEmp.setAdapter(new TopBestEmployeeAdapter(beanClassForDashboards, new TopBestEmployeeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Employee item) {
                Toast.makeText(MainActivity.this, item.getNamaLengkap(), Toast.LENGTH_LONG).show();
            }
        }));
        //end init RecyclerView view

    }
}
