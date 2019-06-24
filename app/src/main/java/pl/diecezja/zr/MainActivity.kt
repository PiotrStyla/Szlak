package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_wprowadzenie  = findViewById (R.id.button_wprowadzenie) as Button
        button_wprowadzenie.setOnClickListener {
            val intent1 = Intent(this, Wprowadzenie::class.java)
            startActivity(intent1)
        }

    }
}
