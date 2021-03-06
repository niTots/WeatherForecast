package com.example.weatherforecast.utils.decorators

import android.graphics.Rect
import android.view.View
import androidx.annotation.Px
import androidx.recyclerview.widget.RecyclerView

class HorizontalOffsetDecoration(@Px private val verticalSpace:Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        when{
            parent.getChildAdapterPosition(view) == 0 ->{
                outRect.right = verticalSpace
            }
            parent.getChildAdapterPosition(view) == (parent.adapter?.itemCount ?: -1) - 1 -> {
                outRect.left = verticalSpace
            }
            else -> {
                outRect.left = verticalSpace
                outRect.right = verticalSpace
            }
        }
    }
}