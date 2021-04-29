package com.testyantra.assign;

import java.io.*;
import java.util.*;

import org.json.*;



public class Mainclass 
{
	public static void main(String[] args) throws IOException 
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		int arr[] = new int[6];
		
        System.out.println("Enter 6 the elements:");
        for(int i = 0 ; i<6 ; i++)
        {
             arr[i] = scan.nextInt();
        }
        
       while(true==true) 
       {
       System.out.println("Enter Your Choice");
       System.out.println("1. Perform subtraction");
       System.out.println("2. Perform multiplication"); 
       System.out.println("3. Pick random number");	 
       System.out.println("4. Print in decreasing order");	 
       System.out.println("5. Print in increasing order");
       System.out.println("Other Numbers to exit");
       
       int option = scan.nextInt();
       switch(option)
       {
           case 1 : System.out.println("Enter a number from which you want to subtract");
           			int sub=scan.nextInt();
           			
           			for(int i=0;i<6;i++)
           			{
           				System.out.print(sub-arr[i]+", ");
           			}
           			System.out.println();
           			break;
           			
           case 2 :	JSONObject sampleObject = new JSONObject();
        	   		for(int i=0;i<6;i++)
        	   		{
        	   			sampleObject.put("Inputnumber"+i,arr[i]);
        	   		}
        	   		int  mul=1;
        	   		for(int i=0;i<6;i++)
        	   		{
        	   			mul=mul*arr[i];
        	   		}
        	   		sampleObject.put("Multiplication",mul);
        	   		
        	   		try
        	   		{
        	   			FileWriter file=new FileWriter("//E://Demo//file2.json");
        	   			file.write(sampleObject.toString());
        	   			file.flush();
        	   			file.close();
        	   		}
        	   		
        	   		catch(IOException e)
        	   		{
        	   			e.printStackTrace();
        	   		}
        	   		
        	   		System.out.println(sampleObject);
            		break;
            		
           case 3 : 
           			System.out.println("Random number : " +arr[new Random().nextInt(arr.length)]);
           			break;
           			
        	   		
           case 4 : System.out.println("Numbers in highest to lowest order");
           			for (int i=0; i<arr.length; i++)   
           			{  
           				for (int j=i+1; j<arr.length; j++)   
           				{  
           					int tmp = 0;  
           					if (arr[i]<arr[j])   
           					{  
           						tmp=arr[i];  
           						arr[i]=arr[j];  
           						arr[j]=tmp;  
           					}  
           				}  
           				System.out.println(arr[i]);  
           			}
           			break;
        	   
           case 5 : System.out.println("Numbers in lowest to highest order");
           			
           			Arrays.sort(arr);
           			for (int i = 0; i < arr.length; i++)   
           			{       
           				System.out.println(arr[i]);   
           			}
        	   		break;
           
           default : System.exit(0);
           			break;
           
        }
       }
        
        
		
		
	}

}
