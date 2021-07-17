package com.kavinmaha.classesAndObjects;

public class Classes {
    public static void main(String[] args) {
        Iphone huawei8Lite = new Iphone(IphoneModel.HUAWEI_8_LITE);
        Iphone huawei9Y = new Iphone(IphoneModel.HUAWEI_9_Y,135.00,true);

//          huawei8Lite.setModel("Huawei8Lite");
//          huawei8Lite.setPrice(200.00);
//          huawei8Lite.setWaterResistant(true);

//        huawei9Y.setModel("Huawei9Y");
//        huawei9Y.setPrice(185.00);
//        huawei9Y.setWaterResistant(false);

        System.out.println("--Huawei--");
        System.out.println(huawei8Lite.getModel());
        System.out.println(huawei8Lite.getPrice());
        System.out.println(huawei8Lite.isWaterResistant());

        System.out.println();

        System.out.println("--Huawei New--");
        System.out.println(huawei9Y.getModel());
        System.out.println(huawei9Y.getPrice());
        System.out.println(huawei9Y.isWaterResistant());

        System.out.println(huawei8Lite);
        System.out.println(huawei8Lite.getModel());
        System.out.println(huawei8Lite.getModel().getModelName());
        System.out.println(huawei9Y.getModel());
        System.out.println(huawei9Y.getModel().getModelName());

    }
}
