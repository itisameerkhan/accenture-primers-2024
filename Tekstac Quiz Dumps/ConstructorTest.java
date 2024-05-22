public class ConstructorTest
{
private ConstructorTest(int w) // line 2
{
System.out.println(w);
}
public  ConstructorTest() // line 6
{
System.out.println(10);
}
public static void main(String args[])
{
ConstructorTest obj = new ConstructorTest(50);
}
}
