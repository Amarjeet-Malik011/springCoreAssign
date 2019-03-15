package com.ttn.play;

public class Try {
    void show(A a){
        System.out.println("a");
    }
    void show(B b){
        System.out.println("b");
    }
    void show(C c){
        System.out.println("c");
    }
    public static void main(String[] args) {
        new Try().show(null);
    }
}
class A{

}
class B extends A{

}
class C extends B{

}