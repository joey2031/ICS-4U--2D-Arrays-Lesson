package pkg2darray.lesson;

public class Lesson {

    public static void main(String[] args) {
        int number[][] = new int[4][4];// two arrays first number is rwo second is coloum
        //number = {{0}};
        for (int i = 0; i < number.length; i++) { // transverse rows
            System.out.println();
            for (int j = 0; j < number[i].length; j++) { // transverse rcoloums
                System.out.print(number[i][j]);

            } // transverse means to go through, you need to transverse a arraylist and print elements.

        }
    }

}
