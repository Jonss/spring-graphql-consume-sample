package br.com.jonss.graphqlconsume.domain;

public class Data {
    private FindAuthor findAuthor;

    public FindAuthor getFindAuthor() {
        return findAuthor;
    }

    public void setFindAuthor(FindAuthor findAuthor) {
        this.findAuthor = findAuthor;
    }

    @Override
    public String toString() {
        return "Data{" +
                "findAuthor=" + findAuthor +
                '}';
    }
}
