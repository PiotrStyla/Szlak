package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ofiarowanie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ofiarowanie_activity_ofiarowanie)

        val buttonOfiarowanieDoWstep = findViewById<Button>(R.id.button_Ofiarowanie_Wstep)
        buttonOfiarowanieDoWstep.setOnClickListener {
            val intentOfiarowanieWstep = Intent(this, OfiarowanieWstep::class.java)
            startActivity(intentOfiarowanieWstep)
        }
        val buttonOfiarowanieDoDzien1 = findViewById<Button>(R.id.button114)
        buttonOfiarowanieDoDzien1.setOnClickListener {
            val intentOfiarowanieDzien1 = Intent(this, OfiarowanieDzien1::class.java)
            startActivity(intentOfiarowanieDzien1)
        }
        val buttonOfiarowanieDoDzien2 = findViewById<Button>(R.id.button115)
        buttonOfiarowanieDoDzien2.setOnClickListener {
            val intentOfiarowanieDzien2 = Intent(this, OfiarowanieDzien2::class.java)
            startActivity(intentOfiarowanieDzien2)
        }
        val buttonOfiarowanieDoDzien3 = findViewById<Button>(R.id.button116)
        buttonOfiarowanieDoDzien3.setOnClickListener {
            val intentOfiarowanieDzien3 = Intent(this, OfiarowanieDzien3::class.java)
            startActivity(intentOfiarowanieDzien3)
        }
        val buttonOfiarowanieDoDzien4 = findViewById<Button>(R.id.button117)
        buttonOfiarowanieDoDzien4.setOnClickListener {
            val intentOfiarowanieDzien4 = Intent(this, OfiarowanieDzien4::class.java)
            startActivity(intentOfiarowanieDzien4)
        }
        val buttonOfiarowanieDoDzien5 = findViewById<Button>(R.id.button118)
        buttonOfiarowanieDoDzien5.setOnClickListener {
            val intentOfiarowanieDzien5 = Intent(this, OfiarowanieDzien5::class.java)
            startActivity(intentOfiarowanieDzien5)
        }
        val buttonOfiarowanieDoDzien6 = findViewById<Button>(R.id.button119)
        buttonOfiarowanieDoDzien6.setOnClickListener {
            val intentOfiarowanieDzien6 = Intent(this, OfiarowanieDzien6::class.java)
            startActivity(intentOfiarowanieDzien6)
        }
        val buttonNarodzenieDoDzien7 = findViewById<Button>(R.id.button90)
        buttonNarodzenieDoDzien7.setOnClickListener {
            val intentNarodzenieDzien7 = Intent(this, NarodzenieDzien7::class.java)
            startActivity(intentNarodzenieDzien7)
        }
        val buttonNarodzenieDoDzien8 = findViewById<Button>(R.id.button91)
        buttonNarodzenieDoDzien8.setOnClickListener {
            val intentNarodzenieDzien8 = Intent(this, NarodzenieDzien8::class.java)
            startActivity(intentNarodzenieDzien8)
        }
        val buttonNarodzenieDoDzien9 = findViewById<Button>(R.id.button92)
        buttonNarodzenieDoDzien9.setOnClickListener {
            val intentNarodzenieDzien9 = Intent(this, NarodzenieDzien9::class.java)
            startActivity(intentNarodzenieDzien9)
        }
        val buttonNarodzenieDoDzien10 = findViewById<Button>(R.id.button93)
        buttonNarodzenieDoDzien10.setOnClickListener {
            val intentNarodzenieDzien10 = Intent(this, NarodzenieDzien10::class.java)
            startActivity(intentNarodzenieDzien10)
        }
        val buttonNarodzenieDoDzien11 = findViewById<Button>(R.id.button94)
        buttonNarodzenieDoDzien11.setOnClickListener {
            val intentNarodzenieDzien11 = Intent(this, NarodzenieDzien11::class.java)
            startActivity(intentNarodzenieDzien11)
        }
        val buttonNarodzenieDoDzien12 = findViewById<Button>(R.id.button95)
        buttonNarodzenieDoDzien12.setOnClickListener {
            val intentNarodzenieDzien12 = Intent(this, NarodzenieDzien12::class.java)
            startActivity(intentNarodzenieDzien12)
        }
        val buttonNarodzenieDoDzien13 = findViewById<Button>(R.id.button96)
        buttonNarodzenieDoDzien13.setOnClickListener {
            val intentNarodzenieDzien13 = Intent(this, NarodzenieDzien13::class.java)
            startActivity(intentNarodzenieDzien13)
        }
        val buttonNarodzenieDoDzien14 = findViewById<Button>(R.id.button97)
        buttonNarodzenieDoDzien14.setOnClickListener {
            val intentNarodzenieDzien14 = Intent(this, NarodzenieDzien14::class.java)
            startActivity(intentNarodzenieDzien14)
        }
        val buttonNarodzenieDoDzien15 = findViewById<Button>(R.id.button98)
        buttonNarodzenieDoDzien15.setOnClickListener {
            val intentNarodzenieDzien15 = Intent(this, NarodzenieDzien15::class.java)
            startActivity(intentNarodzenieDzien15)
        }
        val buttonNarodzenieDoDzien16 = findViewById<Button>(R.id.button99)
        buttonNarodzenieDoDzien16.setOnClickListener {
            val intentNarodzenieDzien16 = Intent(this, NarodzenieDzien16::class.java)
            startActivity(intentNarodzenieDzien16)
        }
        val buttonNarodzenieDoDzien17 = findViewById<Button>(R.id.button100)
        buttonNarodzenieDoDzien17.setOnClickListener {
            val intentNarodzenieDzien17 = Intent(this, NarodzenieDzien17::class.java)
            startActivity(intentNarodzenieDzien17)
        }
        val buttonNarodzenieDoDzien18 = findViewById<Button>(R.id.button101)
        buttonNarodzenieDoDzien18.setOnClickListener {
            val intentNarodzenieDzien18 = Intent(this, NarodzenieDzien18::class.java)
            startActivity(intentNarodzenieDzien18)
        }
        val buttonNarodzenieDoDzien19 = findViewById<Button>(R.id.button102)
        buttonNarodzenieDoDzien19.setOnClickListener {
            val intentNarodzenieDzien19 = Intent(this, NarodzenieDzien19::class.java)
            startActivity(intentNarodzenieDzien19)
        }
        val buttonNarodzenieDoDzien20 = findViewById<Button>(R.id.button103)
        buttonNarodzenieDoDzien20.setOnClickListener {
            val intentNarodzenieDzien20 = Intent(this, NarodzenieDzien20::class.java)
            startActivity(intentNarodzenieDzien20)
        }
        val buttonNarodzenieDoDzien21 = findViewById<Button>(R.id.button104)
        buttonNarodzenieDoDzien21.setOnClickListener {
            val intentNarodzenieDzien21 = Intent(this, NarodzenieDzien21::class.java)
            startActivity(intentNarodzenieDzien21)
        }
        val buttonNarodzenieDoDzien22 = findViewById<Button>(R.id.button105)
        buttonNarodzenieDoDzien22.setOnClickListener {
            val intentNarodzenieDzien22 = Intent(this, NarodzenieDzien22::class.java)
            startActivity(intentNarodzenieDzien22)
        }
        val buttonNarodzenieDoDzien23 = findViewById<Button>(R.id.button106)
        buttonNarodzenieDoDzien23.setOnClickListener {
            val intentNarodzenieDzien23 = Intent(this, NarodzenieDzien23::class.java)
            startActivity(intentNarodzenieDzien23)
        }
        val buttonNarodzenieDoDzien24 = findViewById<Button>(R.id.button107)
        buttonNarodzenieDoDzien24.setOnClickListener {
            val intentNarodzenieDzien24 = Intent(this, NarodzenieDzien24::class.java)
            startActivity(intentNarodzenieDzien24)
        }
        val buttonNarodzenieDoDzien25 = findViewById<Button>(R.id.button108)
        buttonNarodzenieDoDzien25.setOnClickListener {
            val intentNarodzenieDzien25 = Intent(this, NarodzenieDzien25::class.java)
            startActivity(intentNarodzenieDzien25)
        }
        val buttonNarodzenieDoDzien26 = findViewById<Button>(R.id.button109)
        buttonNarodzenieDoDzien26.setOnClickListener {
            val intentNarodzenieDzien26 = Intent(this, NarodzenieDzien26::class.java)
            startActivity(intentNarodzenieDzien26)
        }
        val buttonNarodzenieDoDzien27 = findViewById<Button>(R.id.button110)
        buttonNarodzenieDoDzien27.setOnClickListener {
            val intentNarodzenieDzien27 = Intent(this, NarodzenieDzien27::class.java)
            startActivity(intentNarodzenieDzien27)
        }
        val buttonNarodzenieDoDzien28 = findViewById<Button>(R.id.button111)
        buttonNarodzenieDoDzien28.setOnClickListener {
            val intentNarodzenieDzien28 = Intent(this, NarodzenieDzien28::class.java)
            startActivity(intentNarodzenieDzien28)
        }
        val buttonNarodzenieDoDzien29 = findViewById<Button>(R.id.button112)
        buttonNarodzenieDoDzien29.setOnClickListener {
            val intentNarodzenieDzien29 = Intent(this, NarodzenieDzien29::class.java)
            startActivity(intentNarodzenieDzien29)
        }
        val buttonNarodzenieDoDzien30 = findViewById<Button>(R.id.button113)
        buttonNarodzenieDoDzien30.setOnClickListener {
            val intentNarodzenieDzien30 = Intent(this, NarodzenieDzien30::class.java)
            startActivity(intentNarodzenieDzien30)
        }

    }
}
