import java.util.Arrays;
public class efficiency {    
	
	public static void main(String[] args)
{
	//Using given resistance and voltage values of turbine and initilializing them
	//into arrays
    double[] resistance = {1.8, 2, 2.4, 2.7, 3.6, 5.6, 8.2, 10, 12, 15, 18, 24}; 
    double[] voltage = {0.1004, 0.0995, 0.1008, 0.0914, 0.1447, 0.1009, 0.1457,
    		0.0983, 0.1782, 0.13527, 0.1029, 0.0986};
    
    int length = resistance.length < voltage.length ? resistance.length : 
    	voltage.length;  
    int[] result = new int[length]; //index location for respective arrays: element by element
    
	//Converts double values to int
    double[] efficiency = Arrays.stream(result).asDoubleStream().toArray();
    double[] power = Arrays.stream(result).asDoubleStream().toArray(); 
    
	//iterate through each element in arrays and applying the calculations for 
	//efficiency and power
    for (int i = 0; i < length; i++) { 
    	double area = 0.0311; //Given swept area
        double density = 1.225; //Given density
        double velocity = 3.8; //Given velocity
    	efficiency[i] = (100*voltage[i]*voltage[i])/(resistance[i]) / (0.5*density*area*velocity*velocity*velocity);
    	power[i] = 0.5*density*velocity*velocity*velocity*area*efficiency[i];
	    //prints data in organized column
    	System.out.println("Efficiency (%)" + efficiency[i] + "\t" + " Power (W) " + power[i]);
    	//System.out.println("Power: " + power[i] + "W");
    	} 
    }
}
