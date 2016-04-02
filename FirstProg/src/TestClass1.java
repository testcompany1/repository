import java.awt.RadialGradientPaint;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

import javax.crypto.Mac;
class TestClass1 {
	 
    
   public static void main(String args[] ) throws Exception {
        
        //  Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ;
        System.out.println("Enter radius: ");
        double radius=Double.parseDouble(br.readLine());   
            System.out.println("Enter height: ");
            double height=Double.parseDouble(br.readLine());   
//        int N = Integer.parseInt(line);
//        for (int i = 0; i < N; i++) {
//            System.out.println("Enter radius");
//            br.readLine();
//        }
        
        Cylinder cyl = new Cylinder();
        TruncatedCone truncCone = new TruncatedCone();
        
       double cylider = cyl.GetVolume(height, radius);
        double truncatedVol = truncCone.GetVolume(height, radius);
        
        System.out.println(cylider +" "+truncatedVol);
        

        
    }
}


class Cylinder
{
	public double GetVolume(double height,double radius)
	{
		return (22/7)*(radius*radius)*height;
	}
}

class TruncatedCone {
	public double GetVolume(double slantedHeight,double radius)
	{
		double height=0;
		double volume=0;
		height=Math.sqrt((slantedHeight*slantedHeight)+radius*radius);
		
		volume=(1/3)*(3.143)*height;
		return volume;
	}
}
