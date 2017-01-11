package com.sxwz.myapplication.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.sxwz.myapplication.R;
import com.sxwz.myapplication.entity.DataResult;
import com.sxwz.myapplication.entity.Product;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10 15:20
 * description: 数据解析
 *****************************************************/

public class Parser {

    /**
     * 获取raw数据，在此声明此数据为伪造数据
     * 请按照特殊情况，特殊分析
     * @param ctx
     * @return 商品集合
     */
    public static List<Product> getCateProductList(Context ctx){

        //获取raw，通过文件六的方式，再通过引用的Gson解析
        InputStream is = ctx.getResources().openRawResource(R.raw.food_json);
        try {
            byte [] buffer = new byte[is.available()] ;
            is.read(buffer);
            String json = new String(buffer,"utf-8");
            //Gson解析
            DataResult dataResult = new Gson().fromJson(json, DataResult.class);
            List<Product> products=new ArrayList<Product>();
            //通过遍历，为了更好的操作，把产品类型和产品类型下的商品进行合并，
            // 此处是为了adapter更好的去操作
            //把每一个商品实体里都标注商品类型和类型编号
            for (int i=0;i<dataResult.getResults().size();i++){
                for (int j=0;j<dataResult.getResults().get(i).getFoodList().size();j++){
                    DataResult.ResultsBean.FoodListBean food=dataResult.getResults().get(i).getFoodList().get(j);
                    Product item=new Product();
                    item.setProductId(food.getID());
                    item.setType(dataResult.getResults().get(i).getTitle());
                    item.setFoodName(food.getFoodName());
                    item.setFoodPrice(food.getFoodPrice());
                    item.setSalesCount(food.getSalesCount());
                    item.setImageUrl(food.getImageUrl());
                    item.setSeleteId(i);
                    products.add(item);
                }
            }
            return products;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
