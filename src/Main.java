import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
public class Main {

	public static void main(String[] args) {
		Options();

	}
	public static void Options(){
		Scanner scan= new Scanner (System.in);
		System.out.println("****Welcome to the Medication Field!!****");
		System.out.println("Options:");
		
		System.out.println("1.Current Medication");
		System.out.println("2.New Medication");
		System.out.println("3.Formulary Medication");
		int c;
		c=scan.nextInt();
	    Vector<String> drugs= new Vector<String>(6);
	    drugs.add("Paracetamol");
	    drugs.add("Tylenol");    //drugs name
	    drugs.add("Advil");
	    drugs.add("Motrin");
	    drugs.add("Naproxen");
	    drugs.add("Aspirin");
	    
	    
		if(c==1){
			getDose();
			
		}
		else if(c==2){
			Enumeration en= drugs.elements();
			System.out.println("Choose from the following medications:");
			int i=1;
			while(en.hasMoreElements()){
				System.out.println(i+" " + en.nextElement());
				i++;
			}
			String choose= new String();
			choose=scan.next();
			int k=0;
			while(!drugs.isEmpty()){
				if(choose.equals(drugs.get(k))){
					System.out.println("Drugs matched!");
					getDose();
					
					break;
					
				}
				k++;
			}
			
		}
		else{
			
		}
	}
	public static void getDose(){
		System.out.println("Want to check the dose?");
		System.out.println("Enter the dose:");
		Scanner scan= new Scanner(System.in);
		float n;
		n= scan.nextFloat();
		confirmPrescription();
	}
	public static void confirmPrescription()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Are you sure to save this as Prescription?(select from 1/2)");
		System.out.println("1.OK");
		System.out.println("2.Change");
		String ch= new String();
		ch= scan.next();
		if(ch.equals("1")){
			System.out.println("Changes saved!");
			
			
		}
		else{
			Options();
		}
	}

}
