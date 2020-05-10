package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tabor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabor_activity_tabor)

        val buttonTaborDoWstep = findViewById<Button>(R.id.button_Tabor_wstep)
        buttonTaborDoWstep.setOnClickListener {
            val intentTaborWstep = Intent(this, TaborWstep::class.java)
            startActivity(intentTaborWstep)
        }
        val buttonTaborDzien1 = findViewById<Button>(R.id.button114tabor)
        buttonTaborDzien1.setOnClickListener {
            val intentTaborDzien1 = Intent(this, TaborDzien1::class.java)
            startActivity(intentTaborDzien1)
        }
        val buttonTaborDzien2 = findViewById<Button>(R.id.button115tabor)
        buttonTaborDzien2.setOnClickListener {
            val intentTaborDzien2 = Intent(this, GalileaDzien2::class.java)
            startActivity(intentTaborDzien2)
        }
        val buttonTaborDzien3 = findViewById<Button>(R.id.button116tabor)
        buttonTaborDzien3.setOnClickListener {
            val intentTaborDzien3 = Intent(this, TaborDzien3::class.java)
            startActivity(intentTaborDzien3)
        }
        val buttonTaborDzien4 = findViewById<Button>(R.id.button117tabor)
        buttonTaborDzien4.setOnClickListener {
            val intentTaborDzien4 = Intent(this, TaborDzien4::class.java)
            startActivity(intentTaborDzien4)
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
        val buttonGalileaDzien8 = findViewById<Button>(R.id.button121galilea)
        buttonGalileaDzien8.setOnClickListener {
            val intentGalileaDzien8 = Intent(this, GalileaDzien8::class.java)
            startActivity(intentGalileaDzien8)
        }
        val buttonGalileaDzien9 = findViewById<Button>(R.id.button122galilea)
        buttonGalileaDzien9.setOnClickListener {
            val intentGalileaDzien9 = Intent(this, GalileaDzien9::class.java)
            startActivity(intentGalileaDzien9)
        }
        val buttonGalileaDzien10 = findViewById<Button>(R.id.button123galilea)
        buttonGalileaDzien10.setOnClickListener {
            val intentGalileaDzien10 = Intent(this, GalileaDzien10::class.java)
            startActivity(intentGalileaDzien10)
        }
        val buttonGalileaDzien11 = findViewById<Button>(R.id.button124galilea)
        buttonGalileaDzien11.setOnClickListener {
            val intentGalileaDzien11 = Intent(this, GalileaDzien11::class.java)
            startActivity(intentGalileaDzien11)
        }
        val buttonGalileaDzien12 = findViewById<Button>(R.id.button125galilea)
        buttonGalileaDzien12.setOnClickListener {
            val intentGalileaDzien12 = Intent(this, GalileaDzien12::class.java)
            startActivity(intentGalileaDzien12)
        }
        val buttonGalileaDzien13 = findViewById<Button>(R.id.button126galilea)
        buttonGalileaDzien13.setOnClickListener {
            val intentGalileaDzien13 = Intent(this, GalileaDzien13::class.java)
            startActivity(intentGalileaDzien13)
        }
        val buttonGalileaDzien14 = findViewById<Button>(R.id.button127galilea)
        buttonGalileaDzien14.setOnClickListener {
            val intentGalileaDzien14 = Intent(this, GalileaDzien14::class.java)
            startActivity(intentGalileaDzien14)
        }
        val buttonGalileaDzien15 = findViewById<Button>(R.id.button128galilea)
        buttonGalileaDzien15.setOnClickListener {
            val intentGalileaDzien15 = Intent(this, GalileaDzien15::class.java)
            startActivity(intentGalileaDzien15)
        }
        val buttonGalileaDzien16 = findViewById<Button>(R.id.button129galilea)
        buttonGalileaDzien16.setOnClickListener {
            val intentGalileaDzien16 = Intent(this, GalileaDzien16::class.java)
            startActivity(intentGalileaDzien16)
        }
        val buttonGalileaDzien17 = findViewById<Button>(R.id.button130galilea)
        buttonGalileaDzien17.setOnClickListener {
            val intentGalileaDzien17 = Intent(this, GalileaDzien17::class.java)
            startActivity(intentGalileaDzien17)
        }
        val buttonGalileaDzien18 = findViewById<Button>(R.id.button131galilea)
        buttonGalileaDzien18.setOnClickListener {
            val intentGalileaDzien18 = Intent(this, GalileaDzien18::class.java)
            startActivity(intentGalileaDzien18)
        }
        val buttonGalileaDzien19 = findViewById<Button>(R.id.button132galilea)
        buttonGalileaDzien19.setOnClickListener {
            val intentGalileaDzien19 = Intent(this, GalileaDzien19::class.java)
            startActivity(intentGalileaDzien19)
        }
        val buttonGalileaDzien20 = findViewById<Button>(R.id.button133galilea)
        buttonGalileaDzien20.setOnClickListener {
            val intentGalileaDzien20 = Intent(this, GalileaDzien20::class.java)
            startActivity(intentGalileaDzien20)
        }
        val buttonGalileaDzien21 = findViewById<Button>(R.id.button134galilea)
        buttonGalileaDzien21.setOnClickListener {
            val intentGalileaDzien21 = Intent(this, GalileaDzien21::class.java)
            startActivity(intentGalileaDzien21)
        }
        val buttonGalileaDzien22 = findViewById<Button>(R.id.button135galilea)
        buttonGalileaDzien22.setOnClickListener {
            val intentGalileaDzien22 = Intent(this, GalileaDzien22::class.java)
            startActivity(intentGalileaDzien22)
        }
        val buttonGalileaDzien23 = findViewById<Button>(R.id.button136galilea)
        buttonGalileaDzien23.setOnClickListener {
            val intentGalileaDzien23 = Intent(this, GalileaDzien23::class.java)
            startActivity(intentGalileaDzien23)
        }
        val buttonGalileaDzien24 = findViewById<Button>(R.id.button137galilea)
        buttonGalileaDzien24.setOnClickListener {
            val intentGalileaDzien24 = Intent(this, GalileaDzien24::class.java)
            startActivity(intentGalileaDzien24)
        }
        val buttonGalileaDzien25 = findViewById<Button>(R.id.button138galilea)
        buttonGalileaDzien25.setOnClickListener {
            val intentGalileaDzien25 = Intent(this, GalileaDzien25::class.java)
            startActivity(intentGalileaDzien25)
        }
        val buttonGalileaDzien26 = findViewById<Button>(R.id.button139galilea)
        buttonGalileaDzien26.setOnClickListener {
            val intentGalileaDzien26 = Intent(this, GalileaDzien26::class.java)
            startActivity(intentGalileaDzien26)
        }
        val buttonGalileaDzien27 = findViewById<Button>(R.id.button140galilea)
        buttonGalileaDzien27.setOnClickListener {
            val intentGalileaDzien27 = Intent(this, GalileaDzien27::class.java)
            startActivity(intentGalileaDzien27)
        }
        val buttonGalileaDzien28 = findViewById<Button>(R.id.button141galilea)
        buttonGalileaDzien28.setOnClickListener {
            val intentGalileaDzien28 = Intent(this, GalileaDzien28::class.java)
            startActivity(intentGalileaDzien28)
        }
        val buttonGalileaDzien29 = findViewById<Button>(R.id.button142galilea)
        buttonGalileaDzien29.setOnClickListener {
            val intentGalileaDzien29 = Intent(this, GalileaDzien29::class.java)
            startActivity(intentGalileaDzien29)
        }
        val buttonGalileaDzien30 = findViewById<Button>(R.id.button143galilea)
        buttonGalileaDzien30.setOnClickListener {
            val intentGalileaDzien30 = Intent(this, GalileaDzien30::class.java)
            startActivity(intentGalileaDzien30)
        }
    }
}
