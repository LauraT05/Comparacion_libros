import java.util.ArrayList;
import java.util.Collections;


public class Books {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        Book book1 = new Book("Jaque al psicoanalista", 48999.9, "John Katzenbach");
        Book book2 = new Book("El Quijote", 39999.9, "Miguel de Cervantes");
        Book book3 = new Book("La sombra del viento", 48999.9 ,"Carlos Ruiz Zafón");
        Book book4 = new Book("Satanas", 39999.9, "Mario Mendoza");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        System.out.println("");
        System.out.println("LISTA ORIGINAL");
        for (Book book : bookList) {
            System.out.println(book);
        }

        Collections.sort(bookList);

        System.out.println(" ");
        System.out.println("LISTA ORDENADA POR PRECIO/TITULO");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}

class Book implements Comparable<Book> {
    private String title;
    private double price;
    private String author;

    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        int comparationPrice = Double.compare(this.price, o.price);
        if (comparationPrice != 0) {
            return comparationPrice;
        }
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Titulo: " + this.title + " | Precio: $" + this.price + " | Autor: " + this.author;
    }
}