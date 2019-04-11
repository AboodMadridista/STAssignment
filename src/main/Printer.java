package main;

public class Printer {
	User user;
	Room room;
	
	public Printer() {
		
		
	}
	
	public void printInfo(String name, String member_type, String room_type) {
		
		
			System.out.println("User is"+ name);
			System.out.println("Member Type is"+ member_type);
			System.out.println("Room Type is"+ room_type);
		}
}
