package easy;

import  java.util.Scanner;

class Main {

    public static void main(String[] args) {

    char action;
    char addition, subtraction, multiplication, division;

    subtraction = '-';
    addition = '+';
    multiplication = '*';
    division = '/';

    System.out.println("This program is designed especially to work with matrix i.e." +
            " " + "to set their size, fulfill them and than do some calculations");
    int amountOfStrings, amountOfColumns;
    Scanner scan = new Scanner(System.in);

    System.out.println("Imagine that you have 2 matrix, now you have to set their size" +
            " " + "and fill'em with numbers you want.");
    System.out.println("");
    System.out.println("You have to set size of the matrix by entering 2" +
            " " + "numbers, first one will set the amount of positions in down, and" +
            " " + "the second will set amount of columns of your matrix.");
    System.out.println("");
    System.out.println("The size that you will enter will be assigned to both of matrix" +
            " " + "in order to to do some calculating later, so the amount of numbers, down positions" +
            " " + "and columns will be equal");
    System.out.println("");
    System.out.println("So please, set size now");

    amountOfStrings = scan.nextInt();

    System.out.println("The amount of down positions that you've entered are:" + " " + amountOfStrings);
    amountOfColumns = scan.nextInt();
    System.out.println("The amount of columns that you've entered are:" + " " + amountOfColumns);
    System.out.println("");

    int matrix[][] = new int[amountOfStrings][amountOfColumns];
    int matrix2[][] = new int[amountOfStrings][amountOfColumns];

    System.out.println("Now your 2 matrix consist of" + " " + amountOfStrings + " " + "down positions" +
            " " + "and" + " " + amountOfColumns + " " + "columns," + " " + "amount of numbers inside is:" + " " + amountOfStrings * amountOfColumns);
    System.out.println("");

    int c = amountOfStrings; 
    int d = amountOfColumns; 

    System.out.println("Now you now how many numbers are in your matrix," +
            " " + "you have to enter them consequently, after entering each number PLS" +
            " " + "press ENTER-button, and proceed until you reach the right amount, which is," +
            " " + " I REPEAT AGAIN:" + " " + amountOfStrings * amountOfColumns);

    for (c = 0; c < amountOfStrings; c++) {
        for (d = 0; d < amountOfColumns; d++) {
            scan = new Scanner(System.in);
            matrix[c][d] = scan.nextInt();
        }
    }

    System.out.println("");
    System.out.println("Well done, you fulfilled first matrix with numbers");
    System.out.println("");

    System.out.println("Now your first matrix looks like:");
    for (c = 0; c < amountOfStrings; c++) {
        System.out.println(" ");
        for (d = 0; d < amountOfColumns; d++) {
            System.out.print(matrix[c][d] + " ");
        }
    }

    System.out.println("");
    System.out.println("");
    System.out.println("Now lets do the sam work with the second matrix" + " "
            + "as I've already told you that the sizes of 2 matrix are the same," +
            " " + "that means that the second matrix consist of" + " " + amountOfStrings + " " + "down positions" +
            " " + "and" + " " + amountOfColumns + " " + "columns," + " " +
            "and the amount of numbers inside is:" + " " + amountOfStrings * amountOfColumns);
    System.out.println("");
    System.out.println("The same work, just enter numbers, like you do with first matrix," +
            " " + "just fulfill it with numbers");

    for (c = 0; c < amountOfStrings; c++) {
        System.out.println("");
        for (d = 0; d < amountOfColumns; d++) {
            scan = new Scanner(System.in);
            matrix2[c][d] = scan.nextInt();
        }
    }

    System.out.println("");
    System.out.println("Well done, you fulfilled second matrix1 with numbers");
    System.out.println("");

    System.out.println("Now your second matrix looks like:");
    for (c = 0; c < amountOfStrings; c++) {
        System.out.println("");
        for (d = 0; d < amountOfColumns; d++) {
            System.out.print(matrix2[c][d] + " ");
        }
    }

    System.out.println("");
    System.out.println("Very well, now you have 2 complete matrix fulfilled with numbers," +
            " " + "lets look at them again");
    System.out.println("");

    System.out.println("The 1st matrix:");
    for (c = 0; c < amountOfStrings; c++) {
        System.out.println("");
        for (d = 0; d < amountOfColumns; d++) {
            System.out.print(matrix[c][d] + " ");
        }
    }

    System.out.println("");
    System.out.println("The 2nd matrix:");
    for (c = 0; c < amountOfStrings; c++) {
        System.out.println("");
        for (d = 0; d < amountOfColumns; d++) {
            System.out.print(matrix2[c][d] + " ");
        }
    }

    System.out.println("");
    System.out.println("Now, after completing 1st stage - " +
            " " + "setting size and fulfilling 2 matrix with the numbers we proceeding to" +
            " " + "the 2nd stage - some calculations");

    System.out.println("");
    System.out.println("Like in usual mathematical example the action wll be completed" +
            " " + "in the following order => matrix" + " " + "action" + " " + "matrix 2 = result");

    System.out.println("");
    System.out.println("You will be offered to chose an action, that you want to do with your 2 matrix");
    System.out.println("");
    System.out.println("So, now it's high time to chose an action," +
            " " + "PLS chose action from these: + or - or * or /");

    scan = new Scanner(System.in);
    action = scan.next().charAt(0);
    System.out.println("You've chosen" + " " + action + " " + "between your 2 matrix");

    if (action == addition) {
        for (c = 0; c < amountOfStrings; c++) {
            for (d = 0; d < amountOfColumns; d++) {
                matrix[c][d] = matrix[c][d] + matrix2[c][d];
                System.out.println("The result of the addition in this row between 2 matrix is " +
                        " " + "equal to" + " " + matrix[c][d]);
            }
        }
    }

    if (action == subtraction) {
        for (c = 0; c < amountOfStrings; c++) {
            for (d = 0; d < amountOfColumns; d++) {
                matrix[c][d] = matrix[c][d] - matrix2[c][d];
                System.out.println("The result of the subtraction in this row between 2 matrix is " +
                        " " + "equal to" + " " + matrix[c][d]);
            }
        }

    }

    if (action == division) {
        for (c = 0; c < amountOfStrings; c++) {
            for (d = 0; d < amountOfColumns; d++) {
                matrix[c][d] = matrix[c][d] / matrix2[c][d];
                System.out.println("The result of the division in this row between 2 matrix is " +
                        " " + "equal to" + " " + matrix[c][d]);
            }
        }

    }
    
    if (action == multiplication) {
        for (c = 0; c < amountOfStrings; c++) {
            for (d = 0; d < amountOfColumns; d++) {
                matrix[c][d] = matrix[c][d] * matrix2[c][d];
                System.out.println("The result of the multiplication in this row between 2 matrix is " +
                        " " + "equal to" + " " + matrix[c][d]);
            }
        }

    }
}
}
