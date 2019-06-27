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

        val button_zwiastowanie_do_dzien3  = findViewById (R.id.button25) as Button
        button_zwiastowanie_do_dzien3.setOnClickListener {
            val intent_zwiastowanie_dzien3 = Intent(this, ZwiastowanieDzien3::class.java)
            startActivity(intent_zwiastowanie_dzien3)
        }


        }

    }










