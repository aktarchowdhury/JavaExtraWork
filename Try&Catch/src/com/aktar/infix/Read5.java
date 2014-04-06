package com.aktar.infix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read5 {

	public static void main(String[] args) {
		try {

			File file = new File("new2.txt");
			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);
			String s1=null;
			while (
					(s1=br.readLine())!=null){
		            System.out.println(s1);	
			}
		} catch (IOException ie) {

		}
	}

}
