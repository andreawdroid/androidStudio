package info.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import metodopago.facturaActivity

class infoViaje3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_viaje3)
        val button3precio=findViewById<Button>(R.id.button3precio)
        button3precio.setOnClickListener { facnavegar3() }
    }
    private fun facnavegar3 (){
        val intent= Intent(this, facturaActivity::class.java)
        startActivity(intent)
    }
}