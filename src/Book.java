import java.util.ArrayList;
import java.util.*;

public class Book {
    public static void main(String[] args) {
        List<Books> BooksList = new ArrayList<>();


        Books book1 = new Books("Cien años de soledad", 15.99, "Gabriel García Márquez");
        Books book2 = new Books("La sombra del viento", 18.75, "Carlos Ruiz Zafón");
        Books book3 = new Books("El Quijote", 12.50, "Miguel de Cervantes");
        Books book4 = new Books("Satanas", 15.99, "Mario Mendoza");

        BooksList.add(book1);
        BooksList.add(book2);
        BooksList.add(book3);
        BooksList.add(book4);

        System.out.println("LISTA ORDENADA");
        for(Books book : BooksList){
            System.out.println(book);
        }

        Collections.sort(BooksList);

        System.out.println(" ");
        System.out.println("LISTA ORDENADA POR PRECIO");
        for(Books book : BooksList){
            System.out.println(book);
        }
    }
}

class Books implements Comparable<Books> {
    private String title;
    private double price;
    private String author;

    public Books(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public int compareTo(Books o) {
        int comparationPrice = Double.compare(this.price, o.price);
        if (comparationPrice != 0) {
            return comparationPrice;
        }
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Titulo: " + this.title + " Precio: $ " + price;
    }
}