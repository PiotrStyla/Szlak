package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Jordan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jordan_activity_jordan)

        val buttonJordanDoWstep = findViewById<Button>(R.id.button_Jordan_Wstep)
        buttonJordanDoWstep.setOnClickListener {
            val intentJordanWstep = Intent(this, JordanWstep::class.java)
            startActivity(intentJordanWstep)
        }
        val buttonJordanDzien1 = findViewById<Button>(R.id.button114jordan)
        buttonJordanDzien1.setOnClickListener {
            val intentJordanDzien1 = Intent(this, JordanDzien1::class.java)
            startActivity(intentJordanDzien1)
        }
        val buttonJordanDzien2 = findViewById<Button>(R.id.button115jordan)
        buttonJordanDzien2.setOnClickListener {
            val intentJordanDzien2 = Intent(this, JordanDzien2::class.java)
            startActivity(intentJordanDzien2)
        }
        val buttonJordanDzien3 = findViewById<Button>(R.id.button116jordan)
        buttonJordanDzien3.setOnClickListener {
            val intentJordanDzien3 = Intent(this, JordanDzien3::class.java)
            startActivity(intentJordanDzien3)
        }
        val buttonJordanDzien4 = findViewById<Button>(R.id.button117jordan)
        buttonJordanDzien4.setOnClickListener {
            val intentJordanDzien4 = Intent(this, JordanDzien4::class.java)
            startActivity(intentJordanDzien4)
        }
        val buttonJordanDzien5 = findViewById<Button>(R.id.button118jordan)
        buttonJordanDzien5.setOnClickListener {
            val intentJordanDzien5 = Intent(this, JordanDzien5::class.java)
            startActivity(intentJordanDzien5)
        }
        val buttonJordanDzien6 = findViewById<Button>(R.id.button119jordan)
        buttonJordanDzien6.setOnClickListener {
            val intentJordanDzien6 = Intent(this, JordanDzien6::class.java)
            startActivity(intentJordanDzien6)
        }
        val buttonJordanDzien7 = findViewById<Button>(R.id.button120jordan)
        buttonJordanDzien7.setOnClickListener {
            val intentJordanDzien7 = Intent(this, JordanDzien7::class.java)
            startActivity(intentJordanDzien7)
        }
    }
}
