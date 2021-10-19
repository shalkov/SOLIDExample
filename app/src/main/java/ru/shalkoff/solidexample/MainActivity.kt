package ru.shalkoff.solidexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.shalkoff.solidexample.srp.bad.ProductManagerBad

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productBad = ProductManagerBad(1, "apple")
    }
}