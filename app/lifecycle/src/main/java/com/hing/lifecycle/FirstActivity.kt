package com.hing.lifecycle

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.hing.lifecycle.utils.Utils.debugLog
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        debugLog("${javaClass.simpleName} - onCreate + $savedInstanceState")

        btnGetPermissionDialog.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),
                EXTERNAL_PERMISSION_CODE
            )
        }

        btnAlertDialog.setOnClickListener {
            val dialog = AlertDialog.Builder(this).apply {
                title = ""
                setMessage("This is an Alert Dialog")
                create()
            }

            dialog.show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        debugLog("${javaClass.simpleName} - onRequestPermissionsResult requestCode: $requestCode")
        when (requestCode) {
            EXTERNAL_PERMISSION_CODE -> {
                if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
                }
                return
            }
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
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

    private companion object {
        const val EXTERNAL_PERMISSION_CODE = 100
    }
}
