import java.util.Scanner;

class Person {
    String name, address, phone, mobile, head, id;
}

public class Directory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person p[] = new Person[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Entry");
            System.out.println("2. Edit Entry");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                p[count] = new Person();

                System.out.print("Enter ID: ");
                p[count].id = sc.nextLine();

                boolean unique = true;
                for (int i = 0; i < count; i++) {
                    if (p[i].id.equals(p[count].id)) {
                        unique = false;
                        break;
                    }
                }

                if (!unique) {
                    System.out.println("ID must be unique");
                    continue;
                }

                System.out.print("Enter Name: ");
                p[count].name = sc.nextLine();

                System.out.print("Enter Address: ");
                p[count].address = sc.nextLine();

                System.out.print("Enter Phone: ");
                p[count].phone = sc.nextLine();

                System.out.print("Enter Mobile: ");
                p[count].mobile = sc.nextLine();

                System.out.print("Enter Head of Family: ");
                p[count].head = sc.nextLine();

                count++;
                System.out.println("Entry Added");
            }

            else if (choice == 2) {
                System.out.print("Enter ID to edit: ");
                String searchId = sc.nextLine();

                for (int i = 0; i < count; i++) {
                    if (p[i].id.equals(searchId)) {
                        System.out.print("Enter new Name: ");
                        p[i].name = sc.nextLine();
                        System.out.print("Enter new Address: ");
                        p[i].address = sc.nextLine();
                        System.out.print("Enter new Phone: ");
                        p[i].phone = sc.nextLine();
                        System.out.print("Enter new Mobile: ");
                        p[i].mobile = sc.nextLine();
                        System.out.print("Enter new Head: ");
                        p[i].head = sc.nextLine();
                        System.out.println("Updated");
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter keyword: ");
                String key = sc.nextLine().toLowerCase();

                for (int i = 0; i < count; i++) {
                    if (p[i].name.toLowerCase().contains(key) ||
                        p[i].address.toLowerCase().contains(key) ||
                        p[i].phone.toLowerCase().contains(key) ||
                        p[i].mobile.toLowerCase().contains(key) ||
                        p[i].head.toLowerCase().contains(key) ||
                        p[i].id.toLowerCase().contains(key)) {

                        System.out.println("\nID: " + p[i].id);
                        System.out.println("Name: " + p[i].name);
                        System.out.println("Address: " + p[i].address);
                        System.out.println("Phone: " + p[i].phone);
                        System.out.println("Mobile: " + p[i].mobile);
                        System.out.println("Head: " + p[i].head);
                    }
                }
            }
        } while (choice != 4);
        sc.close();
    }
}