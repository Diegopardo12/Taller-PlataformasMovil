    package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edad()
        tablamultiplicar()

    }
        fun edad() {
            val mayorDeEdad = (1..100).random()
            100
            if (mayorDeEdad >= 18) println("Es mayor de edad con $mayorDeEdad")

            val mayorOMenor = if (mayorDeEdad >= 18) "Persona mayor" else
                "Persona menor con $mayorDeEdad"
            println(mayorOMenor)


        }

        fun tablamultiplicar() {
            var respuesta=6

                println("Inrgese el numero")
                //respuesta = readLine()!!

                println("La tabla de multiplicar $respuesta")

                for (i: Int in 1 until 10){
                    println("($respuesta x $i)= ${respuesta * i}")
                    //println( respuesta * i )
                }
                for (i: Int in 1 downTo 10){
                    //println( respuesta * i )
                    println("($respuesta x $i)= ${respuesta * i}")
                }

        }

        fun listpar(){
            val array = listOf("")
        }
    }





