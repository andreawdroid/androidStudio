package agencia.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import info.viajes.infoViaje1
import info.viajes.infoViaje2
import info.viajes.infoViaje3
import info.viajes.infoViaje4

class agenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agencia)
        val buttoninfo2=findViewById<Button>(R.id.buttoninfo2)
        buttoninfo2.setOnClickListener { navegarinfo2 () }
        val buttoninfo3=findViewById<Button>(R.id.buttoninfo3)
        buttoninfo3.setOnClickListener {  navegarinfo3 ()}
        val buttoninfo4=findViewById<Button>(R.id.buttoninfo4)
        buttoninfo4.setOnClickListener { navergarinfo4 ()}
        val buttoninfo5=findViewById<Button>(R.id.buttoninfo5)
        buttoninfo5.setOnClickListener { navergarinfo5 ()}
    }
    private fun navegarinfo2(){
        val intent=Intent(this,infoViaje1::class.java)
        startActivity(intent)
    }

    private fun navegarinfo3(){
        val intent=Intent(this,infoViaje2::class.java)
        startActivity(intent)
    }
    private fun navergarinfo4(){
        val intent=Intent(this,infoViaje3::class.java)
        startActivity(intent)
    }
    private fun navergarinfo5(){
        val intent=Intent(this,infoViaje4::class.java)
        startActivity(intent)
    }
}