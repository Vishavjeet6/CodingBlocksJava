import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

 public static void main(String[] args)
 {
  //code to read values 
  //code to call required method
  //code to display the result
	 Scanner sc = new Scanner(System.in);
	 AutonomousCar[] ac = new AutonomousCar[4];
	 for(int i=0; i<4; i++) {
		 int cardId = sc.nextInt();
		 sc.nextLine();
		 String brand = sc.nextLine();
		 int noOfTestsConducted = sc.nextInt();
		 int noOfTestsPasses = sc.nextInt();
		 sc.nextLine();
		 String ennvironment = sc.nextLine();
		 ac[i] = new AutonomousCar(cardId,brand,noOfTestsConducted,noOfTestsPasses,ennvironment);
	 }
	 String en = sc.nextLine();
	 String br = sc.nextLine();
	 
	 int tp = findTestPassedByEnv(ac, en);
	 if(tp>0) {
		 System.out.println(tp);
	 }else {
		 System.out.println("There are no tests passed in this particular environment");
	 }
	 
	 AutonomousCar r = updateCarGrade(ac, br);
	 if(r != null) {
		 System.out.println(r.getBrand()+"::"+r.getGrade());
	 }else {
		 System.out.println("No Car is available with the specified brand");
	 }
	 
	 
	 
 }

 public static int findTestPassedByEnv(AutonomousCar[] acArray, String env) 
  {
   //method logic
	 int tp = 0;
	 for(int i=0; i<acArray.length; i++) {
		 if(acArray[i].getEnnvironment().equalsIgnoreCase(env)) {
			 tp += acArray[i].getNoOfTestsPasses();
		 }
	 }
	 return tp;
  }

public static AutonomousCar updateCarGrade(AutonomousCar[] acArray, String brand) 
  {
   //method logic
	AutonomousCar ans = null;
	for(int i=0; i<acArray.length; i++) {
		if(acArray[i].getBrand().equalsIgnoreCase(brand)){
			int r = ((acArray[i].getNoOfTestsPasses()*100)/acArray[i].getNoOfTestsConducted());
			ans = acArray[i];
			if(r >= 80) {
				ans.setGrade("A1");
			}else {
				ans.setGrade("B2");
			}
		}
	}
	return ans;
  }
}

class AutonomousCar 
{
  //code to build the class
	int cardId;
	String brand;
	int noOfTestsConducted;
	int noOfTestsPasses;
	String ennvironment;
	String grade;
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoOfTestsConducted() {
		return noOfTestsConducted;
	}
	public void setNoOfTestsConducted(int noOfTestsConducted) {
		this.noOfTestsConducted = noOfTestsConducted;
	}
	public int getNoOfTestsPasses() {
		return noOfTestsPasses;
	}
	public void setNoOfTestsPasses(int noOfTestsPasses) {
		this.noOfTestsPasses = noOfTestsPasses;
	}
	public String getEnnvironment() {
		return ennvironment;
	}
	public void setEnnvironment(String ennvironment) {
		this.ennvironment = ennvironment;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public AutonomousCar(int cardId, String brand, int noOfTestsConducted, int noOfTestsPasses, String ennvironment) {
		super();
		this.cardId = cardId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPasses = noOfTestsPasses;
		this.ennvironment = ennvironment;
	}
	
	
  
}