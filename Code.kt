package dz.ultragov.securex

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

object PacketSniffer {

    fun startSniffing(context: Context) {
        try {
            val process = Runtime.getRuntime().exec("tcpdump -i any")
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                Log.d("UltraGovSecureX", "Packet: $line")
            }
        } catch (e: Exception) {
            Log.e("UltraGovSecureX", "Error starting PacketSniffer", e)
        }
    }
}
