package org.tnsif.capgemini.c2tc.scannerclass_bufferreader;
	import java.io.BufferedReader;
	import java.io.FileReader;
	public class BufferedReader1 {

		public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java training Notes\\demo.txt"));
			String data="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			br.close();
		}

	}