package com.luseen.mvp_room;

import com.luseen.mvp_room.MVP_presenter.LoginPresenter;
import com.luseen.mvp_room.MVP_view.LoginView;

public class PresenterImpl implements LoginPresenter {
    public PresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    private LoginView loginView;
    @Override
    public void onDestroy() {
        loginView=null;
    }
}
