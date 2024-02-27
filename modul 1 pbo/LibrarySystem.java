/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul1;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class LibrarySystem {

    // Data pengguna mahasiswa
    private static final String[][] usersMahasiswa = {
        {"202110370311347", "pass1"},
    };

    // Data pengguna admin
    private static final String adminUsername = "admin";
    private static final String adminPassword = "adminpass";

    // Fungsi untuk melakukan login
    private static void login(int option) {
        Scanner scanner = new Scanner(System.in);
        if (option == 1) {
            System.out.print("Enter your NIM: ");
            String nim = scanner.nextLine();
            boolean userFound = false;
            for (String[] user : usersMahasiswa) {
                if (user[0].equals(nim)) {
                    System.out.println("Successful Login as Student");
                    userFound = true;
                    break;
                }
            }
            if (!userFound) {
                System.out.println("User Not Found");
            }
        } else if (option == 2) {
            System.out.print("Enter your username (admin): ");
            String username = scanner.nextLine();
            System.out.print("Enter your password (admin): ");
            String password = scanner.nextLine();
            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Successful Login as Admin");
            } else {
                System.out.println("Admin User Not Found!!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilan menu
        System.out.println("Library System");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");

        // Input pilihan pengguna
        int option = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline dari buffer

        // Proses login berdasarkan pilihan pengguna
        if (option >= 1 && option <= 3) {
            if (option == 3) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            login(option);
        } else {
            System.out.println("Invalid option!");
        }
    }
}

}
