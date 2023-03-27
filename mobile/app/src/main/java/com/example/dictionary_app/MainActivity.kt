package com.example.dictionary_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.dictionary_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGoToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.buFlashCard.setOnClickListener {
            val intent = Intent(this, FlashCardActivity::class.java)
            startActivity(intent)
        }
    }

    fun onClickGoToSearch(view: View) { //Test button
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //add a menu button on the tools bar
        menuInflater.inflate(R.menu.menubuttons, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handles presses on the action bar items
        return when (item.itemId) {
            R.id.tbSettings -> {
                Toast.makeText(applicationContext, "SETTINGS", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.tbLicences -> {
                Toast.makeText(applicationContext, "LICENCES", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LicencesActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.tbAbout -> {
                Toast.makeText(applicationContext, "ABOUT US", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, AboutUsActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun openFavouriteWords(view: View?) {
    }
}