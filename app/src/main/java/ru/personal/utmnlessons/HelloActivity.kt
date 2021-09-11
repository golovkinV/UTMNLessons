package ru.personal.utmnlessons

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hello_activity.*

class HelloActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_activity)
    }

    fun handleTap(view: View) {
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
    }
}