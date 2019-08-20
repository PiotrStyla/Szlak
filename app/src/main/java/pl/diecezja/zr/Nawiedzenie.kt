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
        val buttonNawiedzenieDoDzien12 = findViewById<Button>(R.id.button65)
        buttonNawiedzenieDoDzien12.setOnClickListener {
            val intentNawiedzenieDzien12 = Intent(this, NawiedzenieDzien12::class.java)
            startActivity(intentNawiedzenieDzien12)
        }
        val buttonNawiedzenieDoDzien13 = findViewById<Button>(R.id.button66)
        buttonNawiedzenieDoDzien13.setOnClickListener {
            val intentNawiedzenieDzien13 = Intent(this, NawiedzenieDzien13::class.java)
            startActivity(intentNawiedzenieDzien13)
        }
        val buttonNawiedzenieDoDzien14 = findViewById<Button>(R.id.button67)
        buttonNawiedzenieDoDzien14.setOnClickListener {
            val intentNawiedzenieDzien14 = Intent(this, NawiedzenieDzien14::class.java)
            startActivity(intentNawiedzenieDzien14)
        }
        val buttonNawiedzenieDoDzien15 = findViewById<Button>(R.id.button68)
        buttonNawiedzenieDoDzien15.setOnClickListener {
            val intentNawiedzenieDzien15 = Intent(this, NawiedzenieDzien15::class.java)
            startActivity(intentNawiedzenieDzien15)
        }
        val buttonNawiedzenieDoDzien16 = findViewById<Button>(R.id.button69)
        buttonNawiedzenieDoDzien16.setOnClickListener {
            val intentNawiedzenieDzien16 = Intent(this, NawiedzenieDzien16::class.java)
            startActivity(intentNawiedzenieDzien16)
        }
        val buttonNawiedzenieDoDzien17 = findViewById<Button>(R.id.button70)
        buttonNawiedzenieDoDzien17.setOnClickListener {
            val intentNawiedzenieDzien17 = Intent(this, NawiedzenieDzien17::class.java)
            startActivity(intentNawiedzenieDzien17)
        }
        val buttonNawiedzenieDoDzien18 = findViewById<Button>(R.id.button71)
        buttonNawiedzenieDoDzien18.setOnClickListener {
            val intentNawiedzenieDzien18 = Intent(this, NawiedzenieDzien18::class.java)
            startActivity(intentNawiedzenieDzien18)
        }
        val buttonNawiedzenieDoDzien19 = findViewById<Button>(R.id.button72)
        buttonNawiedzenieDoDzien19.setOnClickListener {
            val intentNawiedzenieDzien19 = Intent(this, NawiedzenieDzien19::class.java)
            startActivity(intentNawiedzenieDzien19)
        }
        val buttonNawiedzenieDoDzien20 = findViewById<Button>(R.id.button73)
        buttonNawiedzenieDoDzien20.setOnClickListener {
            val intentNawiedzenieDzien20 = Intent(this, NawiedzenieDzien20::class.java)
            startActivity(intentNawiedzenieDzien20)
        }
        val buttonNawiedzenieDoDzien21 = findViewById<Button>(R.id.button74)
        buttonNawiedzenieDoDzien21.setOnClickListener {
            val intentNawiedzenieDzien21 = Intent(this, NawiedzenieDzien21::class.java)
            startActivity(intentNawiedzenieDzien21)
        }
        val buttonNawiedzenieDoDzien22 = findViewById<Button>(R.id.button75)
        buttonNawiedzenieDoDzien22.setOnClickListener {
            val intentNawiedzenieDzien22 = Intent(this, NawiedzenieDzien22::class.java)
            startActivity(intentNawiedzenieDzien22)
        }
        val buttonNawiedzenieDoDzien23 = findViewById<Button>(R.id.button76)
        buttonNawiedzenieDoDzien23.setOnClickListener {
            val intentNawiedzenieDzien23 = Intent(this, NawiedzenieDzien23::class.java)
            startActivity(intentNawiedzenieDzien23)
        }
        val buttonNawiedzenieDoDzien24 = findViewById<Button>(R.id.button77)
        buttonNawiedzenieDoDzien24.setOnClickListener {
            val intentNawiedzenieDzien24 = Intent(this, NawiedzenieDzien24::class.java)
            startActivity(intentNawiedzenieDzien24)
        }
        val buttonNawiedzenieDoDzien25 = findViewById<Button>(R.id.button78)
        buttonNawiedzenieDoDzien25.setOnClickListener {
            val intentNawiedzenieDzien25 = Intent(this, NawiedzenieDzien25::class.java)
            startActivity(intentNawiedzenieDzien25)
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
