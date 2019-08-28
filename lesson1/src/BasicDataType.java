public class BasicDataType {

    public static void main(String[] args) {
        //布尔类型
        boolean areYouHappyToday = true;
//        boolean areYouHappyToday = false;

        if (areYouHappyToday) {
            System.out.println("Glad to hear that.");
        } else {
            System.out.print("Don't worry, take it ez");
        }

        //字符类型
        char c = '嘿';
        System.out.println("变量c是一个字符类型，值为： " + c);

        //整型，有byte，short，int，long四种
        // byte类型的范围为-128 ~ 127
        byte b = 's';  //对照ascii表，s对应的是115，这里也可以写成byte b = '115';
        System.out.println("变量b是一个整数类型，值为： " + b);

        // short类型的范围为-2的15次方 ~ 2的15次方-1
        short s = 1111;
        System.out.println("变量s是一个整数类型，值为： " + s);

        // int类型的范围为-2的31次方 ~ 2的31次方-1
        int i = 1111111111;
        System.out.println("变量i是一个整数类型，值为： " + i);

        // long类型的范围为-2的63次方 ~ 2的63次方-1
        long l = 2222222222222222L;  //long类型值的尾部要加L
        System.out.println("变量l是一个整数类型，值为： " + l);

        //浮点类型
        // 单精度浮点类型
        float f = 1.2f; //f不可省略
        System.out.println("变量f是一个单精度浮点类型，值为： " + f);

        // 双精度浮点类型
        double d = 2.2d; //d可省略
        System.out.println("变量l是一个双精度浮点类型，值为： " + d);
    }


}
