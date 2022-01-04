package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float width;
    float height;
        Scanner scanner = new Scanner(System.in); // khai bao  doi tuong scanner;
        System.out.println("Enter Width: ");
        width = scanner.nextFloat();// nhap chieu rong.
        System.out.println("Enter Height: ");
        height = scanner.nextFloat(); // nhap chieu dai
        float area = width * height;
        System.out.println("Area = "+ area);
    }
}
