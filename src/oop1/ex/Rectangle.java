package oop1.ex;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);
    int width;
    int height;


    void input(){
        System.out.print("Enter the width: ");
        width = sc.nextInt();
        System.out.print("Enter the height: ");
        height = sc.nextInt();
    }
    void area(){
        int area = width * height;
        System.out.println("넓이 : " + area);
    }
    void perimeter(){
        int perimeter = 2*(width+height);
        System.out.println("둘레 : " + perimeter);
    }
    void square(){
        if (width == height){
            System.out.println("정사각형입니다.");
        }
        else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
    void fullService(){
        input();
        area();
        perimeter();
        square();
    }
}
