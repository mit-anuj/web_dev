import java.util.*;
public class Bus{
int bus_no=789;
String r_n="Del to Ddun";
int t_s[]= new int[50]; int s_n[]=new int[50];


void t_f(int c){
System.out.println("Your seat(s) has been booked");
System.out.println("The total fare for your seats is "+c*50 );}
String[] pas=new String[50];
int x=0;
void insert(int m ,String n)
{
for(int j=x;j<x+m;j++){
t_s[j]=1;pas[j]=n;

j++;}
t_f(m);
}
public static void main(String[] ab)
{Bus o=new Bus();
   boolean  e=true;for(int i=0;i<50;i++){
    
o.t_s[i]=0; o.s_n[i]=i+1;
}

while(e){System.out.println("BUS NO.- "+o.bus_no+"                           ROUTE-  "+o.r_n);

  System.out.println("*****MAIN MENU*******");
int a;
Scanner dd=new Scanner(System.in);
System.out.println("Press 1 for Booking seat");
System.out.println("Press 2 see seat status");
System.out.println("Press 3 to check seat availability");
System.out.println("Press 4 to exit");
a=dd.nextInt();
if(a==1){
Scanner tt=new Scanner(System.in);
System.out.println("Enter passengers name");

String c=tt.nextLine();
System.out.println("Enter number of seats");
int d=tt.nextInt();
o.insert(d,c);}

 if(a==2)
{System.out.println("SEAT NO        STATUS             NAME");
for(int k=0;k<50;k++){if(k<=o.x){
System.out.println(o.s_n[k]+"         Booked          "+o.pas[k]);
}else
System.out.println(o.s_n[k]+"         Not Booked             Null");


}
}
else if(a==3)
{
System.out.println("There are "+(50-o.x)+" seats available");}else if(a==4)
{  
System.out.println("Thanks for using our service");
    e=false;
}


}
}
}