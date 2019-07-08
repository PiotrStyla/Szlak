package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Zwiastowanie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zwiastowanie)

        val button_zwiastowanie_do_wstep  = findViewById (R.id.button_Zwiastowanie_Wstep) as Button
        button_zwiastowanie_do_wstep.setOnClickListener {
            val intent_zwiastowanie_wstep = Intent(this, ZwiastowanieWstep::class.java)
            startActivity(intent_zwiastowanie_wstep)
        }
        val button_zwiastowanie_do_dzien1  = findViewById (R.id.button27) as Button
        button_zwiastowanie_do_dzien1.setOnClickListener {
            val intent_zwiastowanie_dzien1 = Intent(this, ZwiastowanieDzien1::class.java)
            startActivity(intent_zwiastowanie_dzien1)
        }
        val button_zwiastowanie_do_dzien2  = findViewById (R.id.button24) as Button
        button_zwiastowanie_do_dzien2.setOnClickListener {
            val intent_zwiastowanie_dzien2 = Intent(this, ZwiastowanieDzien2::class.java)
            startActivity(intent_zwiastowanie_dzien2)
        }
        val button_zwiastowanie_do_dzien3  = findViewById (R.id.button25) as Button
        button_zwiastowanie_do_dzien3.setOnClickListener {
            val intent_zwiastowanie_dzien3 = Intent(this, ZwiastowanieDzien3::class.java)
            startActivity(intent_zwiastowanie_dzien3)
        }
        val button_zwiastowanie_do_dzien4  = findViewById (R.id.button26) as Button
        button_zwiastowanie_do_dzien4.setOnClickListener {
            val intent_zwiastowanie_dzien4 = Intent(this, ZwiastowanieDzien4::class.java)
            startActivity(intent_zwiastowanie_dzien4)
        }
        val button_zwiastowanie_do_dzien5  = findViewById (R.id.button33) as Button
        button_zwiastowanie_do_dzien5.setOnClickListener {
            val intent_zwiastowanie_dzien5 = Intent(this, ZwiastowanieDzien5::class.java)
            startActivity(intent_zwiastowanie_dzien5)
        }
        val button_zwiastowanie_do_dzien6  = findViewById (R.id.button28) as Button
        button_zwiastowanie_do_dzien6.setOnClickListener {
            val intent_zwiastowanie_dzien6 = Intent(this, ZwiastowanieDzien6::class.java)
            startActivity(intent_zwiastowanie_dzien6)
        }
        val button_zwiastowanie_do_dzien7  = findViewById (R.id.button29) as Button
        button_zwiastowanie_do_dzien7.setOnClickListener {
            val intent_zwiastowanie_dzien7 = Intent(this, ZwiastowanieDzien7::class.java)
            startActivity(intent_zwiastowanie_dzien7)
        }
        val button_zwiastowanie_do_dzien8  = findViewById (R.id.button30) as Button
        button_zwiastowanie_do_dzien8.setOnClickListener {
            val intent_zwiastowanie_dzien8 = Intent(this, ZwiastowanieDzien8::class.java)
            startActivity(intent_zwiastowanie_dzien8)
        }
        val button_zwiastowanie_do_dzien9  = findViewById (R.id.button31) as Button
        button_zwiastowanie_do_dzien9.setOnClickListener {
            val intent_zwiastowanie_dzien9 = Intent(this, ZwiastowanieDzien9::class.java)
            startActivity(intent_zwiastowanie_dzien9)
        }
        val button_zwiastowanie_do_dzien10  = findViewById (R.id.button32) as Button
        button_zwiastowanie_do_dzien10.setOnClickListener {
            val intent_zwiastowanie_dzien10 = Intent(this, ZwiastowanieDzien10::class.java)
            startActivity(intent_zwiastowanie_dzien10)
        }





        }

    }










