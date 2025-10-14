package com.ufeyrabagci.hafta4

class NewStudents : NewUser() {

    var student_number: Long =0


    override fun newShowInfo() {
        println("NewName , NewUserName , NewAge : $user_name,$user_surname,$user_age")
    }

    override fun belong_class(){
        println("Bu metot, NewStudents class'ına aittir.")
    }

}
