package com.ufeyrabagci.hafta4

fun main(){
    // OOP - Object Oriented Programming - Nesne Tabanlı Programlama
    // 1-) Inheritance(Kalıtım) -> miras alma
    // 2-) Polymorphism(Çok Biçimlilik) -> override yapma
    // 3-) Encapsulation(Kapsülleme) ->özel bilgileri kapsülleme, kullanıcı kısıtlama(private,public...)
    // 4-) Abstraction(Soyutlama)-> ne olduğunu sen tanımla ne yapacağını karşı taraf.
    // abstract fonksiyonlar tanımlarız ve miras alan ne yapacağını yazar.

    var user_1= User()
    user_1.setUser_Name("Üfeyra")
    user_1.user_surname="Bağcı"
    user_1.user_age=21

    user_1.showInfo()
    println("-------------------------------------------------")

    println("User Name = ${user_1.getUserName()}")

    // 4 temel işlemi sayı 1 ve sayı2 propertyleri üzerinden gerçekleştiren bir class oluşturun.

    var islem= MyMath()

    println("Birinci sayıyı giriniz")
    var sayi1: Int = readln().toInt()
    println("İkinci sayıyı giriniz")
    var sayi2: Int = readln().toInt()

    islem.Toplama(sayi1, sayi2)
    islem.Cikarma(sayi1,sayi2)
    islem.Bolme(sayi1,sayi2)
    islem.Carpma(sayi1,sayi2)

    println("-------------------------------------------------")

    println("Vize notunuzu giriniz")
    var vize: Int = readln().toInt()
    println("Final notunuzu giriniz")
    var final_not: Int = readln().toInt()

    var student_1= Students()
    student_1.son_not(vize, final_not)

    println("-------------------------------------------------")

    student_1.setUser_Name("Furkan")
    student_1.student_number=2344565678   //atama işlemi aslında set işlemidir,ekrana yazdırma ise get işlemidir.
    student_1.lesson.add("Mobil Programlama")

    user_1.showInfo()
    student_1.showInfo()

    println("-------------------------------------------------")

    //Abstract class'lardan instance üretilmez!!!!
    //var my_new_user= NewUser()

    //Abstract class'lar sadece miras alınmak için oluşturulurlar.
    var my_new_user= NewStudents()
    my_new_user.setAllProperties("Üfeyra","Bağcı",21)
    my_new_user.student_number=12345678

    //Abstract metot
    my_new_user.newShowInfo()
    //Polyhmorphism
    my_new_user.belong_class()

}