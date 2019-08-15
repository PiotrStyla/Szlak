package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Nawiedzenie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nawiedzenie_activity_nawiedzenie)

        val buttonZwiastowanieDoWstep = findViewById<Button>(R.id.button_Zwiastowanie_Wstep)
        buttonZwiastowanieDoWstep.setOnClickListener {
            val intentZwiastowanieWstep = Intent(this, ZwiastowanieWstep::class.java)
            startActivity(intentZwiastowanieWstep)
        }
        val buttonNawiedzenieDoDzien1 = findViewById<Button>(R.id.button54)
        buttonNawiedzenieDoDzien1.setOnClickListener {
            val intentNawiedzenieDzien1 = Intent(this, NawiedzenieDzien1::class.java)
            startActivity(intentNawiedzenieDzien1)
        }
        val buttonNawiedzenieDoDzien2 = findViewById<Button>(R.id.button55)
        buttonNawiedzenieDoDzien2.setOnClickListener {
            val intentNawiedzenieDzien2 = Intent(this, NawiedzenieDzien2::class.java)
            startActivity(intentNawiedzenieDzien2)
        }
        val buttonNawiedzenieDoDzien3 = findViewById<Button>(R.id.button56)
        buttonNawiedzenieDoDzien3.setOnClickListener {
            val intentNawiedzenieDzien3 = Intent(this, NawiedzenieDzien3::class.java)
            startActivity(intentNawiedzenieDzien3)
        }
        val buttonNawiedzenieDoDzien4 = findViewById<Button>(R.id.button57)
        buttonNawiedzenieDoDzien4.setOnClickListener {
            val intentNawiedzenieDzien4 = Intent(this, NawiedzenieDzien4::class.java)
            startActivity(intentNawiedzenieDzien4)
        }
        val buttonNawiedzenieDoDzien5 = findViewById<Button>(R.id.button58)
        buttonNawiedzenieDoDzien5.setOnClickListener {
            val intentNawiedzenieDzien5 = Intent(this, NawiedzenieDzien5::class.java)
            startActivity(intentNawiedzenieDzien5)
        }
        val buttonNawiedzenieDoDzien6 = findViewById<Button>(R.id.button59)
        buttonNawiedzenieDoDzien6.setOnClickListener {
            val intentNawiedzenieDzien6 = Intent(this, NawiedzenieDzien6::class.java)
            startActivity(intentNawiedzenieDzien6)
        }
        val buttonNawiedzenieDoDzien7 = findViewById<Button>(R.id.button60)
        buttonNawiedzenieDoDzien7.setOnClickListener {
            val intentNawiedzenieDzien7 = Intent(this, NawiedzenieDzien7::class.java)
            startActivity(intentNawiedzenieDzien7)
        }
        val buttonNawiedzenieDoDzien8 = findViewById<Button>(R.id.button61)
        buttonNawiedzenieDoDzien8.setOnClickListener {
            val intentNawiedzenieDzien8 = Intent(this, NawiedzenieDzien8::class.java)
            startActivity(intentNawiedzenieDzien8)
        }
        val buttonNawiedzenieDoDzien9 = findViewById<Button>(R.id.button62)
        buttonNawiedzenieDoDzien9.setOnClickListener {
            val intentNawiedzenieDzien9 = Intent(this, NawiedzenieDzien9::class.java)
            startActivity(intentNawiedzenieDzien9)
        }
        val buttonNawiedzenieDoDzien10 = findViewById<Button>(R.id.button63)
        buttonNawiedzenieDoDzien10.setOnClickListener {
            val intentNawiedzenieDzien10 = Intent(this, NawiedzenieDzien10::class.java)
            startActivity(intentNawiedzenieDzien10)
        }
        val buttonNawiedzenieDoDzien11 = findViewById<Button>(R.id.button64)
        buttonNawiedzenieDoDzien11.setOnClickListener {
            val intentNawiedzenieDzien11 = Intent(this, NawiedzenieDzien11::class.java)
            startActivity(intentNawiedzenieDzien11)
        }
        val buttonZwiastowanieDoDzien12 = findViewById<Button>(R.id.button35)
        buttonZwiastowanieDoDzien12.setOnClickListener {
            val intentZwiastowanieDzien12 = Intent(this, ZwiastowanieDzien12::class.java)
            startActivity(intentZwiastowanieDzien12)
        }
        val buttonZwiastowanieDoDzien13 = findViewById<Button>(R.id.button36)
        buttonZwiastowanieDoDzien13.setOnClickListener {
            val intentZwiastowanieDzien13 = Intent(this, ZwiastowanieDzien13::class.java)
            startActivity(intentZwiastowanieDzien13)
        }
        val buttonZwiastowanieDoDzien14 = findViewById<Button>(R.id.button37)
        buttonZwiastowanieDoDzien14.setOnClickListener {
            val intentZwiastowanieDzien14 = Intent(this, ZwiastowanieDzien14::class.java)
            startActivity(intentZwiastowanieDzien14)
        }
        val buttonZwiastowanieDoDzien15 = findViewById<Button>(R.id.button38)
        buttonZwiastowanieDoDzien15.setOnClickListener {
            val intentZwiastowanieDzien15 = Intent(this, ZwiastowanieDzien15::class.java)
            startActivity(intentZwiastowanieDzien15)
        }
        val buttonZwiastowanieDoDzien16 = findViewById<Button>(R.id.button39)
        buttonZwiastowanieDoDzien16.setOnClickListener {
            val intentZwiastowanieDzien16 = Intent(this, ZwiastowanieDzien16::class.java)
            startActivity(intentZwiastowanieDzien16)
        }
        val buttonZwiastowanieDoDzien17 = findViewById<Button>(R.id.button40)
        buttonZwiastowanieDoDzien17.setOnClickListener {
            val intentZwiastowanieDzien17 = Intent(this, ZwiastowanieDzien17::class.java)
            startActivity(intentZwiastowanieDzien17)
        }
        val buttonZwiastowanieDoDzien18 = findViewById<Button>(R.id.button41)
        buttonZwiastowanieDoDzien18.setOnClickListener {
            val intentZwiastowanieDzien18 = Intent(this, ZwiastowanieDzien18::class.java)
            startActivity(intentZwiastowanieDzien18)
        }
        val buttonZwiastowanieDoDzien19 = findViewById<Button>(R.id.button42)
        buttonZwiastowanieDoDzien19.setOnClickListener {
            val intentZwiastowanieDzien19 = Intent(this, ZwiastowanieDzien19::class.java)
            startActivity(intentZwiastowanieDzien19)
        }
        val buttonZwiastowanieDoDzien20 = findViewById<Button>(R.id.button43)
        buttonZwiastowanieDoDzien20.setOnClickListener {
            val intentZwiastowanieDzien20 = Intent(this, ZwiastowanieDzien20::class.java)
            startActivity(intentZwiastowanieDzien20)
        }
        val buttonZwiastowanieDoDzien21 = findViewById<Button>(R.id.button44)
        buttonZwiastowanieDoDzien21.setOnClickListener {
            val intentZwiastowanieDzien21 = Intent(this, ZwiastowanieDzien21::class.java)
            startActivity(intentZwiastowanieDzien21)
        }
        val buttonZwiastowanieDoDzien22 = findViewById<Button>(R.id.button45)
        buttonZwiastowanieDoDzien22.setOnClickListener {
            val intentZwiastowanieDzien22 = Intent(this, ZwiastowanieDzien22::class.java)
            startActivity(intentZwiastowanieDzien22)
        }
        val buttonZwiastowanieDoDzien23 = findViewById<Button>(R.id.button46)
        buttonZwiastowanieDoDzien23.setOnClickListener {
            val intentZwiastowanieDzien23 = Intent(this, ZwiastowanieDzien23::class.java)
            startActivity(intentZwiastowanieDzien23)
        }
        val buttonZwiastowanieDoDzien24 = findViewById<Button>(R.id.button47)
        buttonZwiastowanieDoDzien24.setOnClickListener {
            val intentZwiastowanieDzien24 = Intent(this, ZwiastowanieDzien24::class.java)
            startActivity(intentZwiastowanieDzien24)
        }
        val buttonZwiastowanieDoDzien25 = findViewById<Button>(R.id.button48)
        buttonZwiastowanieDoDzien25.setOnClickListener {
            val intentZwiastowanieDzien25 = Intent(this, ZwiastowanieDzien25::class.java)
            startActivity(intentZwiastowanieDzien25)
        }
        val buttonZwiastowanieDoDzien26 = findViewById<Button>(R.id.button49)
        buttonZwiastowanieDoDzien26.setOnClickListener {
            val intentZwiastowanieDzien26 = Intent(this, ZwiastowanieDzien26::class.java)
            startActivity(intentZwiastowanieDzien26)
        }
        val buttonZwiastowanieDoDzien27 = findViewById<Button>(R.id.button50)
        buttonZwiastowanieDoDzien27.setOnClickListener {
            val intentZwiastowanieDzien27 = Intent(this, ZwiastowanieDzien27::class.java)
            startActivity(intentZwiastowanieDzien27)
        }
        val buttonZwiastowanieDoDzien28 = findViewById<Button>(R.id.button51)
        buttonZwiastowanieDoDzien28.setOnClickListener {
            val intentZwiastowanieDzien28 = Intent(this, ZwiastowanieDzien28::class.java)
            startActivity(intentZwiastowanieDzien28)
        }
        val buttonZwiastowanieDoDzien29 = findViewById<Button>(R.id.button52)
        buttonZwiastowanieDoDzien29.setOnClickListener {
            val intentZwiastowanieDzien29 = Intent(this, ZwiastowanieDzien29::class.java)
            startActivity(intentZwiastowanieDzien29)
        }
        val buttonZwiastowanieDoDzien30 = findViewById<Button>(R.id.button53)
        buttonZwiastowanieDoDzien30.setOnClickListener {
            val intentZwiastowanieDzien30 = Intent(this, ZwiastowanieDzien30::class.java)
            startActivity(intentZwiastowanieDzien30)
        }

    }
}
