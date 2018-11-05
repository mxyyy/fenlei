package com.bwie.fenlei.mvp.model;

import com.bwie.fenlei.inter.ICallBack;
import com.bwie.fenlei.utils.HttpUtils;

import java.lang.reflect.Type;


public class Model {
    public void getData(String url, ICallBack iCallBack, Type type){
        HttpUtils.getInstance().getData(url,iCallBack,type);
    }
}
