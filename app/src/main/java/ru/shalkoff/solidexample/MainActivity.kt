package ru.shalkoff.solidexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.shalkoff.solidexample.srp.bad.ProductSrpManagerBad

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}