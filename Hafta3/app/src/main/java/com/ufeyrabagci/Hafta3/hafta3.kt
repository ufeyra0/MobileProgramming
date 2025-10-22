package com.ufeyrabagci.hafta3

fun main(){


    var my_arr_1=arrayOf("furkan","ybs",20,"mobil programlama",true,56,63)

    //array içeriği değiştirilebilirdir ama boyutu sabittir.

    println("0. index değeri = ${my_arr_1[0]}")
    println("eleman sayısı = ${my_arr_1.size}")
    println("2. index'deki eleman ${my_arr_1.get(2)}")
    print(my_arr_1.set(2,"45"))
    println("2. index'deki eleman ${my_arr_1.get(2)}")
    //println(my_arr_1.get(7))     //kotlin derleyici tabanlı bir dildir kod okunduktan sonra hata verir.
                                 //IndexOutOfBound hatası verir.

    println("-----------------------------------------------")
    //value-referance type

    var a=10
    var b=a

    b = b+5

    println("a = $a ... b = $b")    //a=10  b=15
    println("-----------------------------------------------")

    var my_list_1=mutableListOf(10,15)
    var my_list_2=my_list_1

    my_list_2.add(20)         //20 hem 1 hem 2. listeye eklenir.

    println("my_list_1=$my_list_1 ... my_list_2=$my_list_2")
    println("-----------------------------------------------")

    //* 2 den fazla farklı tip var
    var my_list_3=mutableListOf("MAKU","YBS",true,15,75,54,"son sınıf")

    //my_list_3'in tüm elemanlarını yazdırın.
    //yöntem 1
    for(x in my_list_3){
        println(x)
    }

    //yöntem 2
    for(i in 0..my_list_3.size-1){
        println("${i+1}. eleman = ${my_list_3.get(i)}")
    }

    //yöntem 3
    my_list_3.forEach { println(it) }

    println("-----------------------------------------------")


    var my_list_4=mutableListOf<Int>(2,8,4,5,11,17,29,36,37,0,6,23)
    // listedeki her bir değerin karesini alan kodu yazınız.
    //yöntem 1

    for(x in my_list_4){
        println("$x sayisinin karesi = ${x*x}")
    }

    //yöntem 2

    my_list_4.forEach { println("$it sayisinin karesi = ${it*it}") }

    //yöntem 3

    var kare=my_list_4.map{it*it}
    println(kare)

    println("-----------------------------------------------")

    // my_list_4 de tek sayıları getiren kodu yazınız
    //Yöntem 1
    var sayac=0
    for(x in 0..my_list_4.size-1){
        var deger=my_list_4[x]
        if(deger%2!=0){
            println("my_list_4'deki ${sayac+1}. tek sayi = $deger")
            sayac++
        }
    }

    //Yöntem 2
    var tek=my_list_4.filter {it%2!=0}
    println("my_list_4'deki tek sayilar = $tek")

    println("-----------------------------------------------")

    //my_list_4 deki tek sayıların sayısını bulan kodu yazınız.
    println("my_list_4' de bulunan tek sayıların sayısı =${my_list_4.filter {it%2!=0}.size}")

    println(my_list_4.count{it%2!=0})

    println("-----------------------------------------------")

    //listede 100'den büyük sayı olup olmadığını kontrol edin

    var sayac2=0
    for (x in 0..my_list_4.size-1){
        var deger=my_list_4[x]
        if(deger>100){
            sayac++
        }
    }

    if(sayac2>0){
        println("listede 100'den büyük sayı vardır.")
    }else{
        println("listede 100'den büyük sayı yoktur.")
    }

    //Yöntem 2
    //all fonksiyonu ile listede tüm elemanlar kontrol edilir.
    //all fonksiyonu bir tane bile false varsa false döndürür.

    println("Listede 100'den büyük sayı var mı ? = ${my_list_4.all{it>100}}")

    println("-----------------------------------------------")

    // set veri yapısı: python'daki gibi küme mantığıyla çalışır
    //içerisindeki değerleri benzersiz hale getirir.
    //kümelerin sahip olduğu matematiksel işlemleri gerçekleştirmeyi sağlar.

    var kume_1= mutableSetOf(5,6,11,5,52,11,"YBS",186,82,82.10,73.45,"YBS")
    var kume_2=mutableSetOf(15,53,false,"Furkan","YBS",15,11,82.10)
    println("-----------------------------------------------")

    println("kume_1'nin eleman sayısı = ${kume_1.size}")
    println("kume_2'nin eleman sayısı = ${kume_2.size}")

    //kume_1: 11 çıktı=9 , kume_2: 9   çıktı=7

    println("birleşim = ${kume_1.union(kume_2)}")
    println("kesişim = ${kume_1.intersect(kume_2)}")
    println("kume_1 fark kume_2 = ${kume_1.subtract(kume_2)}")
    println("kume_2 fark kume_1 = ${kume_2.subtract(kume_1)}")

    println("-----------------------------------------------")

    // Map veri yapısı: anahtar-değer çiftlerinden oluşur.key,value
     var my_map=mutableMapOf("isim" to "Furkan","soyisim" to "Atlan","Bolum" to "YBS","ders_sayisi" to 3)

    //sadece anahtarın adını yazsak, onun sakladığı değeri getirir.
    println(my_map["isim"])

    //tüm anahtarları getirmek için
    println(my_map.values)

    //anahtar ve değeri birlikte yazdırmak için
    println(my_map.entries)

    //sonradan bir anahtar ve değer eklemek için
    my_map["fakülte"]="ZTYO"
    //Yöntem 2
    my_map.put("yaş",30)

    println(my_map.entries)

    //değer silmek için
    my_map.remove("yaş")
    println(my_map.entries)

    //işcilerin ücretlerine ½35 zam yapıp ücretlerin yeni halini yazdırınız

    var my_map2=mutableMapOf("isci1" to 50000,"isci2" to 29000,"isci3" to 35000,"isci4" to 70500)

    //Yöntem 1
    for ((my_key,my_value) in my_map2){

       var yeni_maas= my_value*1.35
       my_map2[my_key]=yeni_maas.toInt()
    }
    println(my_map2.entries)

    println("-----------------------------------------------")

    //Yöntem 2
    println(my_map2.map{it.value*1.35})
    
}