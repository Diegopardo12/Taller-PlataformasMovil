    package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edad()
        tablamultiplicar()
        listpar()
        auto()
        cedula()
        iva()

    }
        fun edad() {
            val mayorDeEdad = (1..40).random()
            100
            if (mayorDeEdad >= 18) println("Es mayor de edad con $mayorDeEdad años")

            val mayorOMenor = if (mayorDeEdad >= 18) " " else
                "Eres menor de edad con $mayorDeEdad años"
            println(mayorOMenor)
        }

        fun tablamultiplicar() {
            var respuesta=6

            println("Inrgese el numero")
            //r = readLine()!!
            //val va = readLine()!!.toInt()

            println("La tabla de multiplicar del $respuesta")

            for (i: Int in 1 until 10){
                println("($respuesta x $i)= ${respuesta * i}")
                //println( respuesta * i )
            }
            println("--------------------------")
            for (i: Int in 10 downTo 1){
                //println( respuesta * i )
                println("($respuesta x $i)= ${respuesta * i}")

            }


        }

        fun listpar(){
            val list: List<String> = listOf("Erick Antonio Alvarado Cuenca",
                "Miguel Angel Caraguay Correa", "Carlos Alberto Castillo Jumbo",
                "Erick Leonardo Cañar Cuenca","Anthony Damian Espinosa Campoverde",
                "Jhoselin Anai Guachizaca Vargas", "Steven Andres Silva Jara",
                "Adriana Sofia Jaramillo Ochoa", "Diego Alejandro Pardo Alberca",
                "Bryan Anthony Rodriguez Alvarado","Pablo Jose Sanchez Saraguro",
                "Jose Isaias Silva Leon", "Carlos Andres Tandazo Malla"
            )
            println(list)

            val grupos = mutableMapOf("Erick Antonio Alvarado Cuenca" to "Funeraria Mascotas",
                "Miguel Angel Caraguay Correa " to "Registro UTPL",
                "Carlos Alberto Castillo Jumbo" to "Funeraria Mascotas",
                "Erick Leonardo Cañar Cuenca" to "Funeraria Mascotas",
                "Anthony Damian Espinosa Campoverde" to "Registro UTPL",
                "Jhoselin Anai Guachizaca Vargas" to "Registro UTPL",
                "Steven Andres Silva Jara" to "Funeraria Mascotas",
                "Adriana Sofia Jaramillo Ochoa" to "Registro UTPL",
                "Diego Alejandro Pardo Alberca" to "Funeraria Mascotas",
                "Bryan Anthony Rodriguez Alvarado" to "Funeraria Mascotas",
                "Pablo Jose Sanchez Saraguro" to "Registro UTPL",
                "Jose Isaias Silva Leon" to "Registro UTPL",
                "Carlos Andres Tandazo Malla" to "Funeraria Mascotas")

            val gOrden = grupos.toSortedMap()
            println("Lista del curso")
            for (i in gOrden ){
                println("${i.key} - ${i.value}")
            }
        }

        class vehiculo(val Traccion:Array<traccion>, val motor:String, val Tipovehiculo:Array<tipovehiculo>, val capacidad:Int){
        enum class traccion{
            tracera,
            delantera}
        enum class tipovehiculo{
            particular,
            publico}
        //Metodo de salida de ficha de los vehiculos
        //
        fun au(){
            for(t in Traccion){
                println("La tracción del vehiculo es $t")
            }
        }

        fun propiedadesAu(){
            println("el motor es un $motor")
            println("la capacidad es de $capacidad")
            for (m in Tipovehiculo){
                println("Vehiculo $m")
            }
        }


    }
        fun auto(){
        println("propiedades del vehiculo")
        val a = vehiculo(Traccion = arrayOf(vehiculo.traccion.delantera),motor = "v6",
            Tipovehiculo = arrayOf(vehiculo.tipovehiculo.publico),capacidad = 12,
        )
        a.au()
        a.propiedadesAu()
    }



    fun cedula(){
            var ce = 0
            var t =0
            val ci = arrayListOf<Int>(1,1,0,5,6,3,6,8,9,6)
            val f = ci.last()
            for(i in ci.indices){
                ce =ci[i]
                if(i % 2 == 0){
                    ce =(ci[i]*2)
                    if (ce>9){
                        ce = ce-9
                    }
                    t = t+ce
                }else{
                    t = t+ce
                }
            }
            t = t - f
            val r = t.toString().substring(0,1)
            val d = (r.toInt()+1)*10
            if (d-t==f||d-t==10){
                println("La cedula es correcta.")
            }else{
                println("La cedula es incorrecta.")
            }
        }

        fun iva(){
            var valor = (1..100).random()
            var iva = valor * 0.12
            var t = valor + iva
            println("el valor a pagar es $t")
        }
    }





