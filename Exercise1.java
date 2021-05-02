package com.TY.Test1;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// In this program files wont be copied to folders "à²®à²°à²³à²¿ à²¯à²¤à³�à²¨à²µ à²®à²¾à²¡à³�"
public class Exercise1
{
		 public static void main(String[] args) throws IOException 
		 {
			 System.out.println("Program Starts.........");
		    try 
		    {
		      File myObj = new File("E:/Test_Yantra/Test/file_diff.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      // Checking each and every file
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        
		        
		        
		        // M & A checking
		        int filenoa =0;
		        if(data.charAt(0)=='M' || data.charAt(0)== 'A')// adding logic
		        {
		        	      if(filenoa ==0)
		        	      {
		        	    	  File nf1 = new File("E://Test_Yantra/deployPackage/added.txt");//file is being created
		        	    	  nf1.createNewFile();
		        	    	  filenoa++;
		        	      }
		        	      
		        	       if(filenoa ==1 && (data.charAt(0)=='M' || data.charAt(0)== 'A'))
		        	      {
		        	    	   
		        	    	   // -------> starts 1
			        	    	  char ch[]=data.toCharArray();  
									    String rev="";  
									    for(int i=ch.length-1; data.charAt(i) != '/';i--){  
									        rev+=ch[i];  
									        
									    }  
									    String rev1="";  
									    for(int j=rev.length()-1; j>=0; j--)
									    {
									    	rev1=rev1+rev.charAt(j);
									    }  
			        	    	   //<-----------
			        	    	 
		        	      
		        	    	  try 
					        	{
					        	      FileWriter nf1 = new FileWriter("E:/Test_Yantra/deployPackage/added.txt", true);//file is being written
					        	    BufferedWriter bw = new BufferedWriter(nf1);
					        	        bw.write(rev1+"    ");
					        	        bw.newLine();
					        	        bw.close();
					        	 } 
					        	catch (IOException e) 
					        	 {
					        	      System.out.println("An error occurred.");
					        	      e.printStackTrace();
					        	 }
		        	       }  
		        	}
		        	 
		        int filenob =0;
		        if(data.charAt(0)=='R' || data.charAt(0)== 'D')// adding logic
		        {
		        	      if(filenob ==0)
		        	      {
		        	    	  File nf1 = new File("E://Test_Yantra/deployPackage/removed.txt");//file is being created
		        	    	  nf1.createNewFile();
		        	    	  filenob++;
		        	      }
		        	      
		        	       if(filenob ==1 && (data.charAt(0)=='R' || data.charAt(0)== 'D'))
		        	      {
		        	    	   
		        	    
			        	    	  char ch[]=data.toCharArray();  
									    String rev="";  
									    for(int i=ch.length-1; data.charAt(i) != '/';i--){  
									        rev+=ch[i];  
									        
									    }  
									    String rev1="";  
									    for(int j=rev.length()-1; j>=0; j--)
									    {
									    	rev1=rev1+rev.charAt(j);
									    }  
		        	      
		        	    	  try 
					        	{
					        	      FileWriter nf1 = new FileWriter("E:/Test_Yantra/deployPackage/removed.txt", true);//file is being written
					        	    BufferedWriter bw = new BufferedWriter(nf1);
					        	        bw.write(rev1+"    ");
					        	        bw.newLine();
					        	        bw.close();
					        	 } 
					        	catch (IOException e) 
					        	 {
					        	      System.out.println("An error occurred.");
					        	      e.printStackTrace();
					        	 }
		        	       }  
		        	}
		        
		         }//while close
		         
		      		myReader.close();
		    } //try close
		    
		    catch (FileNotFoundException e) 
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    System.out.println("Program Ends.........");
		  } // main close
	} // class close


