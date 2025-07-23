<Button
    android:id="@+id/btnSS7Attack"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="SS7 Attack"
    android:layout_marginBottom="12dp"
    android:backgroundTint="#FF0000"
    android:textColor="#FFFFFF" />
val btnSS7Attack = findViewById<Button>(R.id.btnSS7Attack)
btnSS7Attack.setOnClickListener {
    // ضع هنا الرقم المستهدف للاختبار
    SS7Exploit.attackTarget(this, "+213541000000")
}
