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
        val button_swiatla_do_galilea  = findViewById (R.id.button_Galilea) as Button
        button_swiatla_do_galilea.setOnClickListener {
            val intent5 = Intent(this, Galilea::class.java)
            startActivity(intent5)
        }
        val button_radosne_do_tabor  = findViewById (R.id.button_Tabor) as Button
        button_radosne_do_tabor.setOnClickListener {
            val intent6 = Intent(this, Tabor::class.java)
            startActivity(intent6)
        }
        val button_swiatla_do_wieczernik  = findViewById (R.id.button_Wieczernik) as Button
        button_swiatla_do_wieczernik.setOnClickListener {
            val intent7 = Intent(this, Wieczernik::class.java)
            startActivity(intent7)
        }
        val button_radosne_do_rekolekcje  = findViewById (R.id.button_Rekolekcje_Radosne) as Button
        button_radosne_do_rekolekcje.setOnClickListener {
            val intent7 = Intent(this, RadosneRekolekcje::class.java)
            startActivity(intent7)
        }
    }
}
