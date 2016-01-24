/**
 * 
 */
package AirTrafficControlSystem;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Bhatia
 *
 */
public class RequestManager {

	PriorityQueue<Aircraft> acQueue = new PriorityQueue<Aircraft>(); 
	
	public void aqm_request_process(){
		System.out.println("Starting system");
		startRM();
	}
	
	public void startRM(){
		char c;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		do{
		System.out.println("Add - 1 or Remove - 2 ?");
		
		char choice = sc.next().charAt(0);
		
		if(choice=='1'){
			System.out.println("Enter \"type\" of aircraft (P-Passenger, C-Cargo, Other types also accepted):");
			Character t = sc.next().charAt(0);
			System.out.println("Enter \"size\" of aircraft (L-Large, S-Small, Other sizes also accepted):");
			Character s = sc.next().charAt(0);
			count+=1;
			Aircraft ac = new Aircraft(t.toString(), s.toString(), count);
		    add(ac);
		}
		else if(choice=='2'){
			remove();
		}
		else {
			System.out.println("Wrong choice");
		}
		System.out.println("Want to continue? Y-yes, N-no");
		c = sc.next().charAt(0);
		
		} while(c=='Y' || c=='y');
		sc.close();
		System.out.println("Successfully exited system...");
	}

	public void add(Aircraft ac){
		acQueue.add(ac);
		System.out.println("State of acQueue: "+acQueue);
		System.out.println("# aircrafts in queue : "+acQueue.size());
	}
	
    public void remove(){
    	if(!acQueue.isEmpty()){
    		System.out.println("Dequeued => "+acQueue.remove());
    		System.out.println("# aircrafts in queue : "+acQueue.size());
    	}
    	else
    		System.out.println("Queue is empty! Nothing to remove.");
	}
	
	
}
