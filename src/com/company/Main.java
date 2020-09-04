package com.company;

public class Main {

    public static void main(String[] args) {
	book n1= new book("1984",315);
	book n2= new book("we",250);
	book n3=new book("jojo bizzare adventure",750);
        System.out.println(n1.getName()+"    "+n1.getPages());
        System.out.println(n2.getName()+"    "+n2.getPages());
        System.out.println(n3.getName()+"    "+n3.getPages());


    }
}
