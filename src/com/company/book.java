package com.company;

public class book {
    private int pages;
    private String name;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public book (String n,int p){
        name=n;
        pages=p;
    }
}
