package dz.ultragov.securex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenControl = findViewById<Button>(R.id.btnOpenControl)
        btnOpenControl.setOnClickListener {
            val intent = Intent(this, ControlActivity::class.java)
            startActivity(intent)
        }

        // AutoStart: تشغيل الوحدات تلقائيًا
        AutoStartModules.startAll(this)
    }
}
