package com.example.administrator.myapplication30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by devil on 16-9-8.
 */
public class CustomView extends View {


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas){

        super.onDraw(canvas);

        //设置背景颜色
        canvas.drawColor(Color.WHITE);

        //创建画笔
        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(Color.BLUE);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(6);

        //绘制矩形
        canvas.drawRect(10, 10, 150, 150, paint);

        Path path=new Path();
        path.moveTo(200,10);
        path.lineTo(400, 10);
        path.lineTo(400, 210);
        path.close();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        paint.setTextSize(30);
        paint.setColor(Color.BLUE);
        paint.setStrikeThruText(true);
        canvas.drawText("hello world", 500, 500, paint);

        Path pathText=new Path();
        //逆时针方向
        pathText.addCircle(200,500,80, Path.Direction.CCW);

        canvas.drawTextOnPath("北京信息科技大学2013011370李洋",pathText,0,10,paint);


    }
}