package com.teaphy.arc.base

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.teaphy.arc.R

/**
 * @desc
 * @author Tiany
 * @date 2017/9/14 0014
 */
abstract class BaseRecyclerViewActivity<VH: RecyclerView.ViewHolder, T : RecyclerView.Adapter<VH>>: BaseSimpleActivity(){

    lateinit var recyclerView: RecyclerView
    lateinit var mAdapter: T
    val mList = mutableListOf<String>()

     override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        initAdapter()

        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        val paintDrawable = PaintDrawable(resources.getColor(R.color.colorDc))
        paintDrawable.intrinsicHeight = 3
        divider.setDrawable(paintDrawable)
        recyclerView.apply {
            layoutManager = manager
            adapter = mAdapter
            addItemDecoration(divider)
        }
    }

    /**
     * 必须初始化Adapter
     */
    abstract fun initAdapter()
}