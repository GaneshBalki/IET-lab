class Main{

public static void main(String []args){


/*
Demo D=new Demo(11);
Demo D1=new Demo(12);
System.out.println("Before swap the values are :");
D.showData();
D1.showData();


SwapVal.swapbyval(D,D1 );
System.out.println("After swap the values are :");

D.showData();
D1.showData();*/
System.out.println("pass by Ref :");
Demo a[]=new Demo[2];

System.out.println("Before swap the values are :");
a[0]=new Demo(11);
a[1]=new Demo(22);
a[0].showData();
a[1].showData();
SwapValByRef.swapByRef(a);
System.out.println("After swap the values are :");

a[0].showData();
a[1].showData();
}
}