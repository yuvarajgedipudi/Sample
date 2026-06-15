package org.network;

public class Beta extends Alpha {

    public void samsung() {
        System.out.println("This Method name is beta Samsung");

    }

    @Override
    public void test() {
          System.out.println("The    method is test");
    }

    public static void main(String[] args) {
        Alpha b = new Beta();
        b.test();
    }


}
