package com.example.flutter_sample_app

import android.content.Context
import android.graphics.Color
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import io.flutter.plugin.platform.PlatformView


class SamplePlatformView(context: Context) : PlatformView {
    private val sampleView = AppCompatTextView(context).apply {
        text = "Hello from Android"
        setTextColor(Color.BLACK)
    }

    override fun getView(): View = sampleView

    override fun dispose() = Unit

    companion object {
        const val SAMPLE_VIEW_TYPE = "sample"
    }
}
