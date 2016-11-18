package com.java.oop.rectangle;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void draw(){
        for(int i = 0; i < width; i++){
            System.out.print("#");
            for(int j = 0; j < height - 2; j++){
                if( i == 0 || i == width - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
