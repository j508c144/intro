package basic1jazzyy;

public class weekdayvacation {


public static void main(String[] args) {
System.out.println(checkifSleepIn(true,false));
}
    
	static boolean checkifSleepIn ( boolean weekday, boolean vacation) { 

	if(! weekday || vacation ) 
	{
	 return true;}
else
	return false;
}}