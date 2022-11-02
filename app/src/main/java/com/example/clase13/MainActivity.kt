package com.example.clase13

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton= findViewById<Button>(R.id.button)
        boton.setOnClickListener(){
            val toast= Toast.makeText(this,"Boton Tradicional activado",Toast.LENGTH_LONG)
            toast.show()
        }


        }


    fun mensaje(context: Context){
            val toast= Toast.makeText(context,"Boton Flotante activado",Toast.LENGTH_LONG)
            toast.show()

    }
}