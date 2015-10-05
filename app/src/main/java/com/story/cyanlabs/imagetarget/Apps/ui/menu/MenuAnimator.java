package com.story.cyanlabs.imagetarget.Apps.ui.menu;

import android.animation.Animator;
import android.animation.ValueAnimator;

/**
 * Created by cyanlabs on 15/09/2015.
 */
public class MenuAnimator extends ValueAnimator implements
ValueAnimator.AnimatorUpdateListener, ValueAnimator.AnimatorListener
 {
    private static long MENU_ANIMATION_DURATION = 300;
    private Menu mSampleAppMenu;
    private float mMaxX;
    private float mEndX;

    public MenuAnimator (Menu menu)
    {
        mSampleAppMenu = menu;
        setDuration(MENU_ANIMATION_DURATION);
        addUpdateListener(this);
        addListener(this);
    }

     @Override
     public void onAnimationUpdate(ValueAnimator animation)
     {
         Float f = (Float) animation.getAnimatedValue();
         mSampleAppMenu.setAnimationX(f.floatValue());
     }


     @Override
     public void onAnimationCancel(Animator animation)
     {
     }


     @Override
     public void onAnimationEnd(Animator animation)
     {
         mSampleAppMenu.setDockMenu(mEndX == mMaxX);
         if (mEndX == 0)
             mSampleAppMenu.hide();
     }


     @Override
     public void onAnimationRepeat(Animator animation)
     {
     }


     @Override
     public void onAnimationStart(Animator animation)
     {
     }


     public void setStartEndX(float start, float end)
     {
         mEndX = end;
         setFloatValues(start, end);
         setDuration((int) (MENU_ANIMATION_DURATION * (Math.abs(end - start) / mMaxX)));
     }


     public void setMaxX(float maxX)
     {
         mMaxX = maxX;
     }
 }
