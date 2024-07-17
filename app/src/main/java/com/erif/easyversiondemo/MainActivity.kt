package com.erif.easyversiondemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erif.easyversion.AndroidVersion

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        AndroidVersion.`Tiramisu-13` {
            // TODO ACTION
        } ?: AndroidVersion.`Snow-12` {
            // TODO ACTION
        }

        val value = AndroidVersion.`RedVelvet-11`.andUp {
            "My value 11"
        } ?: AndroidVersion.`QuinceTart-10`.andDown {
            "My value 10"
        } ?: {
            "My other value"
        }

    }
}