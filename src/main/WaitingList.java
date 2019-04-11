package main;
import java.util.ArrayList;
import java.util.Scanner;

public class WaitingList {

	private ArrayList<User> VIP = new ArrayList<User>();
	private ArrayList<User> member = new ArrayList<User>();
	private ArrayList<User> normal = new ArrayList<User>();
	
	public void addWaiting(User user) {
		if(user.getMemberType().equals("vip"))
			VIP.add(user);
		else if(user.getMemberType().equals("member"))
			member.add(user);
		else
			normal.add(user);
	} 
	
	public ArrayList<User> getWaiting(String member_type) {
		if(member_type.equals("vip"))
			return VIP;
		else if(member_type.equals("member"))
			return member;
		else
			return normal;
	}
	
	public void removeWaiting(User user) {
		boolean found;
		if(user.getMemberType().equals("vip"))
			found = VIP.remove(user);
		else if(user.getMemberType().equals("member"))
			found = member.remove(user);
		else
			found = normal.remove(user);
		if(!found)
			throw new IllegalArgumentException("User not found.");
	} 
	
	
}
