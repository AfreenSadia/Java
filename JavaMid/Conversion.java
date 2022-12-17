public class Conversion{
void Calculate(float celsius){
float kelvin = celsius + 273;
float farenheit = (celsius * (9/5)) +32;
System.out.println(celsius+"degree celsius in Fatenheit Scale is: "+farenheit);
System.out.println(celsius+"degree celsius in Kelvin Scale is: "+kelvin+" ");
}
public static void main(String[] args){
Conversion m1 = new Conversion();
m1.Calculate(20);
}
}