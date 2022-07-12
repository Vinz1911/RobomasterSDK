package de.weist.robomastersdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.weist.robomasterkit.RobomasterKit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kit = RobomasterKit()
        kit.info()
    }
}