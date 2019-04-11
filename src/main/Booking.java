package main;

public class Booking {
	private Boolean waiting = false;
	private String room_type = "";
	
	public String getRoomType() {
		return room_type;
	}
	
	public void setBooking(User user, int no_of_rooms, Room room, WaitingList waiting_list) {
		//no exclusive rewards for vip
		
		if(user.getMemberType().equals("vip")) {
			for(int x = 0; x < no_of_rooms; x++) {
				if(room.checkRoom("vip")) {
					room_type += "vip ";
				}
				else if(room.checkRoom("deluxe")) {
					room_type += "deluxe ";
				}
				else if(room.checkRoom("standard")) {
					room_type += "standard ";
				}
				else {
					waiting_list.addWaiting(user);
					waiting = true;
					room_type = "";
					break;
				}
			}
		}
		else if(user.getMemberType().equals("member")) {
			boolean temp_excl_reward = user.getExclReward();
			for(int x = 0; x < no_of_rooms; x++) {
				if(room.checkRoom("deluxe")) {
					room_type += "deluxe ";
				}
				else if(temp_excl_reward && room.checkRoom("vip")) {
					room_type += "vip ";
					temp_excl_reward = false;
				}
				else if(room.checkRoom("standard")) {
					room_type += "standard ";
				}
				else {
					waiting_list.addWaiting(user);
					waiting = true;
					room_type = "";
					break;
				}
			}
			if(room_type.contains("vip"))
				user.updateExclReward(false);
		}
		else {
			if(room.checkRoom("standard")) {
				room_type += "standard ";
			}
			else {
				waiting_list.addWaiting(user);
				waiting = true;
				room_type = "";
			}
		}
		room_type.trim();
	}
	
	public void cancelBooking(User user, WaitingList waiting_list) {
		if (waiting == true)
			waiting_list.removeWaiting(user);
	} 
} // overall code here is very neat however I am moved to doubt if you understand the concepts of OO to write such a code 
