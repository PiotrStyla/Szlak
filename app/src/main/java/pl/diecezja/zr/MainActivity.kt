package pl.diecezja.zr

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_wprowadzenie  = findViewById<Button>(R.id.button_wprowadzenie)
        button_wprowadzenie.setOnClickListener {
            val intent1 = Intent(this, Wprowadzenie::class.java)
            startActivity(intent1)
        }
        val button_main_do_radosnych  = findViewById<Button>(R.id.button2)
        button_main_do_radosnych.setOnClickListener {
            val intent2 = Intent(this, Radosne::class.java)
            startActivity(intent2)
        }
        val buttonMainDoSwiatla  = findViewById<Button>(R.id.button3)
        buttonMainDoSwiatla.setOnClickListener {
            val intent2a = Intent(this, Swiatla::class.java)
            startActivity(intent2a)
        }
        val buttonMainDoBolesne  = findViewById<Button>(R.id.button4)
        buttonMainDoBolesne.setOnClickListener {
            val intent3 = Intent(this, Bolesne::class.java)
            startActivity(intent3)
        }

    }



    //menu start info about app

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            if(item.itemId == R.id.action_about){
                showInfo()
            }
        }
        return true
    }
    //info sign on main page
    @SuppressLint("StringFormatInvalid")
    private fun showInfo(){
        val dialogTitle = getString(R.string.about_title, BuildConfig.VERSION_NAME)
        val dialogMessage = getString(R.string.about_message)
        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogTitle)
        builder.setMessage(dialogMessage)
        builder.create().show()

    }
    //menu end
}
