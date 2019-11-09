package pl.diecezja.zr

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radosne_rekolekcje.*

class RadosneRekolekcje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radosne_rekolekcje)

        button_Link_Zr.setOnClickListener{
            var message = Toast.makeText(applicationContext,"Konieczne jest połączenie z internetem!",Toast.LENGTH_LONG)
            message.show()

            var adres = "http://zr.diecezja.pl/"
            var zr = Intent(ACTION_VIEW, Uri.parse(adres))
            startActivity(zr)

        }
    }

}
