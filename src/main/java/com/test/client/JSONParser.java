package com.test.client;

import com.alibaba.fastjson.JSONObject;

public class JSONParser {
    JSONObject internalJSON;
    public String getCity(JSONObject jsonObject){
        String city = "";
        JSONObject internalJson=jsonObject.getJSONObject("result");

        String province = internalJSON.getString("city");

        return city;
    }
}
