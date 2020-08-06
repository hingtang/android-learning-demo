package com.hing.lifecycle

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import com.hing.lifecycle.base.BaseActivity
import com.hing.lifecycle.utils.Utils.debugLog
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

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

        btnNavigateToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Toast after starting Second Activity", Toast.LENGTH_SHORT).show()
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

    private companion object {
        const val EXTERNAL_PERMISSION_CODE = 100
    }
}
