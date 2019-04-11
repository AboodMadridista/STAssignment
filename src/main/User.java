package main;

import java.util.ArrayList;

public class User {

	private String name;
	private String member_type;
	private Boolean excl_reward;
	private ArrayList<Booking> booking_list = new ArrayList<Booking>();

	/*   //what are these constructors for? 
	public User(String name, String member_type, boolean excl_reward) {
		this.name = name;
		this.member_type = member_type;
		this.excl_reward = excl_reward;
	}
	*/
	
	public boolean getExclReward() {
		return excl_reward;
	} // your function is boolean yet u return excl_reward which has no meaning of true or false but by default false
	
	public void updateExclReward(boolean excl_reward) {
		this.excl_reward = excl_reward;
	}// then u carry on the error and continue running the program
	
	public String getMemberType() {
		return member_type;
	}// OK so now you return member_type which is a string but has nothing in it.
	 // I assume you want to test it using parameters. But the conundrum is testing a function that does nothing but return
	
	public void setBooking(int no_of_rooms, Room room, WaitingList waiting_list) {
		booking_list.add(new Booking());  
		booking_list.get(booking_list.size() - 1).setBooking(this, no_of_rooms, room, waiting_list);
	} // in the assignment note setBooking is to check for room and allocate to waiting list
	 // but now addwaiting is doing  setBookings job
	
	
	
	
	public void printInfo(int booking_no, Printer printer) {
		printer.printInfo(name, member_type, booking_list.get(booking_no - 1).getRoomType());
	} // you have the syntax to ask the printInfo function to print yet you dont have an object declaration to use it
	 // I assume you're an expert in stubs and mockito to mock a full object. 

	
}
