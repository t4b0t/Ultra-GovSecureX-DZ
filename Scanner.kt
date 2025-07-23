package dz.ultragov.securex

import android.content.Context
import android.net.wifi.WifiManager
import android.util.Log

object NetworkScanner {

    fun scanNetworks(context: Context) {
        val wifiManager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val scanResults = wifiManager.scanResults
        for (result in scanResults) {
            Log.d("UltraGovSecureX", "SSID: ${result.SSID}, BSSID: ${result.BSSID}, Signal: ${result.level}dBm")
        }
    }
}
