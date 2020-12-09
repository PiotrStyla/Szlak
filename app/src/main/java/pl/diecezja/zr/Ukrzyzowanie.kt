package pl.diecezja.zr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ukrzyzowanie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ukrzyzowanie_activity_ukrzyzowanie)


        val buttonUkrzyzowanieDoWstep = findViewById<Button>(R.id.button_Ukrzyzowanie_Wstep)
        buttonUkrzyzowanieDoWstep.setOnClickListener {
            val intentUkrzyzowanieDoWstep = Intent(this, Ukrzyzowanie_Wstep::class.java)
            startActivity(intentUkrzyzowanieDoWstep)
        }
        val buttonUkrzyzowanieDoDzien1 = findViewById<Button>(R.id.button_Ukrzyzowanie_1)
        buttonUkrzyzowanieDoDzien1.setOnClickListener {
            val intentUkrzyzowanieDzien1 = Intent(this, UkrzyzowanieDzien1::class.java)
            startActivity(intentUkrzyzowanieDzien1)
        }
        val buttonUkrzyzowanieDoDzien2 = findViewById<Button>(R.id.button_Ukrzyzowanie_2)
        buttonUkrzyzowanieDoDzien2.setOnClickListener {
            val intentUkrzyzowanieDzien2 = Intent(this, UkrzyzowanieDzien2::class.java)
            startActivity(intentUkrzyzowanieDzien2)
        }
        val buttonUkrzyzowanieDoDzien3 = findViewById<Button>(R.id.button_Ukrzyzowanie_3)
        buttonUkrzyzowanieDoDzien3.setOnClickListener {
            val intentUkrzyzowanieDzien3 = Intent(this, UkrzyzowanieDzien3::class.java)
            startActivity(intentUkrzyzowanieDzien3)
        }
        val buttonUkrzyzowanieDoDzien4 = findViewById<Button>(R.id.button_Ukrzyzowanie_4)
        buttonUkrzyzowanieDoDzien4.setOnClickListener {
            val intentUkrzyzowanieDzien4 = Intent(this, UkrzyzowanieDzien4::class.java)
            startActivity(intentUkrzyzowanieDzien4)
        }
        val buttonUkrzyzowanieDoDzien5 = findViewById<Button>(R.id.button_Ukrzyzowanie_5)
        buttonUkrzyzowanieDoDzien5.setOnClickListener {
            val intentUkrzyzowanieDzien5 = Intent(this, UkrzyzowanieDzien5::class.java)
            startActivity(intentUkrzyzowanieDzien5)
        }
        val buttonUkrzyzowanieDoDzien6 = findViewById<Button>(R.id.button_Ukrzyzowanie_6)
        buttonUkrzyzowanieDoDzien6.setOnClickListener {
            val intentUkrzyzowanieDzien6 = Intent(this, UkrzyzowanieDzien6::class.java)
            startActivity(intentUkrzyzowanieDzien6)
        }
        val buttonUkrzyzowanieDoDzien7 = findViewById<Button>(R.id.button_Ukrzyzowanie_7)
        buttonUkrzyzowanieDoDzien7.setOnClickListener {
            val intentUkrzyzowanieDzien7 = Intent(this, UkrzyzowanieDzien7::class.java)
            startActivity(intentUkrzyzowanieDzien7)
        }
        val buttonUkrzyzowanieDoDzien8 = findViewById<Button>(R.id.button_Ukrzyzowanie_8)
        buttonUkrzyzowanieDoDzien8.setOnClickListener {
            val intentUkrzyzowanieDzien8 = Intent(this, UkrzyzowanieDzien8::class.java)
            startActivity(intentUkrzyzowanieDzien8)
        }
        val buttonUkrzyzowanieDoDzien9 = findViewById<Button>(R.id.button_Ukrzyzowanie_9)
        buttonUkrzyzowanieDoDzien9.setOnClickListener {
            val intentUkrzyzowanieDzien9 = Intent(this, UkrzyzowanieDzien9::class.java)
            startActivity(intentUkrzyzowanieDzien9)
        }
        val buttonUkrzyzowanieDoDzien10 = findViewById<Button>(R.id.button_Ukrzyzowanie_10)
        buttonUkrzyzowanieDoDzien10.setOnClickListener {
            val intentUkrzyzowanieDzien10 = Intent(this, UkrzyzowanieDzien10::class.java)
            startActivity(intentUkrzyzowanieDzien10)
        }
        val buttonUkrzyzowanieDoDzien11 = findViewById<Button>(R.id.button_Ukrzyzowanie_11)
        buttonUkrzyzowanieDoDzien11.setOnClickListener {
            val intentUkrzyzowanieDzien11 = Intent(this, UkrzyzowanieDzien11::class.java)
            startActivity(intentUkrzyzowanieDzien11)
        }
        val buttonUkrzyzowanieDoDzien12 = findViewById<Button>(R.id.button_Ukrzyzowanie_12)
        buttonUkrzyzowanieDoDzien12.setOnClickListener {
            val intentUkrzyzowanieDzien12 = Intent(this, UkrzyzowanieDzien12::class.java)
            startActivity(intentUkrzyzowanieDzien12)
        }
        val buttonDrogaKrzyzowaDoDzien13 = findViewById<Button>(R.id.button_Droga_Krzyzowa_13)
        buttonDrogaKrzyzowaDoDzien13.setOnClickListener {
            val intentDrogaKrzyzowaDzien13 = Intent(this, DrogaKrzyzowaDzien13::class.java)
            startActivity(intentDrogaKrzyzowaDzien13)
        }
        val buttonDrogaKrzyzowaDoDzien14 = findViewById<Button>(R.id.button_Droga_Krzyzowa_14)
        buttonDrogaKrzyzowaDoDzien14.setOnClickListener {
            val intentDrogaKrzyzowaDzien14 = Intent(this, DrogaKrzyzowaDzien14::class.java)
            startActivity(intentDrogaKrzyzowaDzien14)
        }
        val buttonDrogaKrzyzowaDoDzien15 = findViewById<Button>(R.id.button_Droga_Krzyzowa_15)
        buttonDrogaKrzyzowaDoDzien15.setOnClickListener {
            val intentDrogaKrzyzowaDzien15 = Intent(this, DrogaKrzyzowaDzien15::class.java)
            startActivity(intentDrogaKrzyzowaDzien15)
        }
        val buttonDrogaKrzyzowaDoDzien16 = findViewById<Button>(R.id.button_Droga_Krzyzowa_16)
        buttonDrogaKrzyzowaDoDzien16.setOnClickListener {
            val intentDrogaKrzyzowaDzien16 = Intent(this, DrogaKrzyzowaDzien16::class.java)
            startActivity(intentDrogaKrzyzowaDzien16)
        }
        val buttonDrogaKrzyzowaDoDzien17 = findViewById<Button>(R.id.button_Droga_Krzyzowa_17)
        buttonDrogaKrzyzowaDoDzien17.setOnClickListener {
            val intentDrogaKrzyzowaDzien17 = Intent(this, DrogaKrzyzowaDzien17::class.java)
            startActivity(intentDrogaKrzyzowaDzien17)
        }
        val buttonDrogaKrzyzowaDoDzien18 = findViewById<Button>(R.id.button_Droga_Krzyzowa_18)
        buttonDrogaKrzyzowaDoDzien18.setOnClickListener {
            val intentDrogaKrzyzowaDzien18 = Intent(this, DrogaKrzyzowaDzien18::class.java)
            startActivity(intentDrogaKrzyzowaDzien18)
        }
        val buttonDrogaKrzyzowaDoDzien19 = findViewById<Button>(R.id.button_Droga_Krzyzowa_19)
        buttonDrogaKrzyzowaDoDzien19.setOnClickListener {
            val intentDrogaKrzyzowaDzien19 = Intent(this, DrogaKrzyzowaDzien19::class.java)
            startActivity(intentDrogaKrzyzowaDzien19)
        }
        val buttonDrogaKrzyzowaDoDzien20 = findViewById<Button>(R.id.button_Droga_Krzyzowa_20)
        buttonDrogaKrzyzowaDoDzien20.setOnClickListener {
            val intentDrogaKrzyzowaDzien20 = Intent(this, DrogaKrzyzowaDzien20::class.java)
            startActivity(intentDrogaKrzyzowaDzien20)
        }
        val buttonDrogaKrzyzowaDoDzien21 = findViewById<Button>(R.id.button_Droga_Krzyzowa_21)
        buttonDrogaKrzyzowaDoDzien21.setOnClickListener {
            val intentDrogaKrzyzowaDzien21 = Intent(this, DrogaKrzyzowaDzien21::class.java)
            startActivity(intentDrogaKrzyzowaDzien21)
        }
        val buttonDrogaKrzyzowaDoDzien22 = findViewById<Button>(R.id.button_Droga_Krzyzowa_22)
        buttonDrogaKrzyzowaDoDzien22.setOnClickListener {
            val intentDrogaKrzyzowaDzien22 = Intent(this, DrogaKrzyzowaDzien22::class.java)
            startActivity(intentDrogaKrzyzowaDzien22)
        }
        val buttonDrogaKrzyzowaDoDzien23 = findViewById<Button>(R.id.button_Droga_Krzyzowa_23)
        buttonDrogaKrzyzowaDoDzien23.setOnClickListener {
            val intentDrogaKrzyzowaDzien23 = Intent(this, DrogaKrzyzowaDzien23::class.java)
            startActivity(intentDrogaKrzyzowaDzien23)
        }
        val buttonDrogaKrzyzowaDoDzien24 = findViewById<Button>(R.id.button_Droga_Krzyzowa_24)
        buttonDrogaKrzyzowaDoDzien24.setOnClickListener {
            val intentDrogaKrzyzowaDzien24 = Intent(this, DrogaKrzyzowaDzien24::class.java)
            startActivity(intentDrogaKrzyzowaDzien24)
        }
        val buttonDrogaKrzyzowaDoDzien25 = findViewById<Button>(R.id.button_Droga_Krzyzowa_25)
        buttonDrogaKrzyzowaDoDzien25.setOnClickListener {
            val intentDrogaKrzyzowaDzien25 = Intent(this, DrogaKrzyzowaDzien25::class.java)
            startActivity(intentDrogaKrzyzowaDzien25)
        }
        val buttonDrogaKrzyzowaDoDzien26 = findViewById<Button>(R.id.button_Droga_Krzyzowa_26)
        buttonDrogaKrzyzowaDoDzien26.setOnClickListener {
            val intentDrogaKrzyzowaDzien26 = Intent(this, DrogaKrzyzowaDzien26::class.java)
            startActivity(intentDrogaKrzyzowaDzien26)
        }
        val buttonDrogaKrzyzowaDoDzien27 = findViewById<Button>(R.id.button_Droga_Krzyzowa_27)
        buttonDrogaKrzyzowaDoDzien27.setOnClickListener {
            val intentDrogaKrzyzowaDzien27 = Intent(this, DrogaKrzyzowaDzien27::class.java)
            startActivity(intentDrogaKrzyzowaDzien27)
        }
        val buttonDrogaKrzyzowaDoDzien28 = findViewById<Button>(R.id.button_Droga_Krzyzowa_28)
        buttonDrogaKrzyzowaDoDzien28.setOnClickListener {
            val intentDrogaKrzyzowaDzien28 = Intent(this, DrogaKrzyzowaDzien28::class.java)
            startActivity(intentDrogaKrzyzowaDzien28)
        }
        val buttonDrogaKrzyzowaDoDzien29 = findViewById<Button>(R.id.button_Droga_Krzyzowa_29)
        buttonDrogaKrzyzowaDoDzien29.setOnClickListener {
            val intentDrogaKrzyzowaDzien29 = Intent(this, DrogaKrzyzowaDzien29::class.java)
            startActivity(intentDrogaKrzyzowaDzien29)
        }
        val buttonCierniemUkoronowanieDoDzien30 = findViewById<Button>(R.id.button_CierniemUkoronowanie_30)
        buttonCierniemUkoronowanieDoDzien30.setOnClickListener {
            val intentCierniemUkoronowanieDzien30 = Intent(this, CierniemUkoronowanieDzien30::class.java)
            startActivity(intentCierniemUkoronowanieDzien30)
        }
    }
}