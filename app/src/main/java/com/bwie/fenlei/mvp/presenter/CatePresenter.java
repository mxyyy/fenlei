package com.bwie.fenlei.mvp.presenter;


import com.bwie.fenlei.bean.CategotyChild;
import com.bwie.fenlei.bean.CategotyGroup;
import com.bwie.fenlei.inter.ICallBack;
import com.bwie.fenlei.mvp.model.Model;
import com.bwie.fenlei.mvp.view.CateView;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;



public class CatePresenter {
    private CateView cv;
    private Model model;
    public void attach(CateView cv){
        this.cv = cv;
        model = new Model();
    }
    public void detach(){
        if (cv!=null){
            cv = null;
        }
    }

    public void getGroup(String url){
        Type type = new TypeToken<CategotyGroup>(){}.getType();
        model.getData(url, new ICallBack() {
            @Override
            public void success(Object o) {
                CategotyGroup categotyGroup = (CategotyGroup) o;
                cv.getGroup(categotyGroup);
            }

            @Override
            public void failed(Exception e) {

            }
        },type);
    }
    public void getChild(String url){
        Type type = new TypeToken<CategotyChild>(){}.getType();
        model.getData(url, new ICallBack() {
            @Override
            public void success(Object o) {
                CategotyChild categotyChild = (CategotyChild) o;
                cv.getChild(categotyChild);
            }

            @Override
            public void failed(Exception e) {

            }
        },type);
    }
}
