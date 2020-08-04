package pl.diecezja.zr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ogrojec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ogrojec_activity_ogrojec)

        val buttonOgrojecDoWstep = findViewById<Button>(R.id.button_Ogrojec_Wstep)
        buttonOgrojecDoWstep.setOnClickListener {
            val intentOgrojecWstep = Intent(this, OgrojecWstep::class.java)
            startActivity(intentOgrojecWstep)
        }
        val buttonOgrojecDoDzien1 = findViewById<Button>(R.id.button_Ogrojec_1)
        buttonOgrojecDoDzien1.setOnClickListener {
            val intentOgrojecDzien1 = Intent(this, OgrojecDzien1::class.java)
            startActivity(intentOgrojecDzien1)
        }
        val buttonOgrojecDoDzien2 = findViewById<Button>(R.id.button_Ogrojec_2)
        buttonOgrojecDoDzien2.setOnClickListener {
            val intentOgrojecDzien2 = Intent(this, OgrojecDzien2::class.java)
            startActivity(intentOgrojecDzien2)
        }
        val buttonOgrojecDoDzien3 = findViewById<Button>(R.id.button_Ogrojec_3)
        buttonOgrojecDoDzien3.setOnClickListener {
            val intentOgrojecDzien3 = Intent(this, OgrojecDzien3::class.java)
            startActivity(intentOgrojecDzien3)
        }
        val buttonOgrojecDoDzien4 = findViewById<Button>(R.id.button_Ogrojec_4)
        buttonOgrojecDoDzien4.setOnClickListener {
            val intentOgrojecDzien4 = Intent(this, OgrojecDzien4::class.java)
            startActivity(intentOgrojecDzien4)
        }
        val buttonOgrojecDoDzien5 = findViewById<Button>(R.id.button_Ogrojec_5)
        buttonOgrojecDoDzien5.setOnClickListener {
            val intentOgrojecDzien5 = Intent(this, OgrojecDzien5::class.java)
            startActivity(intentOgrojecDzien5)
        }
        val buttonOgrojecDoDzien6 = findViewById<Button>(R.id.button_Ogrojec_6)
        buttonOgrojecDoDzien6.setOnClickListener {
            val intentOgrojecDzien6 = Intent(this, OgrojecDzien6::class.java)
            startActivity(intentOgrojecDzien6)
        }
        val buttonOgrojecDoDzien7 = findViewById<Button>(R.id.button_Ogrojec_7)
        buttonOgrojecDoDzien7.setOnClickListener {
            val intentOgrojecDzien7 = Intent(this, OgrojecDzien7::class.java)
            startActivity(intentOgrojecDzien7)
        }
        val buttonOgrojecDoDzien8 = findViewById<Button>(R.id.button_Ogrojec_8)
        buttonOgrojecDoDzien8.setOnClickListener {
            val intentOgrojecDzien8 = Intent(this, OgrojecDzien8::class.java)
            startActivity(intentOgrojecDzien8)
        }
        val buttonJordanDzien9 = findViewById<Button>(R.id.button122jordan)
        buttonJordanDzien9.setOnClickListener {
            val intentJordanDzien9 = Intent(this, JordanDzien9::class.java)
            startActivity(intentJordanDzien9)
        }
        val buttonJordanDzien10 = findViewById<Button>(R.id.button123jordan)
        buttonJordanDzien10.setOnClickListener {
            val intentJordanDzien10 = Intent(this, JordanDzien10::class.java)
            startActivity(intentJordanDzien10)
        }
        val buttonJordanDzien11 = findViewById<Button>(R.id.button124jordan)
        buttonJordanDzien11.setOnClickListener {
            val intentJordanDzien11 = Intent(this, JordanDzien11::class.java)
            startActivity(intentJordanDzien11)
        }
        val buttonJordanDzien12 = findViewById<Button>(R.id.button125jordan)
        buttonJordanDzien12.setOnClickListener {
            val intentJordanDzien12 = Intent(this, JordanDzien12::class.java)
            startActivity(intentJordanDzien12)
        }
        val buttonJordanDzien13 = findViewById<Button>(R.id.button126jordan)
        buttonJordanDzien13.setOnClickListener {
            val intentJordanDzien13 = Intent(this, JordanDzien13::class.java)
            startActivity(intentJordanDzien13)
        }
        val buttonJordanDzien14 = findViewById<Button>(R.id.button127jordan)
        buttonJordanDzien14.setOnClickListener {
            val intentJordanDzien14 = Intent(this, JordanDzien14::class.java)
            startActivity(intentJordanDzien14)
        }
        val buttonJordanDzien15 = findViewById<Button>(R.id.button128jordan)
        buttonJordanDzien15.setOnClickListener {
            val intentJordanDzien15 = Intent(this, JordanDzien15::class.java)
            startActivity(intentJordanDzien15)
        }
        val buttonJordanDzien16 = findViewById<Button>(R.id.button129jordan)
        buttonJordanDzien16.setOnClickListener {
            val intentJordanDzien16 = Intent(this, JordanDzien16::class.java)
            startActivity(intentJordanDzien16)
        }
        val buttonJordanDzien17 = findViewById<Button>(R.id.button130jordan)
        buttonJordanDzien17.setOnClickListener {
            val intentJordanDzien17 = Intent(this, JordanDzien17::class.java)
            startActivity(intentJordanDzien17)
        }
        val buttonJordanDzien18 = findViewById<Button>(R.id.button131jordan)
        buttonJordanDzien18.setOnClickListener {
            val intentJordanDzien18 = Intent(this, JordanDzien18::class.java)
            startActivity(intentJordanDzien18)
        }
        val buttonJordanDzien19 = findViewById<Button>(R.id.button132jordan)
        buttonJordanDzien19.setOnClickListener {
            val intentJordanDzien19 = Intent(this, JordanDzien19::class.java)
            startActivity(intentJordanDzien19)
        }
        val buttonJordanDzien20 = findViewById<Button>(R.id.button133jordan)
        buttonJordanDzien20.setOnClickListener {
            val intentJordanDzien20 = Intent(this, JordanDzien20::class.java)
            startActivity(intentJordanDzien20)
        }
        val buttonJordanDzien21 = findViewById<Button>(R.id.button134jordan)
        buttonJordanDzien21.setOnClickListener {
            val intentJordanDzien21 = Intent(this, JordanDzien21::class.java)
            startActivity(intentJordanDzien21)
        }
        val buttonJordanDzien22 = findViewById<Button>(R.id.button135jordan)
        buttonJordanDzien22.setOnClickListener {
            val intentJordanDzien22 = Intent(this, JordanDzien22::class.java)
            startActivity(intentJordanDzien22)
        }
        val buttonJordanDzien23 = findViewById<Button>(R.id.button136jordan)
        buttonJordanDzien23.setOnClickListener {
            val intentJordanDzien23 = Intent(this, JordanDzien23::class.java)
            startActivity(intentJordanDzien23)
        }
        val buttonJordanDzien24 = findViewById<Button>(R.id.button137jordan)
        buttonJordanDzien24.setOnClickListener {
            val intentJordanDzien24 = Intent(this, JordanDzien24::class.java)
            startActivity(intentJordanDzien24)
        }
        val buttonJordanDzien25 = findViewById<Button>(R.id.button138jordan)
        buttonJordanDzien25.setOnClickListener {
            val intentJordanDzien25 = Intent(this, JordanDzien25::class.java)
            startActivity(intentJordanDzien25)
        }
        val buttonJordanDzien26 = findViewById<Button>(R.id.button139jordan)
        buttonJordanDzien26.setOnClickListener {
            val intentJordanDzien26 = Intent(this, JordanDzien26::class.java)
            startActivity(intentJordanDzien26)
        }
        val buttonJordanDzien27 = findViewById<Button>(R.id.button140jordan)
        buttonJordanDzien27.setOnClickListener {
            val intentJordanDzien27 = Intent(this, JordanDzien27::class.java)
            startActivity(intentJordanDzien27)
        }
        val buttonJordanDzien28 = findViewById<Button>(R.id.button141jordan)
        buttonJordanDzien28.setOnClickListener {
            val intentJordanDzien28 = Intent(this, JordanDzien28::class.java)
            startActivity(intentJordanDzien28)
        }
        val buttonJordanDzien29 = findViewById<Button>(R.id.button142jordan)
        buttonJordanDzien29.setOnClickListener {
            val intentJordanDzien29 = Intent(this, JordanDzien29::class.java)
            startActivity(intentJordanDzien29)
        }
        val buttonJordanDzien30 = findViewById<Button>(R.id.button143jordan)
        buttonJordanDzien30.setOnClickListener {
            val intentJordanDzien30 = Intent(this, JordanDzien30::class.java)
            startActivity(intentJordanDzien30)
        }
    }
}

