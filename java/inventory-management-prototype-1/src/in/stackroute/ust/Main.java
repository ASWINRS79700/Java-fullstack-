package in.stackroute.ust;

import in.stackroute.ust.domain.Inventory;
import in.stackroute.ust.domain.Item;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Inventory in=new Inventory();
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Inventory management application - proptotype 1.0");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Add item");
            System.out.println("2. Search item");
            System.out.println("3. Sort item");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            n= scan.nextInt();

            if(n==1){
                System.out.println("Enter the Id: ");
                int id=scan.nextInt();
                System.out.println("Enter the name: ");
                String name=scan.next();
                System.out.println("Enter the description: ");
                String des=scan.next();
                System.out.println("Enter the price: ");
                int price=scan.nextInt();
                System.out.println("Enter the quantity: ");
                int quantity=scan.nextInt();
                Item it=new Item(id,name,des,price,quantity);

                in.addStock(it);
            } else if (n==2) {
                System.out.println("Enter the name of product : ");
                String s=scan.next();
                in.search(s);

            }
            else if(n==3){
                in.sort();
            }else if(n==4){
                in.all();
            }

        }while(n!=5);

        // this will be the main entry point for the application,
        // this will be a menu-driven application
        // the menu will have the following options:
        // 1. Add item
        // 2. Search item
        // 3. Display all items
        // 4. Exit
    }
}