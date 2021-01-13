package com.company;

public class abstraction {
    public static float radius = 10.0f;
    public  static void main(String[] args) {
        //Circle c1 = new Circle();
        //c1.radius = 10.0f;
        //System.out.println(c1.calculate_area());

        TestClass c1 = new TestClass(2, 5.2);
        TestClass c2 = new TestClass(3, 7.5);
        System.out.println(c1.a + ", " + c1.b);

    }
}
class TestClass {

    public int a;
    public double b;

    public TestClass(int first, double second) {

        this.a = first;
        this.b = second;
    }
}
class Circle {
    public float radius;
    public  float calculate_area() {
        return 3.141f * radius * radius;
    }
}
