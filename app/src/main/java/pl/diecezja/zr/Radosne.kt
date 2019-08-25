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

        val button_radosne_do_nawiedzenie  = findViewById (R.id.button_Nawiedzenie) as Button
        button_radosne_do_nawiedzenie.setOnClickListener {
            val intent4 = Intent(this, Nawiedzenie::class.java)
            startActivity(intent4)
        }
        val button_radosne_do_narodzenie  = findViewById (R.id.button_Narodzenie) as Button
        button_radosne_do_narodzenie.setOnClickListener {
            val intent5 = Intent(this, Narodzenie::class.java)
            startActivity(intent5)
        }
    }
}
