package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Loggers {

	private static File output = new File("log.txt");
	
	public synchronized static void WriteLog(Object in){
		try {
			FileWriter fl = new FileWriter(output,true);
			PrintWriter pw = new PrintWriter(fl);
			pw.println(in);
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
