package com.testyantra.assign;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Demo1 
{
	public static void main(String[] args) throws IOException 
	{
		/*
		String path= "//E://Demo//file_diff.txt";
		
		
		File f=new File(path);
		
		FileReader fr=new FileReader(f);
		
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		String data="";
		
		
		long len=f.length();
		
		for(int i=1;i<=len;i++)
		{
			int i1=fr.read();
			char c1=(char)i1;
			sb1=sb1.append(c1);
		}
		
		data=sb1.toString();
		
		if(data.charAt(0)=='M' || data.charAt(0)=='A')
		{
			for(int i=data.length()-1;i>=0 && data.charAt(i)!='/';i--)
			{
				char ch=data.charAt(i);
				sb2=sb2.append(ch);
			}
		}
		sb2.reverse();
		System.out.println(sb2);
		fr.close();
		*/
		/*
		try  
		{  
			//the file to be opened for reading  
			FileInputStream fis=new FileInputStream("//E://Demo//file_diff.txt");       
			Scanner sc=new Scanner(fis);   //file to be scanned  
			//returns true if there is another line to read  
			while(sc.hasNextLine())  
			{  
				
				System.out.println(sc.nextLine());
				//returns the line that was skipped  
				
			}  
			sc.close();     //closes the scanner  
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
		*/
	/*	FileInputStream fstream = new FileInputStream("//E://Demo//file_diff.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)  
		{
		  // Print the content on the console
		 System.out.println (strLine);
		
		}

		//Close the input stream
		fstream.close();
		*/
		
		try
		{
			
			BufferedReader reader = new BufferedReader(new FileReader("//E://Demo//file_diff.txt"));
			String line = reader.readLine();
			while(line!=null)
			{
				System.out.println(line);
				String str=line;
				
				if(str.charAt(0)=='M'||		str.charAt(0)=='A')
				{
					
					StringBuffer sb2=new StringBuffer();
					for(int i=str.length()-1;i>=0 && str.charAt(i)!='/';i--)
					{
						char ch=str.charAt(i);
						sb2.append(ch);
					}
					sb2.reverse();
					String ss=str.charAt(0)+"  "+sb2.toString()+"  ";
					
					File f=new File("//E://Demo//deployPackage//added.txt");
					FileWriter fw=new FileWriter(f,true);  //to write a data  acts as connection between file and java code
					
					fw.write(ss);    //data will be stored to temporary data Fileoutputstream.
					
					fw.flush();        //from Fileoutputstream it will flush data to file.
					fw.close();
					
					
					//System.out.println(sb2); 					
				}
				else if(str.charAt(0)=='R'||str.charAt(0)=='D') 
				{
					StringBuffer sb2=new StringBuffer();
					for(int i=str.length()-1;i>=0 && str.charAt(i)!='/';i--)
					{
						char ch=str.charAt(i);
						sb2.append(ch);
					}
					sb2.reverse();
					String ss=str.charAt(0)+"  "+sb2.toString()+"  ";
					
					File f=new File("//E://Demo//deployPackage//removed.txt");
					FileWriter fw=new FileWriter(f,true);  //to write a data  acts as connection between file and java code
					
					fw.write(ss);    //data will be stored to temporary data Fileoutputstream.
					
					fw.flush();        //from Fileoutputstream it will flush data to file.
					fw.close();
					//System.out.println(sb2);
				}
				
				line = reader.readLine();
				
			}
			reader.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

}
