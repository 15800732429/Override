package com.app.appium;

public class Test {
    public static void main(String[] args)  {
    	Circle circle = new Circle();//本类引用指向本类对象
        Shape shape = new Circle();//父类引用指向子类对象(会有隐藏和覆盖)
        
       System.out.println(circle.name);
       circle.printType();
       circle.printName();
       //以上都是调用Circle类的方法和引用
       
        System.out.println(shape.name);//调用父类被隐藏的name属性
        shape.printType();//调用子类printType的方法
        shape.printName();//调用父类隐藏的printName方法 
    }
}


