package com.ibeetl.test;

import org.dom4j.Document;
import org.dom4j.Element;

import java.lang.reflect.Method;
import java.util.List;

public class XmlUtil {
    public static Object getObject(Document document, Class<?> clazz) {
        Object obj = null;
        Element root = document.getRootElement();
        try {
            obj = clazz.newInstance();//创建对象
            List<Element> properties = root.elements();
            for (Element pro : properties) {
                String propertyname = pro.getName();
                String propertyvalue = pro.getText();
                Method m = obj.getClass().getMethod("set" + propertyname, String.class);
                m.invoke(obj, propertyvalue);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
