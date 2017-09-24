package com.teaphy.arc.callback

/**
 * @desc
 * @author Tiany
 * @date 2017/9/14 0014
 */
@FunctionalInterface
interface OnItemClickCallback {
    fun onClick(position: Int)
}