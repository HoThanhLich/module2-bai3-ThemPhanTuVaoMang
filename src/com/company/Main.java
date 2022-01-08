package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 5, 6, 7, 8, 9, 21, 4, 0, 0, 0, 0, 0};
        int index;
        System.out.print("Mang ban dau:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
        System.out.print("Hay nhap gia tri can them vao: ");
        int value = scanner.nextInt();
        do {
            System.out.print("nhap vi tri muon them: ");
            index = scanner.nextInt();
            if (index <= 0 || index >= arr.length) {
                System.out.println("Vi tri ngoai pham vi cua mang");
            }
        } while (index <= 0 || index >= arr.length);

        for (int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        System.out.print("Mang moi la: ");
        for (int i = 0; i<arr.length; i++){
            System.out.printf("%3d",arr[i]);
        }
    }
}
