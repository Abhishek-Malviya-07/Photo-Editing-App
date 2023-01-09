package com.codestudioapps.photoeffect.template

import android.graphics.Path
import android.graphics.PointF
import android.graphics.RectF

import java.util.ArrayList
import java.util.HashMap

/**
 * Abhishek Malviya 007
 * Minor Project
 */
class PhotoItem {
    //Primary info
    var x = 0f
    var y = 0f
    var index = 0
    var imagePath: String? = null
    var maskPath: String? = null
    //Using point list to construct view. All points and width, height are in [0, 1] range.
    var pointList = ArrayList<PointF>()
    var bound = RectF()
    //Using path to create
    var path: Path? = null
    var pathRatioBound: RectF? = null
    var pathInCenterHorizontal = false
    var pathInCenterVertical = false
    var pathAlignParentRight = false
    var pathScaleRatio = 1f
    var fitBound = false
    //other info
    var hasBackground = false
    var shrinkMethod = SHRINK_METHOD_DEFAULT
    var cornerMethod = CORNER_METHOD_DEFAULT
    var disableShrink = false
     var shrinkMap: HashMap<PointF, PointF>? = null
    //Clear polygon or arc area
    var clearAreaPoints: ArrayList<PointF>? = null
    //Clear an area using path
    var clearPath: Path? = null
    var clearPathRatioBound: RectF? = null
    var clearPathInCenterHorizontal = false
    var clearPathInCenterVertical = false
    var clearPathAlignParentRight = false
    var clearPathScaleRatio = 1f
    var centerInClearBound = false

    companion object {
        val SHRINK_METHOD_DEFAULT = 0
        val SHRINK_METHOD_3_3 = 1
        val SHRINK_METHOD_USING_MAP = 2
        val SHRINK_METHOD_3_6 = 3
        val SHRINK_METHOD_3_8 = 4
        val SHRINK_METHOD_COMMON = 5
        val CORNER_METHOD_DEFAULT = 0
        val CORNER_METHOD_3_6 = 1
        val CORNER_METHOD_3_13 = 2
    }

}
