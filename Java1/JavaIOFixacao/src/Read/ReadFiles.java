package Read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ReadFiles {
	public static void main(String[] args) throws IOException {
		/*
		FileInputStream fis = new FileInputStream("lorem2.txt");
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader buffRead = new BufferedReader(reader);
		String linha = buffRead.readLine();
		System.out.println(linha);
		buffRead.close();
		*/
		
		
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer ww = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ww);
		
		bw.write("Teste de Escrita Sobreposta1");
		bw.newLine();bw.newLine();
		bw.write("Nova Linha no meio");
		bw.newLine();
		bw.write("Segunda Linha Escrita ");
		bw.close();
		
		FileInputStream fis = new FileInputStream("lorem2.txt");
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader buffRead = new BufferedReader(reader);
		String linha = buffRead.readLine();
		
		for (String linhas : linha) {
			System.out.println(linha);
		}
		
		
		for(int i = 0 ; i <= linha.length() ; i ++) {
			System.out.println(linha);
			System.out.println(i);
		}
		
		
		System.out.println(linha);
		
		buffRead.close();
		
		
	}
}
