package com.winterbe.java8.samples.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listToMap {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        System.out.println(bookList.stream().collect(Collectors.toMap(Book::getDesc, Book::getDesc)));

    }


}

class Book{

    String desc;
    int i;
    String s;

    public Book(String desc, int i, String s) {
        this.desc = desc;
        this.i = i;
        this.s = s;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
