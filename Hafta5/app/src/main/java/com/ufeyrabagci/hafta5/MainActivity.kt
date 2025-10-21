package com.ufeyrabagci.hafta5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var button_1: Button
    private lateinit var txtview_1: TextView
    private lateinit var txtview_2: TextView
    private lateinit var txtview_3: TextView
    private lateinit var txtview_4: TextView


    private lateinit var edittext_1: EditText
    private lateinit var edittext_2: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button_1 = findViewById(R.id.button_1)
        txtview_1 = findViewById(R.id.txtview_1)
        txtview_2 = findViewById(R.id.txtview_2)
        txtview_3 = findViewById(R.id.txtview_3)
        txtview_4 = findViewById(R.id.txtview_4)
        edittext_1 = findViewById(R.id.edittext_1)
        edittext_2 = findViewById(R.id.edittext_2)


        button_1.setOnClickListener {
            yazdir()
        }
    }

    private fun yazdir() {
        val sayi1 = edittext_1.text.toString().toString()

        val sayi2 = edittext_2.text.toString().toString()

        //sayiları ilk olarak string şekilde okumamızın sebebi
        //edittext'in içine boş değer girilip girilmediğini kontrol etmektir.

        //Boş Değer Kontrolü -->Boş değer girilmesine karşı
        //        }

        if(sayi1.isEmpty() || sayi2.isEmpty()){
            Toast.makeText(this, "Lütfen boş değer girmeyiniz!", Toast.LENGTH_SHORT).show()
            return
        }
        try{
            val sayi1 = sayi1.toInt()
            val sayi2 = sayi2.toInt()

            txtview_1.text="Toplama = ${toplama(sayi1, sayi2)}"
            txtview_2.text="Cıkarma = ${cikarma(sayi1, sayi2)}"
            txtview_3.text="Carpma = ${carpma(sayi1, sayi2)}"
            txtview_4.text="Bolme = ${bolme(sayi1, sayi2)}"
        }
        catch (e: NumberFormatException){
            Toast.makeText(this, "Lütfen doğru değerleri giriniz!", Toast.LENGTH_SHORT).show()  //doğru değer verilmemesine karşı
        }



    }

    private fun toplama(a: Int, b: Int): Int {
        return a + b
    }

    private fun cikarma(a: Int, b: Int): Int {
        return a - b
    }

    private fun carpma(a: Int, b: Int): Int {
        return a * b
    }

    private fun bolme(a: Int, b: Int): String {
        return if (b != 0) {
            val sonuc = a.toDouble() / b.toDouble()
            //import java.util.Locale
            String.format(Locale.getDefault(),"%.2f", sonuc)
        } else {
            "Tanımsız(0'a bolunemez)"
        }


    }
}

