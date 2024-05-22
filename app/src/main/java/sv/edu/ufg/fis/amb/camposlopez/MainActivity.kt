package sv.edu.ufg.fis.amb.camposlopez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import sv.edu.ufg.fis.amb.camposlopez.databinding.ActivityGuardarBinding
import sv.edu.ufg.fis.amb.camposlopez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNuevoRegistro.setOnClickListener {
            val intent = Intent(this, Guardar::class.java)
            startActivity(intent)
        }
    }
}