package com.luseen.mvp_room.MVP_view;

import androidx.fragment.app.Fragment;

public interface LoginView {
    void loginValidations();
    void loginSuccess();
    void loginError();
    void initFragment(Fragment mFragment, String tag);

}
