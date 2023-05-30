package in.stackroute.ust;

import in.stackroute.ust.library.Book;
import in.stackroute.ust.library.Library;
import in.stackroute.ust.library.SortOrder;

public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();
        
        Book alchemist = new Book("The Alchemist", "Paulo Coelho");
        Book animalFarm = new Book("Animal Farm", "George Orwell");
        Book lifeIsWhatYouMakeIt = new Book("Life is What You Make It", "Preeti Shenoy");
        Book oldManAndTheSea = new Book("Old Man And The Sea", "Ernest Hemingway");
        Book girlWithTheDragonTatoo = new Book("Girl With The Dragon Tatoo", "Stieg Larson");

        library.addBook(alchemist);
        library.addBook(animalFarm);
        library.addBook(lifeIsWhatYouMakeIt);
        library.addBook(oldManAndTheSea);
        library.addBook(girlWithTheDragonTatoo);

        library.printBooks();

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        library.searchByTitle("The Alchemist");
        library.searchByTitle("The Alchemist1");

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorting by title");
        System.out.println();
        library.printBooks(SortOrder.TITLE);
        System.out.println();
        System.out.println("Sorting by author");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        library.printBooks(SortOrder.AUTHOR);

    }
}