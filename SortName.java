import java.util.Scanner;
import java.util.Arrays;
public class SortName
{
public static void main(String[] args)
{
int i,j;
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of strings");
int num=sc.nextInt();
sc.nextLine();
String word[]=new String[num];
System.out.println("Enter Strings");
for(i=0;i<num;i++)
word[i]=sc.nextLine();
for(i=0;i<num-1;i++)
for(j=i+1;j<num;j++)
if(word[i].compareTo (word[j])>0)
{
 temp=word[i];
 word[i]=word[j];
 word[j]=temp;
}
System.out.println("Sorted Strings are:");
System.out.println(Arrays.toString(word));
}
}

