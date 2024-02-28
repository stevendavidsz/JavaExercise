package TugasJava;
import java.util.Scanner;
public class latihanSoal {
    Scanner scanner = new Scanner(System.in);
    public void tugas(int choice){
        //conditional menu
        switch (choice){
            case 1:
                System.out.println("enter the height of triangle");
                int tinggiSegitiga = scanner.nextInt();
                drawTriangle(tinggiSegitiga);
                break;
            case 2:
                System.out.println("enter the height of square");
                int persegi = scanner.nextInt();
                drawPersegi(persegi);
                break;
            case 3:
                System.out.println("enter the height of rectangle");
                int persegiPanjang = scanner.nextInt();
                drawPersegipanjang(persegiPanjang);
                break;
            case 4:
                break;
            default:
                System.out.println("invalid input");
        }

    }

    public void drawTriangle(int tinggiSegitiga) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= tinggiSegitiga; i++){
            for (int j = 1; j <= tinggiSegitiga - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }

    public void drawPersegi(int persegi) {
        for (int p = 2; p <= persegi; p++) {
            for (int s = 1; s <= persegi; s++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }

    public void drawPersegipanjang(int persegiPanjang){
        for (int p = 5; p <= persegiPanjang; p++) {
            for (int s = 0; s <= persegiPanjang; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void displayMenu(){
        System.out.println("Welcome to ASCII Shape Drawer!");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");

    }

    public void run (){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            tugas(choice); //dimana ada kondisional (if else atau switch case)
            System.out.println();
        }
    }
    public static void main (String[] args){
        //Inherintance (oop)
        //untuk running
        latihanSoal drawer = new latihanSoal();
        drawer.run();
    }
}
