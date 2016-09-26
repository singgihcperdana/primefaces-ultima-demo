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

    /** 默认主题：ultima-indigo(其它可选主题：ultima-blue/ultima-blue-grey/ultima-brown/ultima-cyan/ultima-dark-blue/ultima-dark-green/ultima-green/ultima-grey/ultima-indigo/ultima-purple-amber/ultima-purple-cyan/ultima-teal) */
    private String theme = "ultima-indigo";
    /** 布局的CSS样式文件(其它可选样式：layout-blue/layout-blue-grey/layout-brown/layout-cyan/layout-dark-blue/layout-dark-green/layout-green/layout-grey/layout-indigo/layout-purple-amber/layout-purple-cyan/layout-teal) */
    private String layoutCss = "css/layout-indigo.css";
    private Map<String, String> layoutMap;

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
        layoutMap.put("ultima-purple-amber", "css/purple-amber.css");
        layoutMap.put("ultima-purple-cyan", "css/purple-cyan.css");
        layoutMap.put("ultima-teal", "css/layout-teal.css");
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
        // 根据主题的颜色变化，重置页面布局CSS
        layoutCss = layoutMap.get(theme);
        if (layoutCss == null) {
            layoutCss = "css/layout-indigo.css";
        }
    }

    public String getLayoutCss() {
        return layoutCss;
    }

    public void setLayoutCss(String layoutCss) {
        this.layoutCss = layoutCss;
    }
}
