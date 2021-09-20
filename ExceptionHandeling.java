class ExceptionHandeling
{
public static void main(String[] args) throws Exception
{
try{
    int d = 20/0;
}catch(ArithmeticException e){
System.out.println("Interrupted Data"+e);
}finally{
System.out.println("Always Executed");
}
}
}