package ui;

import java.util.Scanner;

import services.AdminService;
import services.AuthenticationService;
import services.AccountService;

public class Menu {
    public static void displaymainmenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----BANK MANAGEMENT SYSTEM-----");
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("3.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Username: ");
                    String username = sc.nextLine();
                    System.out.println("Enter Password: ");
                    String password = sc.nextLine();
                    if (!AuthenticationService.login(username, password)) {
                        System.out.println("Invalid Credentials/Username doesn't exist");
                    }
                    break;
                case 2:
                    System.out.println("Enter Username: ");
                    String newuser = sc.nextLine();
                    System.out.println("Enter Password: ");
                    String newpassword = sc.nextLine();
                    if (AuthenticationService.register(newuser, newpassword, "CUSTOMER")) {
                        System.out.println("User Successfully Created!");
                    } else {
                        System.out.println("User already Exists!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting....Thank You!!");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void displaycustomermenu(int user_Id, String username) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome, " + username);
            System.out.println("1.Open New Account");
            System.out.println("2.View Account");
            System.out.println("3.Delete Account");
            System.out.println("4.Logout");
            System.out.println("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Account type(Savings/Current)");
                    String account_type = sc.nextLine().toLowerCase();
                    System.out.println("Enter Initial deposit(Minimum-Rs1000):");
                    double depositamount = sc.nextDouble();
                    AccountService.createnewaccount(user_Id, account_type, depositamount);
                    break;
                case 2:
                    System.out.print("Enter Account Number to view: ");
                    String accountNumView = sc.nextLine();
                    AccountService.viewaccount(accountNumView);
                    break;
                case 3:
                    System.out.print("Enter Account Number to delete: ");
                    String accountnumber = sc.nextLine();
                    AccountService.deleteaccount(accountnumber);
                    break;
                case 4:
                    System.out.println("Logged out Successful");
                    return;
                default:
                    System.out.println("Invalid Choice...Please try again!");
            }
        }
    }

    public static void displayadminmenu(int user_Id, String username) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome, Admin " + username);
            System.out.println("1.View all Users");
            System.out.println("2.Delete User");
            System.out.println("3.Logout");
            System.out.println("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    AdminService.viewallusers();
                    break;
                case 2:
                    System.out.print("Enter Account Number to delete: ");
                    String accountnumber = sc.nextLine();
                    AdminService.deleteUser(accountnumber);
                    break;
                case 3:
                    System.out.println("Logged out Successful");
                    return;
                default:
                    System.out.println("Invalid Choice...Please try again!");
            }
        }
    }
}