package com.story.cyanlabs.imagetarget.Apps.ui.menu;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by cyanlabs on 15/09/2015.
 */
public class MenuView  extends LinearLayout {
    int horizontalClipping = 0;


    public MenuView(Context context)
    {
        super(context);
    }


    public MenuView(Context context, AttributeSet attribute)
    {
        super(context, attribute);
    }


    @Override
    public void onDraw(Canvas canvas)
    {
        canvas.clipRect(0, 0, horizontalClipping, canvas.getHeight());
        super.onDraw(canvas);
    }


    public void setHorizontalClipping(int hClipping)
    {
        horizontalClipping = hClipping;
        invalidate();
    }
}
