package com.FirstPackage;
public class SecondClass {
    private int x;
    private int y;
    public SecondClass(int a1,int b1){
        x = a1;
        y = b1;
    }
    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return x;
    }

    public void setY(int b) {
        this.y = b;
    }

    public int getY() {
        return y;
    }
    public int sum(){
        return x+y;
    }
}
