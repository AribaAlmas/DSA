package Assignment1;
import java.util.*;
class Array
{
    private int [] arr;
    private int length;
    private int size;
  public Array(int n)
    {
        arr = new int[n];
        length= n;
        size = 0;
    }
 public boolean isEmpty()
 {
    if(size== 0)
        return true;

    else
        return false;
 }
 public int Size()
 {
    return size;
 }
 public void insert(int x , int index)
 {
    if(size == length)
        throw new RuntimeException("Array is full ");
    if(index < 0 || index > size)
        throw new RuntimeException("Invalid Index");
    for(int i = size-1 ; i>=index;i--)
    {
        arr[i+1] = arr[i];
    }
    arr[index] = x;
    size = size + 1;
 }
 public int del(int index)
 {
    if(size == length)
        throw new RuntimeException("Array is full ");
    if(index < 0 || index >=size)
        throw new RuntimeException("Invalid Index");
    int x = arr[
        index];
    for(int i = 0 ; i< size ; i++)
    { 
        arr[i-1] = arr[i];
    }
    size = size -1;
    return x;
 }
 public int indexOf(int x)
 {
   int index = -1;
    for(int i = 0; i<size ; i++)
    {
        if(arr[i] ==x)
            index = i;
            break;
    }
    return index;
 }
 public int get(int index)
 {
    if(index <0)
        throw new RuntimeException("Invalid Index");
    return arr[index];
 }
 public void display()
 {
  
    for(int i =0 ; i<size; i++)
    {
      System.out.print(arr[i] + "\t");
    }
 }

}
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the capacity of the arary");
    int n= sc.nextInt();
    Array a = insertSeries(n);
    a.display();
    sc.close();
    }
    static Array insertSeries(int n)
    {
        Array ar = new Array(n);
        for(int i =1; i<=n ; i++)
        {
            if(i%2==1)
            {
                ar.insert(i,i-1);
            }
            else
                ar.insert(i, (i/2)-1);
        }

     return ar;
    }
    
}
