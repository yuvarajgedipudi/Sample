package org.network;

public class Claude implements Bureau {

    @Override
    public void test1() {
        System.out.println("This method is Test1");
    }

    @Override
    public void test2() {
        System.out.println("This method is Test2");
    }

    public static void main(String[] args) {
        Bureau c = new Claude();
        c.test1();
        c.test2();

    }
}
