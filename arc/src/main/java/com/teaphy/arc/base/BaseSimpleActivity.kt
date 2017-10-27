package com.teaphy.arc.base

import android.os.Bundle

/**
 * @desc
 * @author Tiany
 * @date 2017/10/9 0009
 */
abstract class BaseSimpleActivity : BaseActivity() {


    override fun initData() {
    }

    override fun initView() {
    }

    override fun setListener() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}