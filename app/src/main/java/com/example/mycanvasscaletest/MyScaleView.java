package com.example.mycanvasscaletest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class MyScaleView extends View {
    public MyScaleView(Context context) {
        super(context);
    }
    public MyScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    public MyScaleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();

        Paint mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, 300, 300, mPaint); // 绘制300 * 300的矩形

        canvas.scale(0.5f, 0.5f); // 进行缩小一般
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0, 0, 300, 300, mPaint); // 缩放后，绘制150 * 150的矩形

        canvas.restore();

        canvas.scale(0.5f, 0.5f, 300, 300); // 以坐标(300, 300)为基准缩小一半
        mPaint.setColor(Color.RED);
        canvas.drawRect(0, 0, 300, 300, mPaint); // 缩放后，绘制150 * 150的矩形
    }
}
