

public class Room {
	private int roomNo;
	private int capacity;
	private static int roomCounter;
	static {
		roomCounter = 500;
	}
	public Room() {
		super();
		this.roomNo = ++roomCounter;
		this.capacity = 4;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter;
	}
	public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
	

}
