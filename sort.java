import java.util.Arrays;

public class sort {
   
    public static void main(String[]args) {
        int phy = 76;
        int chem = 87;
        int math = 70;

        int[]marks = new int[3];
        marks[0] =76;
        marks[1] = 87;
        marks[2] = 70;

       // System.out.println(marks.length);
     //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
