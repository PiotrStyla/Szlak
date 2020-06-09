package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Swiatla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swiatla_activity_swiatla)

        val buttonSwiatlaDoJordan  = findViewById<Button>(R.id.button_Jordan)
        buttonSwiatlaDoJordan.setOnClickListener {
            val intent3 = Intent(this, Jordan::class.java)
            startActivity(intent3)
        }

        val buttonSwiatlaDoKana  = findViewById<Button>(R.id.button_Kana)
        buttonSwiatlaDoKana.setOnClickListener {
            val intent4 = Intent(this, Kana::class.java)
            startActivity(intent4)
        }
        val buttonSwiatlaDoGalilea  = findViewById<Button>(R.id.button_Galilea)
        buttonSwiatlaDoGalilea.setOnClickListener {
            val intent5 = Intent(this, Galilea::class.java)
            startActivity(intent5)
        }
        val buttonRadosneDoTabor  = findViewById<Button>(R.id.button_Tabor)
        buttonRadosneDoTabor.setOnClickListener {
            val intent6 = Intent(this, Tabor::class.java)
            startActivity(intent6)
        }
        val buttonSwiatlaDoWieczernik  = findViewById<Button>(R.id.buttonWieczernik)
        buttonSwiatlaDoWieczernik.setOnClickListener {
            val intent7 = Intent(this, Wieczernik::class.java)
            startActivity(intent7)
        }
        val buttonRadosneDoRekolekcje  = findViewById<Button>(R.id.button_Rekolekcje_Radosne)
        buttonRadosneDoRekolekcje.setOnClickListener {
            val intent8 = Intent(this, RadosneRekolekcje::class.java)
            startActivity(intent8)
        }
    }
}
