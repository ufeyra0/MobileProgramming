package com.ufeyrabagci.hafta4

class Students : User() {
    var student_number: Long =0
    var lesson =mutableListOf<String>()

    var vize =0
    var final_not =0

    //vizenin%40 ile finalin%60 hesaplayıp ekrana yazdıran fonksiyonu yazdırınız

    fun son_not(vize:Int, final_not:Int){
        var not = (vize*0.4)+(final_not*0.6)
        println("Vize ve final ortalaması notunuz = $not")
    }

    override fun showInfo(){
        println("Name =${getUserName()} ,Öğrenci No = $student_number")
    }
}