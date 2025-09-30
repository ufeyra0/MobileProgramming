package com.ufeyrabagci.hafta1

import java.lang.Math.pow
import kotlin.reflect.typeOf

fun main() {
    println("Hello World!")

    val degistirilmez = 15
    var degistirilebilir = "Furkan"

    val sayi_int: Int = 320000
    val sayi_long: Long = 3500000000L
    val sayi_double: Double = 25.4698
    val sayi_float: Float = 3565.156f


    val deger_char: Char = 'F'
    val deger_string: String = "Ahmet"

    println("Degisken degeri = $sayi_int Degisken Tipi =${sayi_int::class.simpleName}")
    // simpleName ile sadece adını getir diyoruz.

    val x = 5

    if (x % 2 != 0) {
        println("Sayi tektir")
    } else {
        println("Sayi cifttir")
    }

    // Dışarıdan değer alarak if yapısı hazırlama.
    // NOT= readln() metodu ile kullanıcıdan değer alınır.
    println("Kullanici adini giriniz : ")
    val user_name: String = readln()

    // değer girişini kontrol ederek kullanıcı adının doğru yanlış olduğunu emin olan if kodu

    val name = "Ufeyra"

    if (name == user_name) {

        println("Kullanici adi dogru girildi :) Veri Tipi : ${user_name::class.simpleName}")
    } else {
        println("Kullanici adi hatali!!!")
    }

    //Kullanıcıdan 2 tam sayi alınız ve 4 temel işlemi yapınız

    println("Lutfen 1. sayiyi giriniz")
    val a = readln().toInt()
    println("Lutfen 2. sayiyi giriniz")
    val b = readln().toInt()

    fun toplama(a: Int, b: Int) {
        println("Toplama islemi sonucu = ${a + b}")
    }

    fun cikarma(a: Int, b: Int) {
        println("Cikarma islemi sonucu = ${a - b}")
    }

    fun bolme(a: Int, b: Int) {
        println("Bolme islemi sonucu = ${a / b}")
    }

    fun carpma(a: Int, b: Int) {
        println("Carpma islemi sonucu = ${a * b}")
    }
    toplama(a, b)
    cikarma(a, b)
    bolme(a, b)
    carpma(a, b)

    // Üs alma işlemi için pow() metodu kullanılır.
    //pow kullanmak için a değişkenini Double yaptık. Sayılar Double olmak zorunda

    println("$a sayisinin 4. dereceden ussu = ${pow(a.toDouble(), 4.0)}")

    // Kullanıcı adı ve şifre bilgisi alıp her ikiside sizin
    // istediğiniz değer olması durumunda sisteme giriş başarı mesajı veren kodu yazınız

    val name_true = "Ufeyra_0"
    val sifre_true = "123456"

    println("Lutfen kullanici adinizi giriniz")
    val k_adi = readln()
    println("Lutfen sifrenizi giriniz")
    val sifre = readln()


    if (k_adi == name_true && sifre == sifre_true) {
        println("Giris Basarili :)")
    } else if (k_adi != name_true && sifre == sifre_true) {
        println("Kullanici adi hatali!!!")
    } else if (k_adi == name_true && sifre != sifre_true) {
        println("Sifre hatali!!!")
    } else {
        println("Giris Basarisiz!!!")
    }

}
