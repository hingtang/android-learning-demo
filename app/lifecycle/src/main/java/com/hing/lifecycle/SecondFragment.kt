package com.hing.lifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hing.lifecycle.base.BaseFragment
import com.hing.lifecycle.utils.Utils

class SecondFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Utils.debugLog("${javaClass.simpleName} - onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}
