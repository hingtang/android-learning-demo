package com.hing.lifecycle

import android.os.Bundle
import com.hing.lifecycle.base.BaseActivity

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
