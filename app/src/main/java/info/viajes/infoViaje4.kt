package info.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import metodopago.facturaActivity

class infoViaje4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_viaje4)
        val button4precio=findViewById<Button>(R.id.button4precio)
        button4precio.setOnClickListener { facnavegar4() }
    }
    private fun facnavegar4 (){
        val intent= Intent(this, facturaActivity::class.java)
        startActivity(intent)
    }
}