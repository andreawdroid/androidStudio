package info.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import metodopago.facturaActivity

class infoViaje2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_viaje2)
        val button2precio=findViewById<Button>(R.id.button2precio)
        button2precio.setOnClickListener { facnavegar2() }
    }
    private fun facnavegar2 (){
        val intent= Intent(this, facturaActivity::class.java)
        startActivity(intent)
    }
}