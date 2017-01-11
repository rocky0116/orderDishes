package com.sxwz.myapplication.utils;

import android.content.Context;

import com.sxwz.myapplication.entity.Cart;
import com.sxwz.qcodelib.ZDB;

import java.util.List;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10 16:45
 * description: ui操作帮助
 *****************************************************/

public class UIHelper {

    public static void saveCart(Context ctx, Cart cart) {
        ZDB zdb = ZDB.create(ctx);
        zdb.save(cart);
    }

    public static void deleteCart(Context cxt, int productId) {
        ZDB zdb = ZDB.create(cxt);
        zdb.deleteByWhere(Cart.class, "productId=" + productId);
    }

    public static void clearCart(Context cxt, int businessId) {
        ZDB zdb = ZDB.create(cxt);
        zdb.deleteByWhere(Cart.class, "businessId=" + businessId);
    }

    public static void updateCart(Context cxt, Cart cart, int productId, int businessId) {
        ZDB zdb = ZDB.create(cxt);
        zdb.update(cart, "productId=" + productId + " and businessId= " + businessId);
    }

    public static List<Cart> getCartList(Context cxt, int businessId) {
        try {
            ZDB zdb = ZDB.create(cxt);
            List<Cart> datas = zdb.findAllByWhere(Cart.class, "businessId=" + businessId);
            if (datas != null)
                return datas;
            else
                return null;
        } catch (Exception e) {

        }
        return null;
    }

    public static int saleCount(Context cxt, int productId, int businessId) {
        ZDB zdb = ZDB.create(cxt);
        List<Cart> datas = zdb.findAllByWhere(Cart.class, "productId=" + productId + " and businessId=" + businessId);
        if (datas != null && datas.size() > 0)
            return datas.get(0).getSaleCount();
        else
            return 0;
    }

    public static void getQueryIdCart(Context cxt,Cart cart,int productId,int businessId){
        ZDB zdb = ZDB.create(cxt);
        List<Cart> datas=zdb.findAllByWhere(Cart.class, "productId=" + productId+" and businessId="+businessId);
        if (datas!=null&&datas.size()>0)
            updateCart(cxt, cart,productId,businessId);
        else
            saveCart(cxt,cart);
    }
}
