package br.com.tcc.tcccardiot21

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.tcc.tcccardiot21.databinding.ActivityMainBinding
import br.com.tcc.tcccardiot21.page.presentation.PageActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.button.setOnClickListener {
            startActivity(Intent(this@MainActivity, PageActivity::class.java))
            finish()
        }
    }
}