package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kana_activity_kana)

        val buttonKanaDoWstep = findViewById<Button>(R.id.button_Kana_Wstep)
        buttonKanaDoWstep.setOnClickListener {
            val intentKanaWstep = Intent(this, KanaWstep::class.java)
            startActivity(intentKanaWstep)
        }
        val buttonKanaDzien1 = findViewById<Button>(R.id.button114kana)
        buttonKanaDzien1.setOnClickListener {
            val intentKanaDzien1 = Intent(this, KanaDzien1::class.java)
            startActivity(intentKanaDzien1)
        }
        val buttonKanaDzien2 = findViewById<Button>(R.id.button115kana)
        buttonKanaDzien2.setOnClickListener {
            val intentKanaDzien2 = Intent(this, KanaDzien2::class.java)
            startActivity(intentKanaDzien2)
        }
        val buttonKanaDzien3 = findViewById<Button>(R.id.button116kana)
        buttonKanaDzien3.setOnClickListener {
            val intentKanaDzien3 = Intent(this, KanaDzien3::class.java)
            startActivity(intentKanaDzien3)
        }
        val buttonKanaDzien4 = findViewById<Button>(R.id.button117kana)
        buttonKanaDzien4.setOnClickListener {
            val intentKanaDzien4 = Intent(this, KanaDzien4::class.java)
            startActivity(intentKanaDzien4)
        }
        val buttonKanaDzien5 = findViewById<Button>(R.id.button118kana)
        buttonKanaDzien5.setOnClickListener {
            val intentKanaDzien5 = Intent(this, KanaDzien5::class.java)
            startActivity(intentKanaDzien5)
        }
        val buttonKanaDzien6 = findViewById<Button>(R.id.button119kana)
        buttonKanaDzien6.setOnClickListener {
            val intentKanaDzien6 = Intent(this, KanaDzien6::class.java)
            startActivity(intentKanaDzien6)
        }
        val buttonKanaDzien7 = findViewById<Button>(R.id.button120kana)
        buttonKanaDzien7.setOnClickListener {
            val intentKanaDzien7 = Intent(this, KanaDzien7::class.java)
            startActivity(intentKanaDzien7)
        }
        val buttonKanaDzien8 = findViewById<Button>(R.id.button121kana)
        buttonKanaDzien8.setOnClickListener {
            val intentKanaDzien8 = Intent(this, KanaDzien8::class.java)
            startActivity(intentKanaDzien8)
        }
        val buttonKanaDzien9 = findViewById<Button>(R.id.button122kana)
        buttonKanaDzien9.setOnClickListener {
            val intentKanaDzien9 = Intent(this, KanaDzien9::class.java)
            startActivity(intentKanaDzien9)
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

