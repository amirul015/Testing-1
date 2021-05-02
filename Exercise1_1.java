package com.TY.Test1;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
// Completed and good "ಮರಳಿ ಯತ್ನವ ಮಾಡು"
//In this program files are also copied
public class Exercise1_1
{
		 public static void main(String[] args) throws IOException 
		 {
			 System.out.println("Program Starts.........");
		    try 
		    {
		    	String desti = "E:/Test_Yantra/Test/file_diff.txt";// This is a path for reading file
		      File myObj = new File(desti);
		      Scanner myReader = new Scanner(myObj);
		      
		      // Checking each and every file
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        
		        
		        
		        // M & A checking
		        int filenoa =0;
		        String destif = "E:/Test_Yantra/Test1/";// Source folder for copying files
		        String destiaf ="E://Test_Yantra/deployPackage/added.txt";//added.txt file path
		        String destia ="E://Test_Yantra/deployPackage/added/";//added folder path which is present inside deploy package
		        String destirf ="E://Test_Yantra/deployPackage/removed.txt";//removed.txt file path
		        String destir ="E://Test_Yantra/deployPackage/removed/";// removed folder path which is present inside deploy package
		        if(data.charAt(0)=='M' || data.charAt(0)== 'A')// adding logic
		        {
		        	      if(filenoa ==0)
		        	      {
		        	    	  File nf1 = new File(destiaf);//file is being created
		        	    	  nf1.createNewFile();
		        	    	  filenoa++;
		        	      }
		        	      
		        	       if(filenoa ==1 && (data.charAt(0)=='M' || data.charAt(0)== 'A'))
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
					        	      FileWriter nf1 = new FileWriter(destiaf, true);//file is being written
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
		        	    	  
		        	    	  FileInputStream instream = null;
		        	    		FileOutputStream outstream = null;
		        	    	 
		        	    	    	try{		        	    	    		
		        	    	    	    File infile =new File(destif+rev1);
		        	    	    	    File outfile =new File(destia+rev1);
		        	    	 
		        	    	    	    instream = new FileInputStream(infile);
		        	    	    	    outstream = new FileOutputStream(outfile);
		        	    	 
		        	    	    	    byte[] buffer = new byte[1024];
		        	    	 
		        	    	    	    int length;
		        	    	    	    while ((length = instream.read(buffer)) > 0){
		        	    	    	    	outstream.write(buffer, 0, length);
		        	    	    	    }

		        	    	    	    //Closing the input/output file streams
		        	    	    	    instream.close();
		        	    	    	    outstream.close();

		        	    	    	    //System.out.println("File copied successfully!!");
		        	    	 
		        	    	    	}catch(IOException ioe){
		        	    	    		ioe.printStackTrace();
		        	    	    	 }
		        	       }  
		        	}
		        	 
		     // R & D checking
		        int filenob =0;
		        if(data.charAt(0)=='R' || data.charAt(0)== 'D')// adding logic
		        {
		        	      if(filenob ==0)
		        	      {
		        	    	  File nf1 = new File(destirf);//file is being created
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
					        	      FileWriter nf1 = new FileWriter(destirf, true);//file is being written
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
		        	    	  
		        	    	  FileInputStream instream = null;
		        	    		FileOutputStream outstream = null;
		        	    	 
		        	    	    	try{
		        	    	    	    File infile =new File(destif+rev1);
		        	    	    	    File outfile =new File(destir+rev1);
		        	    	 
		        	    	    	    instream = new FileInputStream(infile);
		        	    	    	    outstream = new FileOutputStream(outfile);
		        	    	 
		        	    	    	    byte[] buffer = new byte[1024];
		        	    	 
		        	    	    	    int length;
		        	    	    	    /*copying the contents from input stream to
		        	    	    	     * output stream using read and write methods
		        	    	    	     */
		        	    	    	    while ((length = instream.read(buffer)) > 0){
		        	    	    	    	outstream.write(buffer, 0, length);
		        	    	    	    }

		        	    	    	    //Closing the input/output file streams
		        	    	    	    instream.close();
		        	    	    	    outstream.close();

		        	    	    	    //System.out.println("File copied successfully!!");
		        	    	 
		        	    	    	}catch(IOException ioe){
		        	    	    		ioe.printStackTrace();
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


