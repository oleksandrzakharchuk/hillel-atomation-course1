package org.example.homeworks.hw08;

public class Libraru {
    public static void main(String[] args) {

        Autor leva = new Autor("Lev", "Tolstoy");
        Autor ksLevis = new Autor("Kark", "Levis");
        Autor leva2 = new Autor("Lev", "Tolstoy");

        Book worAndPeace = new Book("war&pease",
                leva, "1888",
                "qwqwqwqq", "2142347923759237");
        Book otherBook = new Book("Anna Karenina",
                leva, "1888",
                "uuuuuuuu", "888888888");


        System.out.println(leva.equals(ksLevis));
        System.out.println(leva.equals(leva2));

        System.out.println(worAndPeace.equals(otherBook));
        System.out.println(worAndPeace.equals(worAndPeace));


        System.out.println(worAndPeace.hashCode());
        System.out.println(otherBook.hashCode());


        System.out.println(leva.hashCode());
        System.out.println(leva2.hashCode());

        System.out.println(ksLevis.hashCode());


    }
}

