import java.io.*;
class Count
{
	public static void main(String args[])throws IOException
	{
		int ch;
		boolean prev=true;
		int char_count=0,word_count=0,line_count=0;
		FileInputStream fin=new FileInputStream(args[0]);
		while((ch=fin.read())!=-1)
		{
			if(ch!=' ')++char_count;
			if(!prev&&ch==' ')++word_count;
			if(ch==' ')
				prev=true;
			else
				prev=false;
			if(ch=='\n')
				++line_count;
		}
		char_count=line_count*2;
		word_count+=line_count;
		System.out.println("no of chars="+char_count);
		System.out.println("No of words"+word_count);
		System.out.println("No of lines="+line_count);
		fin.close();
	}
}
/*
E:\Streams&Files>java Count Zip.java
no of chars=32
No of words31
No of lines=16

E:\Streams&Files>*/		
	
