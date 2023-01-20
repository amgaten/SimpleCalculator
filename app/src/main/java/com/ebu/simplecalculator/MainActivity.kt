package com.ebu.simplecalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById<View>(R.id.txt_num1) as EditText
        et2 = findViewById<View>(R.id.txt_num2) as EditText
        tv1 = findViewById<View>(R.id.txt_resultado) as TextView
    }

    //Realiza la suma
    fun Sumar(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val num1 = valor1.toInt()
        val num2 = valor2.toInt()
        val suma = num1 + num2
        val result = suma.toString()
        tv1!!.text = "Result is $result"
    }

    fun Multiplicar(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val num1 = valor1.toInt()
        val num2 = valor2.toInt()
        val multiplicar = num1 * num2
        val result = multiplicar.toString()
        tv1!!.text = "Result is $result"
    }

    fun Promedio(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val num1 = valor1.toInt()
        val num2 = valor2.toInt()
        val promedio = (num1 + num2) / 2
        val result = promedio.toString()
        tv1!!.text = "Result is $result"
    }

    fun Restar(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val num1 = valor1.toInt()
        val num2 = valor2.toInt()
        val restar = num1 - num2
        val result = restar.toString()
        tv1!!.text = "Result is$result"
    }

    fun Dividir(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val num1 = valor1.toInt().toFloat()
        val num2 = valor2.toInt().toFloat()
        var dividir = 0f
        if (num2 == 0f) {
            tv1!!.text = "You can not divide by Zero"
        } else {
            dividir = num1 / num2
            val result = dividir.toString()
            tv1!!.text = "Result is $result"
        }
    }
}