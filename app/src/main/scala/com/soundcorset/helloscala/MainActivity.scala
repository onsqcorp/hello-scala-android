package com.soundcorset.helloscala
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
trait MTrait {
  def foo(): Unit = {
    println("RAWR MTrait.foo()")
  }
}

trait MDecoration { this: MTrait =>
  override def foo(): Unit = {
    println("RAWR MDecoration.foo()")
  }
}

trait MCombination extends MTrait with MDecoration {}

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    val a = new MCombination {}
    a.foo() // Crash if isMinifyEnabled = true

    val view = new TextView(this)
    view.setText("Hello Scala Android.")
    setContentView(view)
  }
}