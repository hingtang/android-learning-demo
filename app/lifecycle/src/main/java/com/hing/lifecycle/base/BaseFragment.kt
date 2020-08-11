package com.hing.lifecycle.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hing.lifecycle.utils.Utils

/**
 * Created by Hung Luong on 8/7/2020.
 */
open class BaseFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Utils.debugLog("${javaClass.simpleName} - onAttach")
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Utils.debugLog("${javaClass.simpleName} - onAttachFragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onCreate: $savedInstanceState")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Utils.debugLog("${javaClass.simpleName} - onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onViewCreated: $savedInstanceState")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onActivityCreated: $savedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Utils.debugLog("${javaClass.simpleName} - onViewStateRestored: $savedInstanceState")
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Utils.debugLog("${javaClass.simpleName} - onSaveInstanceState: $outState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Utils.debugLog("${javaClass.simpleName} - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.debugLog("${javaClass.simpleName} - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Utils.debugLog("${javaClass.simpleName} - onDetach")
    }
}
