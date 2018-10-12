/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 10:39 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 9/24/18 2:26 PM
 ************************************************/

package com.coursedicoding.ngajaruiadapter.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextView_Lato_Light extends TextView {

    public MyTextView_Lato_Light(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_Lato_Light(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_Lato_Light(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Light.ttf");
            setTypeface(tf);
        }
    }

}