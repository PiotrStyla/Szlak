package pl.diecezja.zr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Chwalebne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chwalebne_activity_chwalebne)


        val buttonChwalebneDoZmartwychwstanie = findViewById<Button>(R.id.button_Zmartwychwstanie)
        buttonChwalebneDoZmartwychwstanie.setOnClickListener {
            val intentChwalebne = Intent(this, Zmartwychwstanie::class.java)
            startActivity(intentChwalebne)
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