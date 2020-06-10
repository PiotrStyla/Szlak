package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Wieczernik : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wieczernik_activity_wieczernik)


        val buttonWieczernikDoWstep = findViewById<Button>(R.id.button_Wieczernik_wstep)
        buttonWieczernikDoWstep.setOnClickListener {
            val intentWieczernikWstep = Intent(this, Wieczernik_Wstep::class.java)
            startActivity(intentWieczernikWstep)
        }
        val buttonWieczernikDzien1 = findViewById<Button>(R.id.button114wieczernik)
        buttonWieczernikDzien1.setOnClickListener {
            val intentWieczernikDzien1 = Intent(this, WieczernikDzien1::class.java)
            startActivity(intentWieczernikDzien1)
        }
        val buttonWieczernikDzien2 = findViewById<Button>(R.id.button115wieczernik)
        buttonWieczernikDzien2.setOnClickListener {
            val intentWieczernikDzien2 = Intent(this, WieczernikDzien2::class.java)
            startActivity(intentWieczernikDzien2)
        }
        val buttonWieczernikDzien3 = findViewById<Button>(R.id.button116wieczernik)
        buttonWieczernikDzien3.setOnClickListener {
            val intentWieczernikDzien3 = Intent(this, WieczernikDzien3::class.java)
            startActivity(intentWieczernikDzien3)
        }
        val buttonWieczernikDzien4 = findViewById<Button>(R.id.button117wieczernik)
        buttonWieczernikDzien4.setOnClickListener {
            val intentWieczernikDzien4 = Intent(this, WieczernikDzien4::class.java)
            startActivity(intentWieczernikDzien4)
        }
        val buttonTaborDzien5 = findViewById<Button>(R.id.button118tabor)
        buttonTaborDzien5.setOnClickListener {
            val intentTaborDzien5 = Intent(this, TaborDzien5::class.java)
            startActivity(intentTaborDzien5)
        }
        val buttonTaborDzien6 = findViewById<Button>(R.id.button119tabor)
        buttonTaborDzien6.setOnClickListener {
            val intentTaborDzien6 = Intent(this, TaborDzien6::class.java)
            startActivity(intentTaborDzien6)
        }
        val buttonTaborDzien7 = findViewById<Button>(R.id.button120tabor)
        buttonTaborDzien7.setOnClickListener {
            val intentTaborDzien7 = Intent(this, TaborDzien7::class.java)
            startActivity(intentTaborDzien7)
        }
        val buttonTaborDzien8 = findViewById<Button>(R.id.button121tabor)
        buttonTaborDzien8.setOnClickListener {
            val intentTaborDzien8 = Intent(this, TaborDzien8::class.java)
            startActivity(intentTaborDzien8)
        }
        val buttonTaborDzien9 = findViewById<Button>(R.id.button122tabor)
        buttonTaborDzien9.setOnClickListener {
            val intentTaborDzien9 = Intent(this, TaborDzien9::class.java)
            startActivity(intentTaborDzien9)
        }
        val buttonTaborDzien10 = findViewById<Button>(R.id.button123tabor)
        buttonTaborDzien10.setOnClickListener {
            val intentTaborDzien10 = Intent(this, TaborDzien10::class.java)
            startActivity(intentTaborDzien10)
        }
        val buttonTaborDzien11 = findViewById<Button>(R.id.button124tabor)
        buttonTaborDzien11.setOnClickListener {
            val intentTaborDzien11 = Intent(this, TaborDzien11::class.java)
            startActivity(intentTaborDzien11)
        }
        val buttonTaborDzien12 = findViewById<Button>(R.id.button125tabor)
        buttonTaborDzien12.setOnClickListener {
            val intentTaborDzien12 = Intent(this, TaborDzien12::class.java)
            startActivity(intentTaborDzien12)
        }
        val buttonTaborDzien13 = findViewById<Button>(R.id.button126tabor)
        buttonTaborDzien13.setOnClickListener {
            val intentTaborDzien13 = Intent(this, TaborDzien13::class.java)
            startActivity(intentTaborDzien13)
        }
        val buttonTaborDzien14 = findViewById<Button>(R.id.button127tabor)
        buttonTaborDzien14.setOnClickListener {
            val intentTaborDzien14 = Intent(this, TaborDzien14::class.java)
            startActivity(intentTaborDzien14)
        }
        val buttonTaborDzien15 = findViewById<Button>(R.id.button128tabor)
        buttonTaborDzien15.setOnClickListener {
            val intentTaborDzien15 = Intent(this, TaborDzien15::class.java)
            startActivity(intentTaborDzien15)
        }
        val buttonTaborDzien16 = findViewById<Button>(R.id.button129tabor)
        buttonTaborDzien16.setOnClickListener {
            val intentTaborDzien16 = Intent(this, TaborDzien16::class.java)
            startActivity(intentTaborDzien16)
        }
        val buttonTaborDzien17 = findViewById<Button>(R.id.button130tabor)
        buttonTaborDzien17.setOnClickListener {
            val intentTaborDzien17 = Intent(this, TaborDzien17::class.java)
            startActivity(intentTaborDzien17)
        }
        val buttonTaborDzien18 = findViewById<Button>(R.id.button131tabor)
        buttonTaborDzien18.setOnClickListener {
            val intentTaborDzien18 = Intent(this, TaborDzien18::class.java)
            startActivity(intentTaborDzien18)
        }
        val buttonTaborDzien19 = findViewById<Button>(R.id.button132tabor)
        buttonTaborDzien19.setOnClickListener {
            val intentTaborDzien19 = Intent(this, TaborDzien19::class.java)
            startActivity(intentTaborDzien19)
        }
        val buttonTaborDzien20 = findViewById<Button>(R.id.button133tabor)
        buttonTaborDzien20.setOnClickListener {
            val intentTaborDzien20 = Intent(this, TaborDzien20::class.java)
            startActivity(intentTaborDzien20)
        }
        val buttonTaborDzien21 = findViewById<Button>(R.id.button134tabor)
        buttonTaborDzien21.setOnClickListener {
            val intentTaborDzien21 = Intent(this, TaborDzien21::class.java)
            startActivity(intentTaborDzien21)
        }
        val buttonTaborDzien22 = findViewById<Button>(R.id.button135tabor)
        buttonTaborDzien22.setOnClickListener {
            val intentTaborDzien22 = Intent(this, TaborDzien22::class.java)
            startActivity(intentTaborDzien22)
        }
        val buttonTaborDzien23 = findViewById<Button>(R.id.button136tabor)
        buttonTaborDzien23.setOnClickListener {
            val intentTaborDzien23 = Intent(this, TaborDzien23::class.java)
            startActivity(intentTaborDzien23)
        }
        val buttonTaborDzien24 = findViewById<Button>(R.id.button137tabor)
        buttonTaborDzien24.setOnClickListener {
            val intentTaborDzien24 = Intent(this, TaborDzien24::class.java)
            startActivity(intentTaborDzien24)
        }
        val buttonTaborDzien25 = findViewById<Button>(R.id.button138tabor)
        buttonTaborDzien25.setOnClickListener {
            val intentTaborDzien25 = Intent(this, TaborDzien25::class.java)
            startActivity(intentTaborDzien25)
        }
        val buttonTaborDzien26 = findViewById<Button>(R.id.button139tabor)
        buttonTaborDzien26.setOnClickListener {
            val intentTaborDzien26 = Intent(this, TaborDzien26::class.java)
            startActivity(intentTaborDzien26)
        }
        val buttonTaborDzien27 = findViewById<Button>(R.id.button140tabor)
        buttonTaborDzien27.setOnClickListener {
            val intentTaborDzien27 = Intent(this, TaborDzien27::class.java)
            startActivity(intentTaborDzien27)
        }
        val buttonTaborDzien28 = findViewById<Button>(R.id.button141tabor)
        buttonTaborDzien28.setOnClickListener {
            val intentTaborDzien28 = Intent(this, TaborDzien28::class.java)
            startActivity(intentTaborDzien28)
        }
        val buttonTaborDzien29 = findViewById<Button>(R.id.button142tabor)
        buttonTaborDzien29.setOnClickListener {
            val intentTaborDzien29 = Intent(this, TaborDzien29::class.java)
            startActivity(intentTaborDzien29)
        }
        val buttonTaborDzien30 = findViewById<Button>(R.id.button143tabor)
        buttonTaborDzien30.setOnClickListener {
            val intentTaborDzien30 = Intent(this, TaborDzien30::class.java)
            startActivity(intentTaborDzien30)
        }
    }
}
