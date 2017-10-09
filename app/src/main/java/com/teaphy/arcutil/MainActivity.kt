package com.teaphy.arcutil

import android.os.Bundle
import com.teaphy.arc.adapter.AdapterSingleText
import com.teaphy.arc.base.BaseRecyclerViewActivity
import com.teaphy.arc.callback.OnItemClickCallback

class MainActivity : BaseRecyclerViewActivity<AdapterSingleText.MyHolder, AdapterSingleText>() {
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initTitle(): String {
        return "TeaUtil Demo"
    }

    override fun initData() {
        mList.addAll(resources.getStringArray(R.array.arrayUtilFeature))
    }

    override fun initView() {
    }

    override fun setListener() {
    }

    override fun initAdapter() {
        mAdapter = AdapterSingleText(mList, object : OnItemClickCallback {
            override fun onClick(position: Int) {

            }
        })
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}