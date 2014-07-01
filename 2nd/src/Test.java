import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;
import java.*;


public class Test {

	static ArrayList <Integer> a = new ArrayList <Integer>();
	
	
	public static void main(String[] args) throws IOException {
		File f=new File("file_name");
		File g=new File("out_name");
		
		FileReader fr;
		fr = new FileReader(f);
		
		FileWriter fw;
		fw= new FileWriter(g);
		
	
		BufferedReader br= new BufferedReader(fr);
		BufferedWriter bw= new BufferedWriter(fw);
		
		try{
			
			String line=br.readLine();
			while(line!=null&&line.length()!=0){
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line=br.readLine();
			}
		} catch(IOException e){
			System.out.println("exceptie");
		}
		
		bw.close();
		
		Iterator <Integer> it;
		
		Random r = new Random();
		for (int i=0; i<5;i++){
			int x=r.nextInt(100);
			a.add(x);
		}
		it = a.iterator();
		while(it.hasNext()){
			Integer item=it.next();
			System.out.println(item);
		}
		

	}

}
