package com.example.flutter_sample_app

import com.example.flutter_sample_app.SamplePlatformView.Companion.SAMPLE_VIEW_TYPE
import io.flutter.embedding.engine.plugins.FlutterPlugin

class SampleFlutterPlugin : FlutterPlugin {
    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        binding.platformViewRegistry.registerViewFactory(
                SAMPLE_VIEW_TYPE,
                SamplePlatformViewFactory()
        )
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) = Unit
}
