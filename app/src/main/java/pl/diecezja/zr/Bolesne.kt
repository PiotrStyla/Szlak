package pl.diecezja.zr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Bolesne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bolesne_activity_bolesne)

        val buttonBolesneDoOgrojec = findViewById<Button>(R.id.button_Ogrojec)
        buttonBolesneDoOgrojec.setOnClickListener {
            val intentBolesne = Intent(this, Ogrojec::class.java)
            startActivity(intentBolesne)
        }

        val buttonBolesneDoBiczowanie = findViewById<Button>(R.id.button_Biczowanie)
        buttonBolesneDoBiczowanie.setOnClickListener {
            val intent4 = Intent(this, Biczowanie::class.java)
            startActivity(intent4)
        }
        val buttonBolesneDoCierniem = findViewById<Button>(R.id.button_Cierniem)
        buttonBolesneDoCierniem.setOnClickListener {
            val intentCierniem = Intent(this, CierniemUkoronowanie::class.java)
            startActivity(intentCierniem)
        }
        val buttonRadosneDoTabor = findViewById<Button>(R.id.button_Tabor)
        buttonRadosneDoTabor.setOnClickListener {
            val intent6 = Intent(this, Tabor::class.java)
            startActivity(intent6)
        }
        val buttonSwiatlaDoWieczernik = findViewById<Button>(R.id.buttonWieczernik)
        buttonSwiatlaDoWieczernik.setOnClickListener {
            val intent7 = Intent(this, Wieczernik::class.java)
            startActivity(intent7)
        }
        val buttonRadosneDoRekolekcje = findViewById<Button>(R.id.button_Rekolekcje_Radosne)
        buttonRadosneDoRekolekcje.setOnClickListener {
            val intent8 = Intent(this, RadosneRekolekcje::class.java)
            startActivity(intent8)
        }
    }
}