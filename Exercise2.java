package com.TY.Test1;

//Completed and good "ಮರಳಿ ಯತ್ನವ ಮಾಡು"
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONException;

public class Exercise2 
{
	public static void main(String[] args) throws IOException, JSONException
	{
		System.out.println("Program Starts--------->");
		System.out.println("Enter 6 numbers below one after the other and press Enter");
		Scanner ip = new Scanner(System.in);
		int[]a=new int[6];
		for(int i=0; i<6; i++)
		{
			System.out.println("Enter a number: ");
			a[i]= ip.nextInt();
		}
		
		System.out.println("Enter your choices from the below to proceed further");
	      
			System.out.println(1+". Performs subtraction");
			System.out.println(2+". Performs multiplication");
			System.out.println(3+". shows random number");
			System.out.println(4+". Descending order sorting");
            System.out.println(5+". Ascending order sorting");
            System.out.println(6+". Enter other numbers if you want to exit");
             
       
             int choice = ip.nextInt();
         
             switch(choice) 
             {
                 case 1 :
                 {
                	 System.out.println("Welcome to subtraction, Please enter a number from which you need to perform Subtraction");
                	 int subno = ip.nextInt();
                	 ip.close();
                	 for(int i=0; i<6; i++)
                	 {
                		 System.out.print(subno-a[i]+", ");
                	 }
                	 break; 
                 }
                
                 case 2 : 
                 {
             		// creating JSONObject
             		JSONObject jo = new JSONObject();
             		
             		 for (int i = 1; i <a.length+1; i++) 
             	        { jo.put("InputNumber"+i, a[i-1]);}
             		 
             		int pro = 1;
                     for (int i = 0; i <a.length; i++) 
                     { pro = pro * a[i];}

             		jo.put("Multiplication", pro);
             		
             		String desti = "E:/output2.json";
             		FileWriter file = new FileWriter(desti);
            		file.write(jo.toString());
            		file.close();
            		
            		// writing JSON to file
            		PrintWriter pw = new PrintWriter(file);
            		pw.write(jo.toString());
            		
            		pw.flush();
            		pw.close();
            		System.out.println("Multiplication result is: "+pro);
            		System.out.println("The JSON file also generated with inputs and results, check file at "+desti);
            		break;
                 }
         
                 case 3:
                 {
                	 int rnd = new Random().nextInt(a.length);
                	 System.out.println( a[rnd]);
                	 break;
                 }
                         
                 case 4:
                 {
                	 int[] a1 = Arrays.stream(a).boxed()
                			    .sorted(Collections.reverseOrder())
                			    .mapToInt(Integer::intValue)
                			    .toArray();

                			System.out.println(Arrays.toString(a1));
                			break;
                 }
                 
                 case 5:
                 {
                    Arrays.sort(a);
                	 System.out.printf("Modified arr[] : %s", Arrays.toString(a));
                	 break;
                 }
                 default:
                	 {
                		 System.out.println("Program exited, Thank you see you again.........");
                	 }
             } 
	
             System.out.println();
		System.out.println("Program Ends<---------");
		System.exit(0);
	}
}

