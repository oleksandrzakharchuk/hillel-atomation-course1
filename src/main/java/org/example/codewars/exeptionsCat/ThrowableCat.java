package org.example.codewars.exeptionsCat;

class ThrowableCatView {
    public static void main(String[] args) {


        Object cat = null;


        if (cat == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException - Кота не существует");
            }
        }
    }
}