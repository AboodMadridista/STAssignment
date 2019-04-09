package main;

import java.util.ArrayList;

public class User {

	private String name;
	private String member_type;
	private Boolean excl_reward;
	private ArrayList<Booking> booking_list = new ArrayList<Booking>();

	public User(String name, String member_type, boolean excl_reward) {
		this.name = name;
		this.member_type = member_type;
		this.excl_reward = excl_reward;
	}
	
	public boolean getExclReward() {
		return excl_reward;
	}
	
	public void updateExclReward(boolean excl_reward) {
		this.excl_reward = excl_reward;
	}
	
	public String getMemberType() {
		return member_type;
	}
	
	public void setBooking(int no_of_rooms, Room room, WaitingList waiting_list) {
		booking_list.add(new Booking());
		booking_list.get(booking_list.size() - 1).setBooking(this, no_of_rooms, room, waiting_list);
	}
	
	public void cancelBooking(int booking_no, WaitingList waiting_list) {
		//customers won't be refunded if they cancel the booking. 
		
		booking_list.get(booking_no - 1).cancelBooking(this, waiting_list);
		booking_list.remove(booking_no - 1);
	}
	
	public void printInfo(int booking_no, Printer printer) {
		printer.printInfo(name, member_type, booking_list.get(booking_no - 1).getRoomType());
	}

	
}
