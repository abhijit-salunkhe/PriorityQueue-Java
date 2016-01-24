/**
 * 
 */
package AirTrafficControlSystem;

/**
 * @author Bhatia
 *
 */
public class ATCMain {

	public ATCMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ATC Subsystem - Request Manager begins...");
		RequestManager rm = new RequestManager();
		rm.aqm_request_process();
	}

}
