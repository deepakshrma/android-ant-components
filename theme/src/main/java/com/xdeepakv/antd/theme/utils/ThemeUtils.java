package com.xdeepakv.antd.theme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;

final public class ThemeUtils {
    public static int getThemeColor(Context context, int themeAttributeId) {
        TypedValue outValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        boolean wasResolved =
                theme.resolveAttribute(
                        themeAttributeId, outValue, true);
        if (wasResolved) {
            return outValue.resourceId == 0
                    ? outValue.data
                    : ContextCompat.getColor(
                    context, outValue.resourceId);
        } else {
            // fallback colour handling
            return Color.TRANSPARENT;
        }
    }
}