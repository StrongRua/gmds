/*
 * InitialParamListener.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2016-2-5 Created
 */
package com.rua.listener;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

/**
 * 初始化文件根路径
 *
 * @author Jacky
 * @version v1.0.0
 * @date 2016-2-5
 */
public class InitialParamListener implements ServletContextAware {

    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.web.context.ServletContextAware#setServletContext
     * (javax.servlet.ServletContext)
     */
    @Override
    public void setServletContext(ServletContext servletContext) {
    }

}
