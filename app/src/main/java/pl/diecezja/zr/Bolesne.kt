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
        val buttonBolesneDoDroga = findViewById<Button>(R.id.button_Droga)
        buttonBolesneDoDroga.setOnClickListener {
            val intentDroga = Intent(this, DrogaKrzyzowa ::class.java)
            startActivity(intentDroga)
        }
        val buttonBolesneDoUkrzyzowanie = findViewById<Button>(R.id.button_Ukrzyzowanie)
        buttonBolesneDoUkrzyzowanie.setOnClickListener {
            val intentUkrzyzowanie = Intent(this, Ukrzyzowanie::class.java)
            startActivity(intentUkrzyzowanie)
        }
        val buttonRadosneDoRekolekcje = findViewById<Button>(R.id.button_Rekolekcje_Radosne)
        buttonRadosneDoRekolekcje.setOnClickListener {
            val intent8 = Intent(this, RadosneRekolekcje::class.java)
            startActivity(intent8)
        }
    }
}