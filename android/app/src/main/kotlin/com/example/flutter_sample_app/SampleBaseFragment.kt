package com.example.flutter_sample_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.flutter.embedding.android.TransparencyMode
import kotlinx.android.synthetic.main.base_fragment_layout.*

/**
 * A Fragment to open FlutterFragment via navController.
 */
class SampleBaseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.base_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openFlutterFragmentButton.setOnClickListener {
            val navController = findNavController()
            val navOptions = Bundle().apply {
                putBoolean("should_attach_engine_to_activity", true)
                putString("flutterview_transparency_mode", TransparencyMode.opaque.name)
            }
            navController.navigate(R.id.openFlutterFragmentAction, navOptions)
        }
    }
}
