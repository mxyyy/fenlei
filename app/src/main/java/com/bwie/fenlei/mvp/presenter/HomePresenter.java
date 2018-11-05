package com.bwie.fenlei.mvp.presenter;


import com.bwie.fenlei.bean.News;
import com.bwie.fenlei.inter.ICallBack;
import com.bwie.fenlei.mvp.model.Model;
import com.bwie.fenlei.mvp.view.HomeView;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;



public class HomePresenter {
    private HomeView hv;
    private Model model;
    public void attach(HomeView hv){
        this.hv = hv;
        model = new Model();
    }
    public void detach(){
        if (hv!=null){
            hv = null;
        }
    }

    public void getNews(String url){
       Type type = new TypeToken<News>(){}.getType();
       model.getData(url, new ICallBack() {
           @Override
           public void success(Object o) {
               News news = (News) o;
               hv.getNews(news);
           }

           @Override
           public void failed(Exception e) {

           }
       },type);

    }
}
