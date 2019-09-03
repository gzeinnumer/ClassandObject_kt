package com.gzeinnumer.classandobject_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val l1 = Lampu()
        val l2 = Lampu() // Class class = new Class()
        l1.turnOn()
        l2.turnOff()
        l1.displayLightStatus("l1")
        l2.displayLightStatus("l2")
        l1.setStatusLamp(false)
        l2.setStatusLamp(true)
        l1.displayLightStatus("l1")
        l2.displayLightStatus("l2")
    }
}

class Lampu{
    private var isOn: Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp: String){
        if(isOn == true)
            println("$lamp lampu is on.")
        else
            println("$lamp lampu is off.")
    }

    fun setStatusLamp(status: Boolean){
        isOn = status
    }
}
