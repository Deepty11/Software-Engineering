import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
public class Main {

	public static void main(String[] args) {
		Options();    //function to show userinterface

	}
        
	public static void Options(){ //options function implemented
		String name,record;//patient's record
		int age;
		
		Scanner scan= new Scanner (System.in);
		System.out.println("****Welcome to the Medication Field!!****");
		System.out.println("Please enter the detail of patient:");
		System.out.println("Enter Patient's Name:");
		name=scan.nextString();
		System.out.println("Enter Patient's Age:");
		age=scan.nextInt();
		
		System.out.println("Options:");
		
		System.out.println("1.Current Medication");
		System.out.println("2.New Medication");
		System.out.println("3.Formulary Medication");
		int c;
		c=scan.nextInt();       //Takes choice input
	    Vector<String> drugs= new Vector<String>(6);
	    System.out.println("Add drugs name : ")
	    drugs.add("Paracetamol");
	    drugs.add("Tylenol");    //drugs name
	    drugs.add("Advil");
	    drugs.add("Motrin");
	    drugs.add("Naproxen");
	    drugs.add("Aspirin");
	    
	    
		if(c==1){
			getDose();   // if chooses first one, then calls getDose() function
			
		}
		else if(c==2){
			Enumeration en= drugs.elements();
			System.out.println("Choose from the following medications:");//search the drugs
			int i=1;
			while(en.hasMoreElements()){
				System.out.println(i+" " + en.nextElement());
				i++;
			}
			String choose= new String();
			choose=scan.next();
			int k=0;
			while(!drugs.isEmpty()){//drugs comparability
				if(choose.equals(drugs.get(k))){
					System.out.println("Drugs matched!");
					getDose();
					
					break;
					
				}
				
				k++;
			}//if not matched
			
		}
		else{
			
			formulary();//if drug is not matched call formulary function
		}
	}
	public static void getDose(){    // getDose() function implemented
		System.out.println("Want to check the dose?");
		System.out.println("Enter the dose:");//to check the dose first enter a dose
		Scanner scan= new Scanner(System.in);
		float n;
		n= scan.nextFloat();
		confirmPrescription();
	}
	public static void confirmPrescription()   // confirmPrescription() function implemented
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Are you sure to save this as Prescription?(select from 1/2)");
		System.out.println("1.OK");
		System.out.println("2.Change");
		String ch= new String();
		ch= scan.next();
		if(ch.equals("1")){ //if prescription is confirmed then ok 
			System.out.println("Changes saved!");
			
			
		}
		else{//if not ok then go to options() function
			system.out.println("Prescription is not correct !");
			System.out.println("We need to add medicine ");
			formulary();
			Options();
		}
	}
	
	
	public static void formulary()   //formulary() function implemented
	{
		getDose();
		String newMedi;
		Scanner scan= new Scanner (System.in);
		//newMed=scan.next();
		addElement(newMed);
		
		System.out.println("New medicine:");
		newMed=scan.next();//add medicine
		
		
		
	}

}
