package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Swiatla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swiatla_activity_swiatla)

        val button_swiatla_do_jordan  = findViewById (R.id.button_Jordan) as Button
        button_swiatla_do_jordan.setOnClickListener {
            val intent3 = Intent(this, Jordan::class.java)
            startActivity(intent3)
        }

        val button_swiatla_do_kana  = findViewById (R.id.button_Kana) as Button
        button_swiatla_do_kana.setOnClickListener {
            val intent4 = Intent(this, Kana::class.java)
            startActivity(intent4)
        }
        val button_radosne_do_narodzenie  = findViewById (R.id.button_Narodzenie) as Button
        button_radosne_do_narodzenie.setOnClickListener {
            val intent5 = Intent(this, Narodzenie::class.java)
            startActivity(intent5)
        }
        val button_radosne_do_ofiarowanie  = findViewById (R.id.button_Ofiarowanie) as Button
        button_radosne_do_ofiarowanie.setOnClickListener {
            val intent6 = Intent(this, Ofiarowanie::class.java)
            startActivity(intent6)
        }
        val button_radosne_do_odnalezienie  = findViewById (R.id.button_Odnalezienie) as Button
        button_radosne_do_odnalezienie.setOnClickListener {
            val intent6 = Intent(this, Odnalezienie::class.java)
            startActivity(intent6)
        }
        val button_radosne_do_rekolekcje  = findViewById (R.id.button_Rekolekcje_Radosne) as Button
        button_radosne_do_rekolekcje.setOnClickListener {
            val intent7 = Intent(this, RadosneRekolekcje::class.java)
            startActivity(intent7)
        }
    }
}
