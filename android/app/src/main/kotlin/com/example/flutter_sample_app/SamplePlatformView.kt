package com.example.flutter_sample_app

import android.content.Context
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import io.flutter.plugin.platform.PlatformView


class SamplePlatformView(context: Context) : PlatformView {
    private val textView = AppCompatTextView(context).apply {
        text = "Hello from Android"
    }

    override fun getView(): View = textView

    override fun dispose() = Unit

    companion object {
        const val SAMPLE_VIEW_TYPE = "sample"
    }
}
