package com.example.nirjon.drawingincanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Nirjon on 9/14/2017.
 */

public class OurView extends View {

    public int x, y, dx, dy;

    public OurView(Context context) {
        super(context);
        x = y = 10;
        dx = dy = 5;
    }

    public OurView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        x = y = 10;
        dx = dy = 5;
    }

    public OurView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        x = y = 10;
        dx = dy = 5;
    }

    public OurView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        x = y = 10;
        dx = dy = 5;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint(Color.BLUE);

        canvas.drawCircle(x, y, 10, p);
        x += dx;
        y += dy;

        if(x > 300 || x < 0) dx = -dx;
        if(y > 200 || y < 0) dy = -dy;

        invalidate();

    }
}
