package com.example.flutter_sample_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle

/**
 * An Activity to open FlutterFragment via navController.
 */
class SampleFragmentActivity : AppCompatActivity() {
    private val flutterFragment: SampleFlutterFragment?
        get() {
            val navHostFragment =
                    supportFragmentManager.findFragmentById(R.id.navHostFragment) ?: return null
            val fragment = navHostFragment.childFragmentManager.fragments
                    .lastOrNull { it is SampleFlutterFragment } as? SampleFlutterFragment
            return fragment?.takeIf { it.lifecycle.currentState.isAtLeast(Lifecycle.State.CREATED) }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_layout)
    }

    override fun onPostResume() {
        super.onPostResume()
        flutterFragment?.onPostResume()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let {
            flutterFragment?.onNewIntent(it)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        flutterFragment?.onBackPressed()
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        flutterFragment?.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        flutterFragment?.onUserLeaveHint()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        flutterFragment?.onTrimMemory(level)
    }
}
