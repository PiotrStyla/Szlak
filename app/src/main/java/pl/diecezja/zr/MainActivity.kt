package pl.diecezja.zr

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_wprowadzenie  = findViewById (R.id.button_wprowadzenie) as Button
        button_wprowadzenie.setOnClickListener {
            val intent1 = Intent(this, Wprowadzenie::class.java)
            startActivity(intent1)
        }
        val button_main_do_radosnych  = findViewById (R.id.button2) as Button
        button_main_do_radosnych.setOnClickListener {
            val intent2 = Intent(this, Radosne::class.java)
            startActivity(intent2)
        }
        val buttonMainDoSwiatla  = findViewById (R.id.button3) as Button
        buttonMainDoSwiatla.setOnClickListener {
            val intent2a = Intent(this, Swiatla::class.java)
            startActivity(intent2a)
        }

    }
    //menu start

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
