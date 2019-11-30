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
    }
}
