
/**
 * this class convert the value of tempreture  by using two methods 
 */
public class FtoCdegree {

	public static void main(String[] args) {
		
		   double f=10,c=24;
	        double result1=celsiusToFahrenheit(c);
	        double result2= fahrenheitToCelsius(f);
	        System.out.println("convert celsius"+result1);
	         System.out.println("convert fahrenheit"+result2);

	}
	//documentation 
	/**
    	 * Method to convert the degree from celsius to fahrenheit 
    	 * @param celsius old value of degree
    	 * @return the new value
    	 */
    public static double celsiusToFahrenheit(double celsius){
    	
        return (9.0/5)*celsius+32;
    }
  
    	/**
    	 * Method to convert the degree from fahrenheit 
    	 * @param fahrenheit old value of degree 
    	 * @return the new value
    	 */
    public static double  fahrenheitToCelsius(double fahrenheit){
    
        return ((fahrenheit-32)*9)/5.0;
    }
	

}
