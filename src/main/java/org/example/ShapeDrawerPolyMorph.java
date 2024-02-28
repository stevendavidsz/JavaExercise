package org.example;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collection;
import java.util.AbstractCollection;

interface Shape { //one of implementation of polymorphism
    void draw(int height);
}

class drawTriangleSS implements Shape {
    //nested loop
    //outer loop (take care the rows)
    @Override
    public void draw(int tinggiSegitiga){

        for(int i = 1; i <= tinggiSegitiga;i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }
}

class drawTriangleSK implements Shape{
@Override
public void draw(int tinggiSegitiga2) {
    //nested loop
    //outer loop (take care the rows)
    for(int i = 1; i <= tinggiSegitiga2; i++){
        for (int j = 1; j <= tinggiSegitiga2 - i; j++){
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++){
            System.out.print("*");
        }
        //inner loop
        System.out.println();

        }
    }
}

class drawPersegi implements Shape{
    @Override
    public void draw(int persegi) {
        for (int p = 2; p <= persegi; p++) {
            for (int s = 1; s <= persegi; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Welcome to ASCII Shape Drawer!");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");

    }

    public void drawShape(int choice) {
        try {
            //conditional menu
            switch (choice) {
                case 1:
                    System.out.println("enter the height of triangle");
                    int tinggiSegitiga = scanner.nextInt();
                    new drawTriangleSK().draw(tinggiSegitiga);
                    break;
                case 2:
                    System.out.println("masukan berapa tinggi segitiga");
                    int tinggiSegitiga2 = scanner.nextInt();
                    new drawTriangleSK().draw(tinggiSegitiga2);
                    break;
                case 3:
                    System.out.println("enter the height of rectangle");
                    int persegi = scanner.nextInt();
                    new drawPersegi().draw(persegi);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid input");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Please enter a valid integer");
            scanner.next();
        }
    }

    public void run(){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true) {
            displayMenu();
            System.out.println("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                drawShape(choice); //dimana ada kondisional (if else atau switch case)
                System.out.println();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }
    }
    public static void main (String[] args){
        //Inherintance (oop)
        //untuk running
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}
