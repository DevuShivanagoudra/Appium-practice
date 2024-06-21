package com.testing.mobile.common;

public enum TabBarOptions {

    HOME("home"),
    ME("meTab"),
    CART("cartTab"),
    MENU("menuTab");

    private String option;

    TabBarOptions(final String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
