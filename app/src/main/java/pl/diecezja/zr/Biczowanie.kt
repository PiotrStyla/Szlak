package pl.diecezja.zr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Biczowanie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biczowanie_activity_biczowanie)

        val buttonBiczowanieDoWstep = findViewById<Button>(R.id.button_Biczowanie_Wstep)
        buttonBiczowanieDoWstep.setOnClickListener {
            val intentBiczowanieWstep = Intent(this, BiczowanieWstep::class.java)
            startActivity(intentBiczowanieWstep)
        }
        val buttonBiczowanieDoDzien1 = findViewById<Button>(R.id.button_Biczowanie_1)
        buttonBiczowanieDoDzien1.setOnClickListener {
            val intentBiczowanieDzien1 = Intent(this, BiczowanieDzien1::class.java)
            startActivity(intentBiczowanieDzien1)
        }
        val buttonBiczowanieDoDzien2 = findViewById<Button>(R.id.button_Biczowanie_2)
        buttonBiczowanieDoDzien2.setOnClickListener {
            val intentBiczowanieDzien2 = Intent(this, BiczowanieDzien2::class.java)
            startActivity(intentBiczowanieDzien2)
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
        val buttonOgrojecDoDzien9 = findViewById<Button>(R.id.button_Ogrojec_9)
        buttonOgrojecDoDzien9.setOnClickListener {
            val intentOgrojecDzien9 = Intent(this, OgrojecDzien9::class.java)
            startActivity(intentOgrojecDzien9)
        }
        val buttonOgrojecDoDzien10 = findViewById<Button>(R.id.button_Ogrojec_10)
        buttonOgrojecDoDzien10.setOnClickListener {
            val intentOgrojecDzien10 = Intent(this, OgrojecDzien10::class.java)
            startActivity(intentOgrojecDzien10)
        }
        val buttonOgrojecDoDzien11 = findViewById<Button>(R.id.button_Ogrojec_11)
        buttonOgrojecDoDzien11.setOnClickListener {
            val intentOgrojecDzien11 = Intent(this, OgrojecDzien11::class.java)
            startActivity(intentOgrojecDzien11)
        }
        val buttonOgrojecDoDzien12 = findViewById<Button>(R.id.button_Ogrojec_12)
        buttonOgrojecDoDzien12.setOnClickListener {
            val intentOgrojecDzien12 = Intent(this, OgrojecDzien12::class.java)
            startActivity(intentOgrojecDzien12)
        }
        val buttonOgrojecDoDzien13 = findViewById<Button>(R.id.button_Ogrojec_13)
        buttonOgrojecDoDzien13.setOnClickListener {
            val intentOgrojecDzien13 = Intent(this, OgrojecDzien13::class.java)
            startActivity(intentOgrojecDzien13)
        }
        val buttonOgrojecDoDzien14 = findViewById<Button>(R.id.button_Ogrojec_14)
        buttonOgrojecDoDzien14.setOnClickListener {
            val intentOgrojecDzien14 = Intent(this, OgrojecDzien14::class.java)
            startActivity(intentOgrojecDzien14)
        }
        val buttonOgrojecDoDzien15 = findViewById<Button>(R.id.button_Ogrojec_15)
        buttonOgrojecDoDzien15.setOnClickListener {
            val intentOgrojecDzien15 = Intent(this, OgrojecDzien15::class.java)
            startActivity(intentOgrojecDzien15)
        }
        val buttonOgrojecDoDzien16 = findViewById<Button>(R.id.button_Ogrojec_16)
        buttonOgrojecDoDzien16.setOnClickListener {
            val intentOgrojecDzien16 = Intent(this, OgrojecDzien16::class.java)
            startActivity(intentOgrojecDzien16)
        }
        val buttonOgrojecDoDzien17 = findViewById<Button>(R.id.button_Ogrojec_17)
        buttonOgrojecDoDzien17.setOnClickListener {
            val intentOgrojecDzien17 = Intent(this, OgrojecDzien17::class.java)
            startActivity(intentOgrojecDzien17)
        }
        val buttonOgrojecDoDzien18 = findViewById<Button>(R.id.button_Ogrojec_18)
        buttonOgrojecDoDzien18.setOnClickListener {
            val intentOgrojecDzien18 = Intent(this, OgrojecDzien18::class.java)
            startActivity(intentOgrojecDzien18)
        }
        val buttonOgrojecDoDzien19 = findViewById<Button>(R.id.button_Ogrojec_19)
        buttonOgrojecDoDzien19.setOnClickListener {
            val intentOgrojecDzien19 = Intent(this, OgrojecDzien19::class.java)
            startActivity(intentOgrojecDzien19)
        }
        val buttonOgrojecDoDzien20 = findViewById<Button>(R.id.button_Ogrojec_20)
        buttonOgrojecDoDzien20.setOnClickListener {
            val intentOgrojecDzien20 = Intent(this, OgrojecDzien20::class.java)
            startActivity(intentOgrojecDzien20)
        }
        val buttonOgrojecDoDzien21 = findViewById<Button>(R.id.button_Ogrojec_21)
        buttonOgrojecDoDzien21.setOnClickListener {
            val intentOgrojecDzien21 = Intent(this, OgrojecDzien21::class.java)
            startActivity(intentOgrojecDzien21)
        }
        val buttonOgrojecDoDzien22 = findViewById<Button>(R.id.button_Ogrojec_22)
        buttonOgrojecDoDzien22.setOnClickListener {
            val intentOgrojecDzien22 = Intent(this, OgrojecDzien22::class.java)
            startActivity(intentOgrojecDzien22)
        }
        val buttonOgrojecDoDzien23 = findViewById<Button>(R.id.button_Ogrojec_23)
        buttonOgrojecDoDzien23.setOnClickListener {
            val intentOgrojecDzien23 = Intent(this, OgrojecDzien23::class.java)
            startActivity(intentOgrojecDzien23)
        }
        val buttonOgrojecDoDzien24 = findViewById<Button>(R.id.button_Ogrojec_24)
        buttonOgrojecDoDzien24.setOnClickListener {
            val intentOgrojecDzien24 = Intent(this, OgrojecDzien24::class.java)
            startActivity(intentOgrojecDzien24)
        }
        val buttonOgrojecDoDzien25 = findViewById<Button>(R.id.button_Ogrojec_25)
        buttonOgrojecDoDzien25.setOnClickListener {
            val intentOgrojecDzien25 = Intent(this, OgrojecDzien25::class.java)
            startActivity(intentOgrojecDzien25)
        }
        val buttonOgrojecDoDzien26 = findViewById<Button>(R.id.button_Ogrojec_26)
        buttonOgrojecDoDzien26.setOnClickListener {
            val intentOgrojecDzien26 = Intent(this, OgrojecDzien26::class.java)
            startActivity(intentOgrojecDzien26)
        }
        val buttonOgrojecDoDzien27 = findViewById<Button>(R.id.button_Ogrojec_27)
        buttonOgrojecDoDzien27.setOnClickListener {
            val intentOgrojecDzien27 = Intent(this, OgrojecDzien27::class.java)
            startActivity(intentOgrojecDzien27)
        }
        val buttonOgrojecDoDzien28 = findViewById<Button>(R.id.button_Ogrojec_28)
        buttonOgrojecDoDzien28.setOnClickListener {
            val intentOgrojecDzien28 = Intent(this, OgrojecDzien28::class.java)
            startActivity(intentOgrojecDzien28)
        }
        val buttonOgrojecDoDzien29 = findViewById<Button>(R.id.button_Ogrojec_29)
        buttonOgrojecDoDzien29.setOnClickListener {
            val intentOgrojecDzien29 = Intent(this, OgrojecDzien29::class.java)
            startActivity(intentOgrojecDzien29)
        }
        val buttonOgrojecDoDzien30 = findViewById<Button>(R.id.button_Ogrojec_30)
        buttonOgrojecDoDzien30.setOnClickListener {
            val intentOgrojecDzien30 = Intent(this, OgrojecDzien30::class.java)
            startActivity(intentOgrojecDzien30)
        }
    }

}
