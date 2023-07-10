package info.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import metodopago.facturaActivity

class infoViaje1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_viaje1)
        val button1precio=findViewById<Button>(R.id.button1precio)
        button1precio.setOnClickListener { facnavegar() }
    }
    private fun facnavegar (){
        val intent=Intent(this,facturaActivity::class.java)
        startActivity(intent)
    }
}