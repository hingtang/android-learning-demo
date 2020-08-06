package com.hing.lifecycle.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.hing.lifecycle.utils.Utils

/**
 * Created by Hung Luong on 8/5/2020.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onCreate + $savedInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Utils.debugLog("${javaClass.simpleName} - onRestart")
    }

    override fun onStart() {
        super.onStart()
        Utils.debugLog("${javaClass.simpleName} - onStart")
    }

    override fun onResume() {
        super.onResume()
        Utils.debugLog("${javaClass.simpleName} - onResume")
    }

    override fun onPause() {
        super.onPause()
        Utils.debugLog("${javaClass.simpleName} - onPause")
    }

    override fun onStop() {
        super.onStop()
        Utils.debugLog("${javaClass.simpleName} - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.debugLog("${javaClass.simpleName} - onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Utils.debugLog("${javaClass.simpleName} - onSaveInstanceState $outState")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Utils.debugLog("${javaClass.simpleName} - onSaveInstanceState2 $outState - $outPersistentState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onRestoreInstanceState $savedInstanceState")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Utils.debugLog("${javaClass.simpleName} - onRestoreInstanceState2 $savedInstanceState - $persistentState")
    }
}