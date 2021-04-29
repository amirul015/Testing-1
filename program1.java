package com.testyantra.assign;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Mainclass2 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{

			BufferedReader reader = new BufferedReader(new FileReader("//E://Demo//file_diff.txt"));
			String line = reader.readLine();
			while(line!=null)
			{
				System.out.println(line);
				String str=line;

				if(str.charAt(0)=='M'||str.charAt(0)=='A')
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
