## Reproduction of bug of Scala editor in Android IDE

* Checkout and open this in Android Studio or IntelliJ with Android plugin.
* Install Scala plugin

Up to Android Studio Iguana, everything works fine. However from Android Studio Jellyfish, when `MainActivity.scala` is open in editor, error is highlighted on `blocking` and `println`, in spite of the code have no problem.
