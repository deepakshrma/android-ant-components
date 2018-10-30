package com.xdeepakv.antd.ui

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.xdeepakv.antd.R
import android.graphics.drawable.GradientDrawable
import com.xdeepakv.antd.theme.utils.ThemeUtils

class DButton @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr){
    private var dimension: Int = 0;
    init {
        context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Button,
                0, 0).apply {
            try {
                dimension = getDimensionPixelSize(R.styleable.Button_d_buttonRounded, 0)
                val shape = GradientDrawable()
                shape.cornerRadius = dimension.toFloat()
                shape.setColor(ThemeUtils.getThemeColor(getContext(), R.attr.ant_themeColorPrimaryDark))
                background= shape
            } finally {
                recycle()
            }
        }
    }
}