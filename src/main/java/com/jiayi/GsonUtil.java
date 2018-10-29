package com.jiayi;

import com.google.gson.Gson;

/**
 * @description :
 * @author: CONCENTRATE
 * @time: 2018/10/30.
 */
public class GsonUtil {

    public static String toJson(Object object){
        if (object == null){
            return "";
        }
        Gson gson = new Gson();
        return  gson.toJson(object);
    }
}
