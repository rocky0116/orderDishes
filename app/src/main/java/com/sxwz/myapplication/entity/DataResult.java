package com.sxwz.myapplication.entity;

import java.io.Serializable;
import java.util.List;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10 17:03
 * description:
 *****************************************************/

public class DataResult implements Serializable {

    /**
     * error : false
     * results : [{"_id":1,"title":"今日特价","foodList":[{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"}],"type":"Android","desc":""},{"_id":2,"title":"新品推荐","foodList":[{"ID":101,"foodName":"小鲜肉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"小鲜肉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"小鲜肉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"小鲜肉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"小鲜肉","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":3,"title":"精选水果","foodList":[{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"海南香蕉","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":4,"title":"鲜切果盘","foodList":[{"ID":"sdfasdfasdf","foodName":101,"foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"sdfasdfasdf","foodName":101,"foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"sdfasdfasdf","foodName":101,"foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"sdfasdfasdf","foodName":101,"foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":5,"title":"精品干过","foodList":[{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"金钩大蜜女","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":6,"title":"精品零食","foodList":[{"ID":101,"foodName":"三只老鼠","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"三只老鼠","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"三只老鼠","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"三只老鼠","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":7,"title":"礼品专区","foodList":[{"ID":101,"foodName":"进店1则","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"进店1则","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"进店1则","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"进店1则","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":101,"foodName":"进店1则","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 1
         * title : 今日特价
         * foodList : [{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":101,"foodName":"巧克力","foodPrice":22.5,"salesCount":101,"imageUrl":"1"}]
         * type : Android
         * desc :
         */

        private int _id;
        private String title;
        private String type;
        private String desc;
        private List<FoodListBean> foodList;

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public List<FoodListBean> getFoodList() {
            return foodList;
        }

        public void setFoodList(List<FoodListBean> foodList) {
            this.foodList = foodList;
        }

        public static class FoodListBean {
            /**
             * ID : 101
             * foodName : 巧克力
             * foodPrice : 22.5
             * salesCount : 101
             * imageUrl : 1
             */

            private int ID;
            private String foodName;
            private double foodPrice;
            private int salesCount;
            private String imageUrl;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getFoodName() {
                return foodName;
            }

            public void setFoodName(String foodName) {
                this.foodName = foodName;
            }

            public double getFoodPrice() {
                return foodPrice;
            }

            public void setFoodPrice(double foodPrice) {
                this.foodPrice = foodPrice;
            }

            public int getSalesCount() {
                return salesCount;
            }

            public void setSalesCount(int salesCount) {
                this.salesCount = salesCount;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }
        }
    }
}
