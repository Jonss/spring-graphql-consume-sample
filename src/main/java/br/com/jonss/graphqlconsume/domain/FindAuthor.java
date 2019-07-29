package br.com.jonss.graphqlconsume.domain;


import java.util.ArrayList;
import java.util.List;

public class FindAuthor {
    private String email;
    private String fullname;
    private List<Book> books = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "FindAuthor{" +
                "email='" + email + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
