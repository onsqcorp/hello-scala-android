package com.soundcorset.helloscala
import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity extends Activity:
  override def onCreate(savedInstanceState: Bundle): Unit =
    super.onCreate(savedInstanceState)
    val view: TextView = new TextView(this)
    view.setText("Hello Scala Android.")
    view.setGravity(Gravity.CENTER)
    view.setTextSize(21)
    setContentView(view)
