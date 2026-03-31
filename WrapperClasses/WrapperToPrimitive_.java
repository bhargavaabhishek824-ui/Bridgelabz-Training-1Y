package WrapperClasses;
import java.util.*;
public class WrapperToPrimitive_{
    public static void rapperToPrimitiveConversion(){
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        int num3 = (int) num2;
        System.out.println("Double object: " + num1);
        System.out.println("double Primitive: " + num2);
        System.out.println("Intger primitive: " + num3);
    }

    public static void main(String[] args) {
        rapperToPrimitiveConversion();
    }
}