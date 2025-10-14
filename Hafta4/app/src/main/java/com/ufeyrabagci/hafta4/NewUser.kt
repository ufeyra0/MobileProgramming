package com.ufeyrabagci.hafta4

import android.R

abstract class NewUser {
    protected var user_name: String=""
    protected var user_surname: String=""
    protected var user_age: Int=0

    fun setAllProperties(newName: String, newSurname: String, newAge: Int){
        user_name=newName
        user_surname=newSurname
        user_age=newAge
    }
    // abstract metotlar sadece tanımlanır, içi doldurulmaz.yani
    //fonksiyonun ne amaçla kullanılacağı ,hangi işlemleri yapacağı,
    //hangi çıktıları vereceği TANIMLANMAZ!!!

    abstract fun newShowInfo()

    open fun belong_class(){
        println("Bu metot,abstract class'a ait normal bir metottur.")

    }


}