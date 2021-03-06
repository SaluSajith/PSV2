package com.hit.pretstreet.pretstreet.core.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.hit.pretstreet.pretstreet.R;

/**
 * Created by vrinda venugopal on 29/9/16.
 */

public class TextViewPret extends AppCompatTextView {

    private static final String defaultFontName = "segoe_ui_reg.ttf";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TextViewPret(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    public TextViewPret(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TextViewPret(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomStyle);
            String fontName = a.getString(R.styleable.CustomStyle_pret_typeface);
            try {
                if (fontName == null) fontName = defaultFontName;
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "" + fontName);
                setTypeface(myTypeface);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a.recycle();
        }
    }
}


