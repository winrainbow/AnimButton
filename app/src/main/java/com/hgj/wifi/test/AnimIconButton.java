package com.hgj.wifi.test;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.phillipcalvin.iconbutton.IconButton;

/**
 * Created by hanguojing on 2017/7/13 15:42
 */

public class AnimIconButton extends IconButton {
    private static final String TAG = "AnimIconButton";
    private Paint mPaint;
    private int times;
    private boolean startAnim;
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            // 调用invalidate
            invalidate();
        }
    };
    private RectF bounds;

    public AnimIconButton(Context context) {
        super(context);
    }

    public AnimIconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimIconButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(startAnim){
            animDraw(canvas);
        }

    }

    public void animController(boolean startAnim) {
        this.startAnim = startAnim;
        invalidate();
    }

    private void animDraw(Canvas canvas) {
        Drawable[] drawables = getCompoundDrawables();
        Drawable left = drawables[0];
        if (mPaint == null) {
            mPaint = new Paint();
        }
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(1);
        mPaint.setColor(Color.WHITE);
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        float leftX = getPaddingLeft();
        float rightX = leftX + left.getIntrinsicWidth();
        float topY = getHeight() / 2 - left.getIntrinsicHeight() / 2;
        float bottomY = topY + left.getIntrinsicHeight();
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(leftX, topY, rightX, bottomY, (-45 + times * 5) % 360, 90, true, mPaint);
        times++;
        postDelayed(mRunnable, 5);

    }
}
