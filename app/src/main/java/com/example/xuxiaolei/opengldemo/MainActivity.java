package com.example.xuxiaolei.opengldemo;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {
    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView); /* 以下是重点 */
//        GLSurfaceView demoGlv = (GLSurfaceView) findViewById(R.id.glv_main_demo); // 设置OpenGL版本(一定要设置)
//        //
//        demoGlv.setEGLContextClientVersion(2); // 设置渲染器(后面会着重讲这个渲染器的类)
//        demoGlv.setRenderer(new MyRenderer()); // 设置渲染模式为连续模式(会以60fps的速度刷新)
//        demoGlv.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }


    class MyGLSurfaceView extends GLSurfaceView{
        private final MyDemoRender mRenderer;

        public MyGLSurfaceView(Context context){
            super(context);
            setEGLContextClientVersion(2);
            mRenderer = new MyDemoRender();
            setRenderer(mRenderer);
        }
    }
}
