import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        //solucion exercise 1
        int[] array2 = new int[array.length];
        //solution exercise 2
        int[] array3 = new int[array.length];;
        System.out.println("array input:");
        System.out.println(Arrays.toString(array));

        //exercise 1
        for (int i= 0; i < array.length; i++){
            array2[i] = array[i]*array[(i+1)%array.length];
        }
        System.out.println("array output exercise 1:");
        System.out.println(Arrays.toString(array2));


        //solution exercise 2
        for(int i = 0; i < array.length; i++){
            array3[(array.length-1)-i] = array[i];
        }
        System.out.println("array output exercise 2:");
        System.out.println(Arrays.toString(array3));



    }
}
