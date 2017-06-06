package com.cheng.cc.dialoglibrary;


/**
 * @author Created by cc on 17/6/5.
 * @fileName AnimUtil
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class AnimUtil {

    public static int getAnimDialogRes(BaseDialog.Style style,boolean inAnimation){
        int ret=-1;
        switch (style) {
            case Center:
                ret=inAnimation? R.anim.fade_in_center:R.anim.fade_out_center;
                break;
            case DownSheet:
                ret=inAnimation?R.anim.slide_in_bottom:R.anim.slide_out_bottom;
                break;
        }
        return ret;
    }

}
