package com.yb.util;

import com.sun.deploy.net.HttpRequest;
import freemarker.ext.servlet.HttpSessionHashModel;
import org.apache.struts2.ServletActionContext;

/**
 * Created by 杨波 on 2016/10/22.
 */
public class ValueUtils {
    private static String sessionName="globle_user";
    //存放Session
    public static void putValuStack(String name,Object o) {
        ServletActionContext.getContext().put(name,o);
    }
    //放到栈顶
    public static void putValuStacktop(Object o) {
        ServletActionContext.getContext().getValueStack().push(o);
    }

}

