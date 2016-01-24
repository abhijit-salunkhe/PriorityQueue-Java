/**
 * 
 */
package AirTrafficControlSystem;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Bhatia
 *
 */
public class Aircraft implements Comparable<Aircraft> {

	/**
	 * 
	 */
	private int priority;
	private String type;
	private String size;
	private int id;
	public static final Map<String,Integer> requestMap;
    static{
        Hashtable<String,Integer> req = new Hashtable<String,Integer>();
        req.put("PL", 1);
        req.put("PS", 2);
        req.put("CL", 3);
        req.put("CS", 4);
        //req.put("other", 5);
        requestMap = Collections.unmodifiableMap(req);
    }
	public Aircraft(String type, String size, int id) {
		super();
		this.type = type;
		this.size = size;
		this.id = id;
		this.setPriority(type, size);
	}

	public int getPriority() {
		return priority;
	}
	public void setPriority(String t, String s) {
		String key = t.concat(s).toUpperCase();
		if(requestMap.keySet().contains(key)){
			this.priority = requestMap.get(key);
			System.out.println("priority = "+this.priority);
			System.out.println("key = "+key);
		}
		else
			this.priority = 5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String toString(){
		//String acMake = this.type.concat(this.size);
		//System.out.println("The make of Aircraft is - "+acMake);
		return "{ Priority: "+getPriority()+" Type: "+getType()+" Size: "+getSize()+" ID: "+getId()+" }";
	}

	public boolean equals(Aircraft ac) {
		return this.getPriority() == ac.getPriority();
	}
	public int compareTo(Aircraft ac) {
		// TODO Auto-generated method stub
		if(this.equals(ac)){
			return 0;
		}
		else if (getPriority()>ac.getPriority()){
			return 1;
		}
		else
			return -1;
	}
	

}
