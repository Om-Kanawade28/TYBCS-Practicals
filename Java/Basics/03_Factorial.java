
class Factorial{
public  static void main(String arg[]){
int num = Integer.parseInt(arg[0]);
int a = num;
int fact = 1;
while(num>0){

fact = fact*num;
num--;
}
System.out.println("factoril of "+a+" is "+fact);
}
}
