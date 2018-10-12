/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 10:39 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 8/2/17 9:36 PM
 ************************************************/

package com.coursedicoding.ngajaruiadapter.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextView_Lato_Medium extends TextView {

    public MyTextView_Lato_Medium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_Lato_Medium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_Lato_Medium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Medium.ttf");
            setTypeface(tf);
        }
    }

}