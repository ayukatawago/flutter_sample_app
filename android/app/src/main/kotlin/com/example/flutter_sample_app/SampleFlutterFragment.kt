package com.example.flutter_sample_app

import io.flutter.Log
import io.flutter.embedding.android.FlutterFragment
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

/**
 * A Fragment to display Flutter content.
 */
class SampleFlutterFragment: FlutterFragment() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        Log.setLogLevel(android.util.Log.VERBOSE)

        GeneratedPluginRegistrant.registerWith(flutterEngine)
        flutterEngine.plugins.add(SampleFlutterPlugin())
    }
}
