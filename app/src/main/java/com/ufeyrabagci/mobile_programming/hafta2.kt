package com.ufeyrabagci.mobile_programming

fun main(){
    //Basit düzeyde 2 şekilde veri tipi tanımlama

    //Tanımlama 1 : Değişkenin veri tipini tanımlamadan
    val degistirilemez_tip=15

    var degistirilebilir_tip="Furkan"
    degistirilebilir_tip="Üfeyra"

    //Tanımlama 2 : Değişkenin veri tipini tanımlayarak
    val sayi_1:Int =15
    var karakter:Char='U'

    //readln() -> Kullanıcıdan veri almak için kullanılır.Boş kalmayacaktır.
    //readline() -> Kullanıcı boş değerde girmek isterse kullanılır.

    //-------DÖNGÜLER--------

    var sayi_2:Int =4

    while (sayi_2>0){
        println("Su anki sayi $sayi_2")
        sayi_2--
    }

    for (i in 5..10)  // (i in 5..10)  yazarız kendisi yandaki gibi yapar ilk değer 5 son değer 10 olur
    {
        println("i değeri $i")
    }

    //Kullanıcıdan 2 adet tam sayı girişi alınız
    //İlk sayi küçük sayı olacak ikinci sayi büyük sayı olacak
    //bu iki sayı arasında 7'ye ve 2'ye tam bölünen ama 3'e tam bölünmeyen sayıları yazdırınız

    println("Lutfen küçük sayiyi giriniz")
    var a:Int=readln().toInt()
    println("lütfen büyük sayıyı giriniz")
    var b:Int=readln().toInt()

    for (i in a..b){
        if(i%2==0 && i%7==0 && i%3!=0)  //kodu yormamak için en başta küçük olanla başla yani önce 2 ile
        {
            println("Verdiğiniz koşullara uyan sayı $i")
        }
    }

    //Azalan for döngüsü

    for(i in 10 downTo 1)  //(i in 10 downTo 1) yazarız kendi düzenler.
    {
        println("Sayi = $i")
    }

    // for döngüsü son sayının dahil edilmemesi
    // until=son sayıyı dahil etmez 1 den başlar 4 de biter.
    for(k in 1 until  5)    //(k in 1 until 5)  yazarız kendi düzenler.
    {
        println("Sayi = $k")
    }

    merhaba()
    toplama(5,2)
    musteri()
    hesaplama(2,3,1)
    hesaplama(2,3,2)
    hesaplama(2,3,3)
    hesaplama(2,3,4)

    println("--------------------------------------------")

    for(i in 1..4){
        hesaplama(5,15,i)
    }

    val sonuc = bolme(2,1)
    println("Sonuc = $sonuc")


}

// Fonksiyon tanımlama 1 : parametresiz ve geriye değer döndürmeyen

fun merhaba(){
    println("Bu fonksiyon parametresiz ve geriye değer döndürmeyen bir fonksiyondur.")
}

// Fonksiyon tanımlama 2 : parametreli ve geriye değer döndürmeyen

fun toplama(a:Int,b:Int){
    println("Toplama isleminin sonucu = ${a+b}")
}

   // Default parametre value

fun musteri(kullanici: String="Gecici Kullanici"){
    println("Hoşgeldiniz $kullanici")
}

//Fonksiyon tanımlama 3 : parametresiz ve geriye değer döndüren

//gerçek hayatta, niş bir işi yerine getirmek için kullanılır.
//görevi yerine getirdikten sonra başka bir fonksiyonu ya da
//görevi tetikler(başka bir fonksiyonu başlatır ya da sonlandırırlar.)

fun selamla(){
    return println("Merhaba")
}


//Fonksiyon tanımlama 4 : parametreli ve geriye değer döndüren

fun bolme(a : Int,b : Int): Int       //Dödüreceği değerin tipinide yazmamız gereklidir.
{
    return a/b
}

//3 parametre alan 1 ve 2. parametreleri tam sayı olan
//3. parametresi de tam sayı olan girilen ilk iki parametreyi
//yani sayıyıları 3. parametrenin değerine göre matematik işlemine
//tabi tutan kodu yazınız
//for döngüsü ile bu fonksiyonu son parametresi için tüm değerleri çalışacak
//yani 4 işlemide yapacak şekilde kullanın\çalıştırın.(main fonksiyonu içinde yazınız)

fun hesaplama(a:Int,b:Int,c:Int){
    if(c==1){
        println("Toplama isleminin sonucu = ${a+b}")
    }
    else if(c==2){
        println("Cikarma isleminin sonucu = ${a-b}")
    }
    else if(c==3){
        println("Bolme isleminin sonucu = ${a/b}")
    }
    else if(c==4){
        println("Carpma isleminin sonucu = ${a*b}")
    }
    else{
        println("Hatali secim yaptiniz")
    }
}

