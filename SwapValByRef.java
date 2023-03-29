class SwapValByRef{

public static void swapByRef(Demo d[])
{
Demo temp=null;
temp=d[0];
d[0]=d[1];
d[1]=temp;
System.out.println("\n");

		System.out.println("in side Swap Function");

		d[0].showData();
		d[1].showData();
		System.out.println("\n");



}
}