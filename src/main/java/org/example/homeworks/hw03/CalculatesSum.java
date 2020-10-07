package org.example.homeworks.hw03;

public class CalculatesSum {
    public static void main(String[] args) {
        int[]colom1={1,2,3,4,5,6};
        int[]colom2={1,2,3,4,5,6,7};

        if(colom1.length>colom2.length)
            System.out.println("Colom1 has bigger size");
        if (colom1.length<colom2.length)
            System.out.println("Colom2 has bigger size");

        else
            System.out.println("Colom1=Colom2");


    }
}


//8. Write a program which calculates the sum of two columns. the output
// should be. Print table if columns have the same size. Otherwise print
// which column has bigger size
// | row_1 | row_2 | sum |
// | 2 | 5 | 7 |

