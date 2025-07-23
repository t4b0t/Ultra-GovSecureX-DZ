package dz.ultragov.securex

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ControlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        val btnPacketSniffer = findViewById<Button>(R.id.btnPacketSniffer)
        val btnNetworkScanner = findViewById<Button>(R.id.btnNetworkScanner)
        val btnSMSManager = findViewById<Button>(R.id.btnSMSManager)
        val btnRadar = findViewById<Button>(R.id.btnRadar)

        btnPacketSniffer.setOnClickListener {
            PacketSniffer.startSniffing(this)
        }

        btnNetworkScanner.setOnClickListener {
            NetworkScanner.scanNetworks(this)
        }

        btnSMSManager.setOnClickListener {
            SMSManager.launch(this)
        }

        btnRadar.setOnClickListener {
            Radar.startRadar(this)
        }
    }
}
