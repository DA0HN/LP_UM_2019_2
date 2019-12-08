package io.aula_27112019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IO {

	private static final String path = "./src/io/aula_27112019/arquivo.txt";
	
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream(path);
			OutputStreamWriter writer = new OutputStreamWriter(out);
			BufferedWriter writerBuffer = new BufferedWriter(writer);
			writerBuffer.write("dale dele\n");
			writerBuffer.write("dale dele\n");
			writerBuffer.write("dale dele\n");
			writerBuffer.write("dale dele\n");
//			writerBuffer.newLine();
			writerBuffer.close();
			
			InputStream stream = new FileInputStream(path); // byte
			InputStreamReader reader = new InputStreamReader(stream); // char
			BufferedReader buffer = new BufferedReader(reader); // string
			
			while( buffer.ready() ) {
				String str = buffer.readLine();
				System.out.println(str);
			}
			
			buffer.close(); // fechar apenas o utlimo que resulta em fechamento em cadeia
//			stream.close();
//			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		}
	}
	
}
