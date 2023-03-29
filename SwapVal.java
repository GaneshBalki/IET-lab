class SwapVal{
//why we taken static access modifier
//ans : main class hi method static aahe ani hi method aplyala main madhi call karychi ahhe
//pass by value ni pass by ref fkt non-premitive data type sathi use hote.
public static void swapbyval(Demo d1,Demo d2)
{
Demo temp;
temp=d1;
d1=d2;
d2=temp;


		System.out.println("in side Swap Function");

		d1.showData();
		d2.showData();
		

		System.out.println("\n\n");



}
}