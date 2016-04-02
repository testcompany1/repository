//uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //
         // Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         ArrayList<String> list = new ArrayList<String>(100);
        int N = Integer.parseInt( br.readLine());
        if(N>=1 && N<=100){
        for (int i = 0; i < N; i++) {
        	String line = br.readLine();
        	if(line.length()<100)
        	{
        		list.add(line.toLowerCase());
        	}else{
        		System.out.println("invalid String, Max string length is 100");
        	}
        	}
        	
        	for(String str :list){
        		System.out.println(str.length());
        		
        	}
            //System.out.println("hello world");
        } else{
        	System.out.println("INTEGER RAGE MUST BE WITHIN 100");
        }
        }
       
    }