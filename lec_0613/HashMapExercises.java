package lec_0613;

import java.util.HashMap;
import java.util.Objects;

public class HashMapExercises {
    public static void main(String [] args){

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("key1", 1000);
//        map.put("key2", 2000);
//        System.out.println(map.get("key1"));
        HashMap<BookMetaData, Book> map = new HashMap<>();
        map.put(new BookMetaData(1000, 4.5),
                new Book("책 이름 1", "책 저자 1"));
        map.put(new BookMetaData(9000, 5.5),
                new Book("책 이름 2", "책 저자 2"));

        for(BookMetaData metaData : map.keySet()){
            if(metaData.price >=10000){
                System.out.println(map.get(metaData));
            }
        }
    }
}

class BookMetaData{
    public int price;
    public double rating;

    public BookMetaData(int price, double rating) {
        this.price = price;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookMetaData that = (BookMetaData) o;
        return price == that.price && Double.compare(that.rating, rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, rating);
    }

    @Override
    public String toString() {
        return "BookMetaData{" +
                "price=" + price +
                ", rating=" + rating +
                '}';
    }
}

class Book{
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}


