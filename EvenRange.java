import java.io.*;
class EvenRange
{
public static void main(String args[])
{
int start,end,i;
try
{
DataInputStream in=new DataInputStream(System.in);
start=Integer.parseInt(in.readLine());
end=Integer.parseInt(in.readLine());
if(start!=end)
{
for(i=start;i<=end;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
else
{
System.out.println("Invalid Data");
}
}
catch(Exception e)
{
}
}
}
