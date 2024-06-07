## Demonstration of https://issuetracker.google.com/issues/249859332

Clone this repository and open it in Android Studio.

When you run this in release variant, it crashes with this exception:

```
java.lang.IncompatibleClassChangeError
    at com.soundcorset.helloscala.MainActivity.onCreate(Unknown Source:5)
    at android.app.Activity.performCreate(Activity.java:8595)
    at android.app.Activity.performCreate(Activity.java:8573)
    at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1456)
// ...
```

The setting `isMinifyEnabled = true` triggers this problem. I guess R8 does not correctly handle which part of the class can be omitted.
