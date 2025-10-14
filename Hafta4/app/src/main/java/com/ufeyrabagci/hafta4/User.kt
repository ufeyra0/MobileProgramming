package com.ufeyrabagci.hafta4

import kotlin.toString

// özellik(property) ve fonksiyonların(function) bir arada mantıklı,
// hiyerarşik olarak barındırılmasını sağlar.

open class User {
    //başlangıçta null değilse bir değer dolu ise daha sonrasında null yapılamaz.

    private var user_name: String=""
    //yukarıdaki kullanımda tipin yanındaki soru işareti(?) ile
    // en başta null alabiliyor o yüzden daha sonrada null olabilir.

    var user_surname: String =""
    //yukarıdakinde en kotu "" der nul demez ve nul olamaz
    var user_age: Int=0

    open fun showInfo(){
        println("Name = $user_name , Surname = $user_surname , Age = ${user_age.toString()}")
    }
    fun setUser_Name(USERNAME: String){   //değeri verirken bu fonksiyon ile değer veririz.
        user_name=USERNAME
    }
    fun getUserName(): String=user_name   //değeri getirirken bu fonksiyonu çağırarak getiririz.


}