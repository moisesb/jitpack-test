package net.moisesborges.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.moisesborges.firstlibrary.HelloProvider
import net.moisesborges.secondlibrary.HelloProvider as SecondHelloProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloProvider = HelloProvider()
        val secondHelloProvider = SecondHelloProvider()
        message.text = "${helloProvider.message}\n${secondHelloProvider.message}"
    }
}
