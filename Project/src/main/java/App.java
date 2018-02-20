import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
public static void main(String[] args) {
	   String sampleString = "Cat.Dog.Elephant";
	   String[] animals = sampleString.split(".");
	  
	   for (String animal : animals) {
	      System.out.println(animal);
	   }
	}

}
