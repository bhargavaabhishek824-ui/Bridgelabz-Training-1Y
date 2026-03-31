package WrapperClasses;
import java.util.*;
public class PrimitiveToWrapper_{
    public static void primitiveToWrapperConversion(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Integer num2 = num1;
        System.out.println("Primitive Data type: " + num1);
        System.out.println("Object Data Type: " + num2);
    }

    public static void main(String[] args) {
        primitiveToWrapperConversion();
    }
}