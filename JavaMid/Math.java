public class Math{
 void doSum(int a,int b,int c)
{
int sum=a+b+c;
System.out.println("The sum of "+ a + "," + b + " and " + c +" is "+ sum);
}
public static void main( String [] args)
{
//Math.doSum(5,6,4);

Math m1= new Math();
m1.doSum(5,6,7);
Math m2= new Math();
m2.doSum(5,7,7);
Math m3= new Math();
m3.doSum(5,9,2);

}

}