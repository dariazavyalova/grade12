package com.example.grade12

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.Button
import io.flutter.plugin.platform.PlatformView


internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val button: Button

    override fun getView(): View {
        return button
    }

    override fun dispose() {}

    init {
        button = Button(context)
        button.text = "${creationParams!!["value"]}"
    }
} 