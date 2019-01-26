
public class FtoCdegree {

	public static void main(String[] args) {
		   double f=10,c=24;
	        double result1=celsiusToFahrenheit(c);
	        double result2= fahrenheitToCelsius(f);
	        System.out.println("convert celsius"+result1);
	         System.out.println("convert fahrenheit"+result2);

	}
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }
    //this for second edit
    
    public static double  fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit-32)*9)/5.0;
    }
	

}
