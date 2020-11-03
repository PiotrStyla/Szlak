package pl.diecezja.zr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DrogaKrzyzowa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.droga_activity_droga_krzyzowa)

        val buttonDrogaKrzyzowaDoWstep = findViewById<Button>(R.id.button_Droga_Krzyzowa_Wstep)
        buttonDrogaKrzyzowaDoWstep.setOnClickListener {
            val intentDrogaKrzyzowaWstep = Intent(this, DrogaKrzyzowaWstep::class.java)
            startActivity(intentDrogaKrzyzowaWstep)
        }
        val buttonDrogaKrzyzowaDoDzien1 = findViewById<Button>(R.id.button_Droga_Krzyzowa_1)
        buttonDrogaKrzyzowaDoDzien1.setOnClickListener {
            val intentDrogaKrzyzowaDzien1 = Intent(this, DrogaKrzyzowaDzien1::class.java)
            startActivity(intentDrogaKrzyzowaDzien1)
        }
        val buttonDrogaKrzyzowaDoDzien2 = findViewById<Button>(R.id.button_Droga_Krzyzowa_2)
        buttonDrogaKrzyzowaDoDzien2.setOnClickListener {
            val intentDrogaKrzyzowaDzien2 = Intent(this, DrogaKrzyzowaDzien2::class.java)
            startActivity(intentDrogaKrzyzowaDzien2)
        }
        val buttonDrogaKrzyzowaDoDzien3 = findViewById<Button>(R.id.button_Droga_Krzyzowa_3)
        buttonDrogaKrzyzowaDoDzien3.setOnClickListener {
            val intentDrogaKrzyzowaDzien3 = Intent(this, DrogaKrzyzowaDzien3::class.java)
            startActivity(intentDrogaKrzyzowaDzien3)
        }
        val buttonDrogaKrzyzowaDoDzien4 = findViewById<Button>(R.id.button_Droga_Krzyzowa_4)
        buttonDrogaKrzyzowaDoDzien4.setOnClickListener {
            val intentDrogaKrzyzowaDzien4 = Intent(this, DrogaKrzyzowaDzien4::class.java)
            startActivity(intentDrogaKrzyzowaDzien4)
        }
        val buttonCierniemUkoronowanieDoDzien5 = findViewById<Button>(R.id.button_CierniemUkoronowanie_5)
        buttonCierniemUkoronowanieDoDzien5.setOnClickListener {
            val intentCierniemUkoronowanieDzien5 = Intent(this, CierniemUkoronowanieDzien5::class.java)
            startActivity(intentCierniemUkoronowanieDzien5)
        }
        val buttonCierniemUkoronowanieDoDzien6 = findViewById<Button>(R.id.button_CierniemUkoronowanie_6)
        buttonCierniemUkoronowanieDoDzien6.setOnClickListener {
            val intentCierniemUkoronowanieDzien6 = Intent(this, CierniemUkoronowanieDzien6::class.java)
            startActivity(intentCierniemUkoronowanieDzien6)
        }
        val buttonCierniemUkoronowanieDoDzien7 = findViewById<Button>(R.id.button_CierniemUkoronowanie_7)
        buttonCierniemUkoronowanieDoDzien7.setOnClickListener {
            val intentCierniemUkoronowanieDzien7 = Intent(this, CierniemUkoronowanieDzien7::class.java)
            startActivity(intentCierniemUkoronowanieDzien7)
        }
        val buttonCierniemUkoronowanieDoDzien8 = findViewById<Button>(R.id.button_CierniemUkoronowanie_8)
        buttonCierniemUkoronowanieDoDzien8.setOnClickListener {
            val intentCierniemUkoronowanieDzien8 = Intent(this, CierniemUkoronowanieDzien8::class.java)
            startActivity(intentCierniemUkoronowanieDzien8)
        }
        val buttonCierniemUkoronowanieDoDzien9 = findViewById<Button>(R.id.button_CierniemUkoronowanie_9)
        buttonCierniemUkoronowanieDoDzien9.setOnClickListener {
            val intentCierniemUkoronowanieDzien9 = Intent(this, CierniemUkoronowanieDzien9::class.java)
            startActivity(intentCierniemUkoronowanieDzien9)
        }
        val buttonCierniemUkoronowanieDoDzien10 = findViewById<Button>(R.id.button_CierniemUkoronowanie_10)
        buttonCierniemUkoronowanieDoDzien10.setOnClickListener {
            val intentCierniemUkoronowanieDzien10 = Intent(this, CierniemUkoronowanieDzien10::class.java)
            startActivity(intentCierniemUkoronowanieDzien10)
        }
        val buttonCierniemUkoronowanieDoDzien11 = findViewById<Button>(R.id.button_CierniemUkoronowanie_11)
        buttonCierniemUkoronowanieDoDzien11.setOnClickListener {
            val intentCierniemUkoronowanieDzien11 = Intent(this, CierniemUkoronowanieDzien11::class.java)
            startActivity(intentCierniemUkoronowanieDzien11)
        }
        val buttonCierniemUkoronowanieDoDzien12 = findViewById<Button>(R.id.button_CierniemUkoronowanie_12)
        buttonCierniemUkoronowanieDoDzien12.setOnClickListener {
            val intentCierniemUkoronowanieDzien12 = Intent(this, CierniemUkoronowanieDzien12::class.java)
            startActivity(intentCierniemUkoronowanieDzien12)
        }
        val buttonCierniemUkoronowanieDoDzien13 = findViewById<Button>(R.id.button_CierniemUkoronowanie_13)
        buttonCierniemUkoronowanieDoDzien13.setOnClickListener {
            val intentCierniemUkoronowanieDzien13 = Intent(this, CierniemUkoronowanieDzien13::class.java)
            startActivity(intentCierniemUkoronowanieDzien13)
        }
        val buttonCierniemUkoronowanieDoDzien14 = findViewById<Button>(R.id.button_CierniemUkoronowanie_14)
        buttonCierniemUkoronowanieDoDzien14.setOnClickListener {
            val intentCierniemUkoronowanieDzien14 = Intent(this, CierniemUkoronowanieDzien14::class.java)
            startActivity(intentCierniemUkoronowanieDzien14)
        }
        val buttonCierniemUkoronowanieDoDzien15 = findViewById<Button>(R.id.button_CierniemUkoronowanie_15)
        buttonCierniemUkoronowanieDoDzien15.setOnClickListener {
            val intentCierniemUkoronowanieDzien15 = Intent(this, CierniemUkoronowanieDzien15::class.java)
            startActivity(intentCierniemUkoronowanieDzien15)
        }
        val buttonCierniemUkoronowanieDoDzien16 = findViewById<Button>(R.id.button_CierniemUkoronowanie_16)
        buttonCierniemUkoronowanieDoDzien16.setOnClickListener {
            val intentCierniemUkoronowanieDzien16 = Intent(this, CierniemUkoronowanieDzien16::class.java)
            startActivity(intentCierniemUkoronowanieDzien16)
        }
        val buttonCierniemUkoronowanieDoDzien17 = findViewById<Button>(R.id.button_CierniemUkoronowanie_17)
        buttonCierniemUkoronowanieDoDzien17.setOnClickListener {
            val intentCierniemUkoronowanieDzien17 = Intent(this, CierniemUkoronowanieDzien17::class.java)
            startActivity(intentCierniemUkoronowanieDzien17)
        }
        val buttonCierniemUkoronowanieDoDzien18 = findViewById<Button>(R.id.button_CierniemUkoronowanie_18)
        buttonCierniemUkoronowanieDoDzien18.setOnClickListener {
            val intentCierniemUkoronowanieDzien18 = Intent(this, CierniemUkoronowanieDzien18::class.java)
            startActivity(intentCierniemUkoronowanieDzien18)
        }
        val buttonCierniemUkoronowanieDoDzien19 = findViewById<Button>(R.id.button_CierniemUkoronowanie_19)
        buttonCierniemUkoronowanieDoDzien19.setOnClickListener {
            val intentCierniemUkoronowanieDzien19 = Intent(this, CierniemUkoronowanieDzien19::class.java)
            startActivity(intentCierniemUkoronowanieDzien19)
        }
        val buttonCierniemUkoronowanieDoDzien20 = findViewById<Button>(R.id.button_CierniemUkoronowanie_20)
        buttonCierniemUkoronowanieDoDzien20.setOnClickListener {
            val intentCierniemUkoronowanieDzien20 = Intent(this, CierniemUkoronowanieDzien20::class.java)
            startActivity(intentCierniemUkoronowanieDzien20)
        }
        val buttonCierniemUkoronowanieDoDzien21 = findViewById<Button>(R.id.button_CierniemUkoronowanie_21)
        buttonCierniemUkoronowanieDoDzien21.setOnClickListener {
            val intentCierniemUkoronowanieDzien21 = Intent(this, CierniemUkoronowanieDzien21::class.java)
            startActivity(intentCierniemUkoronowanieDzien21)
        }
        val buttonCierniemUkoronowanieDoDzien22 = findViewById<Button>(R.id.button_CierniemUkoronowanie_22)
        buttonCierniemUkoronowanieDoDzien22.setOnClickListener {
            val intentCierniemUkoronowanieDzien22 = Intent(this, CierniemUkoronowanieDzien22::class.java)
            startActivity(intentCierniemUkoronowanieDzien22)
        }
        val buttonCierniemUkoronowanieDoDzien23 = findViewById<Button>(R.id.button_CierniemUkoronowanie_23)
        buttonCierniemUkoronowanieDoDzien23.setOnClickListener {
            val intentCierniemUkoronowanieDzien23 = Intent(this, CierniemUkoronowanieDzien23::class.java)
            startActivity(intentCierniemUkoronowanieDzien23)
        }
        val buttonCierniemUkoronowanieDoDzien24 = findViewById<Button>(R.id.button_CierniemUkoronowanie_24)
        buttonCierniemUkoronowanieDoDzien24.setOnClickListener {
            val intentCierniemUkoronowanieDzien24 = Intent(this, CierniemUkoronowanieDzien24::class.java)
            startActivity(intentCierniemUkoronowanieDzien24)
        }
        val buttonCierniemUkoronowanieDoDzien25 = findViewById<Button>(R.id.button_CierniemUkoronowanie_25)
        buttonCierniemUkoronowanieDoDzien25.setOnClickListener {
            val intentCierniemUkoronowanieDzien25 = Intent(this, CierniemUkoronowanieDzien25::class.java)
            startActivity(intentCierniemUkoronowanieDzien25)
        }
        val buttonCierniemUkoronowanieDoDzien26 = findViewById<Button>(R.id.button_CierniemUkoronowanie_26)
        buttonCierniemUkoronowanieDoDzien26.setOnClickListener {
            val intentCierniemUkoronowanieDzien26 = Intent(this, CierniemUkoronowanieDzien26::class.java)
            startActivity(intentCierniemUkoronowanieDzien26)
        }
        val buttonCierniemUkoronowanieDoDzien27 = findViewById<Button>(R.id.button_CierniemUkoronowanie_27)
        buttonCierniemUkoronowanieDoDzien27.setOnClickListener {
            val intentCierniemUkoronowanieDzien27 = Intent(this, CierniemUkoronowanieDzien27::class.java)
            startActivity(intentCierniemUkoronowanieDzien27)
        }
        val buttonCierniemUkoronowanieDoDzien28 = findViewById<Button>(R.id.button_CierniemUkoronowanie_28)
        buttonCierniemUkoronowanieDoDzien28.setOnClickListener {
            val intentCierniemUkoronowanieDzien28 = Intent(this, CierniemUkoronowanieDzien28::class.java)
            startActivity(intentCierniemUkoronowanieDzien28)
        }
        val buttonCierniemUkoronowanieDoDzien29 = findViewById<Button>(R.id.button_CierniemUkoronowanie_29)
        buttonCierniemUkoronowanieDoDzien29.setOnClickListener {
            val intentCierniemUkoronowanieDzien29 = Intent(this, CierniemUkoronowanieDzien29::class.java)
            startActivity(intentCierniemUkoronowanieDzien29)
        }
        val buttonCierniemUkoronowanieDoDzien30 = findViewById<Button>(R.id.button_CierniemUkoronowanie_30)
        buttonCierniemUkoronowanieDoDzien30.setOnClickListener {
            val intentCierniemUkoronowanieDzien30 = Intent(this, CierniemUkoronowanieDzien30::class.java)
            startActivity(intentCierniemUkoronowanieDzien30)
        }
    }
}