package cl.ejeldes.notes.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by ejeldes on Jul 20, 2019
 */
class VerticalSpacingDecorator(private val verticalSPacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.bottom = verticalSPacing
    }
}