package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivo {
	
	public void escrever(String tipo, boolean append) {
		
		try {
			FileWriter fw = new FileWriter("index.html", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(tipo + "\r\n");
			
			bw.close();
			fw.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public ArrayList<String> ler (String index) {
		ArrayList<String> data = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(index + ".html");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				data.add(linha);
			}
			
			br.close();
			fr.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return data;
	}
	
}