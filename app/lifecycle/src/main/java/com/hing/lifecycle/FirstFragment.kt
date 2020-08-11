package com.hing.lifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hing.lifecycle.base.BaseFragment
import com.hing.lifecycle.utils.Utils
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Utils.debugLog("${javaClass.simpleName} - onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNavigateToSecond.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(
                R.id.container,
                SecondFragment(),
                SecondFragment::class.java.simpleName
            )?.commit()
        }
    }
}
