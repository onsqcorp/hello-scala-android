package com.soundcorset.helloscala
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    val view = new TextView(this)
    view.setText("Hello Scala Android.")
    setContentView(view)
  }
}