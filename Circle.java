package com.app.appium;

class Circle extends Shape {
    public String name = "circle"; //父类属性被隐藏
     
    public Circle() {
        System.out.println("circle constructor");
    }
   
    //对父类实例方法的覆盖
    public void printType() {
        System.out.println("this is circle");
    }
    
   //对父类静态方法的隐藏  
    public static void printName() {
        System.out.println("circle");
    }
}
