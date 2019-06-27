package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class Radosne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radosne)

        val button_radosne_do_zwiastowanie  = findViewById (R.id.button_Zwiastowanie) as Button
        button_radosne_do_zwiastowanie.setOnClickListener {
            val intent3 = Intent(this, Zwiastowanie::class.java)
            startActivity(intent3)
        }
    }
}
