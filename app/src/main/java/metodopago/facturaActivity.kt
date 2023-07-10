package metodopago

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adso.examen_moises.R
import fincompra.fincompraActivity

class facturaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factura)
        val buttonpagar=findViewById<Button>(R.id.buttonpagar)
        buttonpagar.setOnClickListener { facnavegarfin() }
    }
    private fun facnavegarfin (){
        val intent= Intent(this,fincompraActivity::class.java)
        startActivity(intent)
    }
}