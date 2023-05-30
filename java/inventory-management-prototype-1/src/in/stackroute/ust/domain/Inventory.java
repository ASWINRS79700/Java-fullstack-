package in.stackroute.ust.domain;


import java.util.*;


public class Inventory {

    private final List <Item>  inventory=new ArrayList<Item>();
    private int currentIndex, j;
    Scanner scan=new Scanner(System.in);
    public Inventory() {

        currentIndex = 0;
    }

    public void addStock(Item it) {
        inventory.add(it);
        currentIndex++;
        j=currentIndex;
    }

    public Item search(String str) {



        for (int i = 0; i < j; i++) {
            if (Objects.equals(inventory.get(i).Name, str)) {
                System.out.println("*---------------------------------------------------*");

                display(inventory.get(i));
                System.out.println("*---------------------------------------------------*");

                return null;
            }
        }
        System.out.println("Product not found");
        return null;
    }
    public void sort(){
        System.out.println("1.Price");
        System.out.println("2.Product");
        int j=scan.nextInt();

        if(j==1){
               PriceComparator  comparator=new PriceComparator();
            inventory.sort(comparator);

        } else if (j==2) {
           NameComparator comparator=new NameComparator();
            inventory.sort(comparator);

        }

    }

    public void all() {
        System.out.println("*---------------------------------------------------*");

        for (int i = 0; i <j; i++) {
            if (inventory.get(i).Name.isEmpty()) {
                break;
            } else
                display(inventory.get(i));
        }
        System.out.println("*---------------------------------------------------*");

    }

    public void display(Item it) {
        System.out.println("Product id: " + it.Id+" name: " + it.Name+" Description: " + it.Description+" price: " + it.Price+" quantity: " + it.Quantity);
    }
    class PriceComparator implements Comparator<Item>{
        @Override
        public int compare(Item o1, Item o2) {
            return Integer.compare(o1.Price, o2.Price);
        }
    }
    class NameComparator implements Comparator<Item>{
        @Override
        public int compare(Item o1, Item o2) {

            return o1.Name.compareTo(o2.Name);
        }
    }
}
