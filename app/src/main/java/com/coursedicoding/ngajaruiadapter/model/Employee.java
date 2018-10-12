/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 10:10 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 10:10 PM
 ************************************************/

package com.coursedicoding.ngajaruiadapter.model;

public class Employee {
    private String namaLengkap;
    private String phoneNumber;
    private Integer umur;
    private Integer photo;
    private Float vote;

    public Float getVote() {
        return vote;
    }

    public void setVote(Float vote) {
        this.vote = vote;
    }

    public Employee(String namaLengkap, String phoneNumber, Integer umur, Integer photo, Float vote) {
        this.namaLengkap = namaLengkap;
        this.phoneNumber = phoneNumber;
        this.umur = umur;
        this.photo = photo;
        this.vote = vote;

    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        namaLengkap = namaLengkap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        umur = umur;
    }
}
