package com.bwie.fenlei.mvp.view;

import com.bwie.fenlei.bean.CategotyChild;
import com.bwie.fenlei.bean.CategotyGroup;

public interface CateView {
    void getGroup(CategotyGroup categotyGroup);

    void getChild(CategotyChild categotyChild);
}
