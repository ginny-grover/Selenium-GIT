package Day3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

//This will append in the testlog when file is not correct, when correct then no logs will be mentioned

public class LoggingSample {
	private static Logger logger=Logger.getLogger("LoggingExample");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("abc");
		BasicConfigurator.configure();
		try
	{
	//FileInputStream fstream =new FileInputStream("C:\\Users\\ginny.grover\\Desktop\\NewPage.html"); //Right file
	FileInputStream fstream =new FileInputStream("C:\\Users\\\\Desktop\\NewPage.html");    //Wrong file
	DataInputStream in =new DataInputStream(fstream);
	BufferedReader br =new BufferedReader(new InputStreamReader(in)); 
	String strLine;
	while ((strLine = br.readLine()) != null)
	{System.out.println (strLine);

	}
	in.close();
	}catch (FileNotFoundException fe)
	{logger.error("File Not Found",fe);
	logger.warn("This is a warning message");
	logger.trace("This message will not be logged since log level is set as DEBUG");
	}
		catch (IOException e)
	{logger.error("IOEXception occured:", e);
	}
	}

	}

