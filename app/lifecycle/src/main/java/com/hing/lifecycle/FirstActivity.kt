package com.hing.lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.hing.lifecycle.utils.Utils.debugLog

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        debugLog("${javaClass.simpleName} - onCreate + $savedInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        debugLog("${javaClass.simpleName} - onRestart")
    }

    override fun onStart() {
        super.onStart()
        debugLog("${javaClass.simpleName} - onStart")
    }

    override fun onResume() {
        super.onResume()
        debugLog("${javaClass.simpleName} - onResume")
    }

    override fun onPause() {
        super.onPause()
        debugLog("${javaClass.simpleName} - onPause")
    }

    override fun onStop() {
        super.onStop()
        debugLog("${javaClass.simpleName} - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        debugLog("${javaClass.simpleName} - onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        debugLog("${javaClass.simpleName} - onSaveInstanceState $outState")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        debugLog("${javaClass.simpleName} - onSaveInstanceState2 $outState - $outPersistentState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        debugLog("${javaClass.simpleName} - onRestoreInstanceState $savedInstanceState")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        debugLog("${javaClass.simpleName} - onRestoreInstanceState2 $savedInstanceState - $persistentState")
    }
}
