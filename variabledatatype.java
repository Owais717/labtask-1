import java.util.*;
class variabledatatype{
public static void main(String[]args){
System.out.println("variable for datatypes");
Scanner ob= new Scanner(System.in);
int num;
float num1;
char alphabet;
System.out.println("Enter the integer type data");
num = ob.nextInt();
System.out.println(num);
System.out.println("Enter the Float datatype");
num1 = ob.nextFloat();
System.out.println(num1);
System.out.println("Enter the character data type");
alphabet = ob.next().charAt(0);
System.out.println(alphabet);
}
}