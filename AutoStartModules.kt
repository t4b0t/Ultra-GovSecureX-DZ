package dz.ultragov.securex

import android.content.Context
import android.util.Log

object AutoStartModules {

    fun startAll(context: Context) {
        PacketSniffer.startSniffing(context)
        NetworkScanner.scanNetworks(context)
        SMSManager.launch(context)
        Radar.startRadar(context)
        Log.d("UltraGovSecureX", "All modules auto-started")
    }
}
