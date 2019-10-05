package pl.diecezja.zr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Odnalezienie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.odnalezienie_activity_odnalezienie)

        val buttonOdnalezienieDoWstep = findViewById<Button>(R.id.button_Odnalezienie_Wstep)
        buttonOdnalezienieDoWstep.setOnClickListener {
            val intentOdnalezienieWstep = Intent(this, OdnalezienieWstep::class.java)
            startActivity(intentOdnalezienieWstep)
        }
    }
}
