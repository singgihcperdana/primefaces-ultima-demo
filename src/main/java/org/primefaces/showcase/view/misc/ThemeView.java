/*
 * Copyright 2009-2015 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.misc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ThemeView implements Serializable {

    /** 默认主题：ultima-indigo */
    public static final String DEFAULT_THEME = "ultima-indigo";
    /** 默认字体样式：layout-compact */
    public static final String DEFAULT_SIZE = "layout-compact";
    /** 默认菜单位置样式：static */
    public static final String DEFAULT_MENU_MODE = "static";
    /** 默认菜单背景样式：menu-layout-static */
    public static final String DEFAULT_MENU_BG = "";
    /** 默认简介位置：inline */
    public static final String DEFAULT_PROFILE = "inline";
    /** 布局的主题(其它可选主题：ultima-blue/ultima-blue-grey/ultima-brown/ultima-cyan/ultima-dark-blue/ultima-dark-green/ultima-green/ultima-grey/ultima-indigo/ultima-purple-amber/ultima-purple-cyan/ultima-teal) */
    private String theme;
    /** 布局的CSS样式文件(其它可选样式：layout-blue/layout-blue-grey/layout-brown/layout-cyan/layout-dark-blue/layout-dark-green/layout-green/layout-grey/layout-indigo/layout-purple-amber/layout-purple-cyan/layout-teal) */
    private String layoutCss;// = "css/layout-indigo.css";
    private String themeColor;// = "#3F51B5";
    /** 字体样式：layout-compact或"" */
    private String size;// = "layout-compact";
    /** 菜单样式：static/overlay/horizontal */
    private String menuMode;// = "static";
    /** 菜单位置样式：layout-wrapper menu-layout-static/layout-wrapper menu-layout-overlay/layout-wrapper menu-layout-static menu-layout-horizontal */
    private String menuModeClass;
    /** 菜单背景样式：""/layout-menu-dark */
    private String menuBg; // = "";
    /** 简介位置(inline/top) */
    private String profile; // = "inline";
    private Map<String, String> layoutMap;
    private Map<String, String> themeColorMap;
    private Map<String, String> menuModeClassMap;

    @PostConstruct
    public void init() {
        layoutMap = new HashMap<>();
        layoutMap.put("ultima-blue", "css/layout-blue.css");
        layoutMap.put("ultima-blue-grey", "css/layout-blue-grey.css");
        layoutMap.put("ultima-brown", "css/layout-brown.css");
        layoutMap.put("ultima-cyan", "css/layout-cyan.css");
        layoutMap.put("ultima-dark-blue", "css/layout-dark-blue.css");
        layoutMap.put("ultima-dark-green", "css/layout-dark-green.css");
        layoutMap.put("ultima-green", "css/layout-green.css");
        layoutMap.put("ultima-grey", "css/layout-grey.css");
        layoutMap.put("ultima-indigo", "css/layout-indigo.css");
        layoutMap.put("ultima-purple-amber", "css/layout-purple-amber.css");
        layoutMap.put("ultima-purple-cyan", "css/layout-purple-cyan.css");
        layoutMap.put("ultima-teal", "css/layout-teal.css");

        themeColorMap = new HashMap<>();
        themeColorMap.put("ultima-blue", "#03A9F4");
        themeColorMap.put("ultima-blue-grey", "#607D8B");
        themeColorMap.put("ultima-brown", "#795548");
        themeColorMap.put("ultima-cyan", "#00bcd4");
        themeColorMap.put("ultima-dark-blue", "");
        themeColorMap.put("ultima-dark-green", "");
        themeColorMap.put("ultima-green", "#4CAF50");
        themeColorMap.put("ultima-grey", "");
        themeColorMap.put("ultima-indigo", "#3F51B5");
        themeColorMap.put("ultima-purple-amber", "#673AB7");
        themeColorMap.put("ultima-purple-cyan", "#673AB7");
        themeColorMap.put("ultima-teal", "#009688");

        menuModeClassMap = new HashMap<>();
        menuModeClassMap.put("static", "layout-wrapper menu-layout-static");
        menuModeClassMap.put("overlay", "layout-wrapper menu-layout-overlay");
        menuModeClassMap.put("horizontal", "layout-wrapper menu-layout-static menu-layout-horizontal");

        setTheme(DEFAULT_THEME);
        setSize(DEFAULT_SIZE);
        setMenuMode(DEFAULT_MENU_MODE);
        setMenuBg(DEFAULT_MENU_BG);
        setProfile(DEFAULT_PROFILE);
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
        // 根据主题的颜色变化，重置页面布局CSS
        layoutCss = layoutMap.get(theme);
        themeColor = themeColorMap.get(theme);
//        if (layoutCss == null) {
//            layoutCss = "css/layout-indigo.css";
//        }
    }

    public String getLayoutCss() {
        return layoutCss;
    }

    public void setLayoutCss(String layoutCss) {
        this.layoutCss = layoutCss;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMenuMode() {
        return menuMode;
    }

    public void setMenuMode(String menuMode) {
        this.menuMode = menuMode;

        this.theme = theme;
        menuModeClass = menuModeClassMap.get(menuMode);
//        if (menuModeClass == null) {
//            menuModeClass = "layout-wrapper menu-layout-static";
//        }
    }

    public String getMenuModeClass() {
        return menuModeClass;
    }

    public void setMenuModeClass(String menuModeClass) {
        this.menuModeClass = menuModeClass;
    }

    public String getMenuBg() {
        return menuBg;
    }

    public void setMenuBg(String menuBg) {
        this.menuBg = menuBg;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
