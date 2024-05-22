package sv.edu.ufg.fis.amb.camposlopez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sv.edu.ufg.fis.amb.camposlopez.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {
    private lateinit var binding: ActivityGuardarBinding
    private lateinit var db: BaseDeDatos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = BaseDeDatos(this)

        binding.btnGuardar.setOnClickListener {
            val mensaje = binding.textData.text.toString()
            val registro = Registro(mensaje)
            db.insertarMensaje(registro)
            finish()
            Toast.makeText(this, "SE HA GUARDADO EL MENSAJE", Toast.LENGTH_LONG).show()
        }
    }
}