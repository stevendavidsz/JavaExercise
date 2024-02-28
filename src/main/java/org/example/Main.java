package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("hello and welcome");
        System.out.println("hello and welcome");
        System.out.print("hello and welcome");

        //variable1
        boolean flag; //try_catch
        float num;
        //looping 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "steven";
        char q = 'Y';
        boolean flag2 = true;

        int result;
        result = a / b;
        System.out.println(result);

        float resultFloat;
        resultFloat = a / c;
        int resultType = (int) (a / c);
        System.out.println(resultFloat);
        System.out.println(resultType);

        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 9;
        int waktuPulang = 14;
        //Karyawan tepat waktu dapat selamat
        //karyawan pulang cepat disoraki
        if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("selamat kamu tepat waktu");
            System.out.println("anda datang " + (timeStart - waktuSaya) + " jam lebih cepat");
            System.out.println("anda pulang" + (waktuPulang - timeFinish) + " jam lebih cepat");
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("dateng awal pulang cepat");

        } else if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaafkan dateng telatnya");
        } else {
            System.out.println("kamu telat nih");
            System.out.println("anda telat " + (waktuSaya - timeStart) + "jam");
            System.out.println(("anda pulang duluan" + (timeFinish - waktuPulang) + "jam lebih cepat"));

        }
        int day = 3;
        switch (day){
            case 1:
                System.out.println("Saya wfo");
                break;
            case 2:
                System.out.println("saya libur");
                break;
            case 3:
                System.out.println("saya wfh");
            default:
                System.out.println("liburan alias weekend");
                break;
        }
        System.out.println("ahhaha");
    }

    //Loop
    //while loop dan for loop, foreach
}
