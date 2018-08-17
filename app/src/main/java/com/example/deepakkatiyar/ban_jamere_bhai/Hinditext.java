package com.example.deepakkatiyar.ban_jamere_bhai;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class Hinditext extends android.support.v7.widget.AppCompatTextView {


    public Hinditext(Context context) {
        super(context);
    initTypeFace(context);
    }

    public Hinditext(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTypeFace(context);
    }

    public Hinditext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeFace(context);
    }
    public void initTypeFace(Context context)
    {
       Typeface tf= Typeface.createFromAsset(context.getAssets(),"Devanagari.ttf");
       this.setTypeface(tf);
    }
}
