package Aula4E1;

public class Elevator {
	private int currentFloor;
	private int totalFloors;
	private int capacity;
	private int totalCurrentUsers;

	public Elevator(int capacity, int totalFloors) {
		this.capacity = capacity;
		this.totalFloors = totalFloors;
		this.currentFloor = 0;
		this.totalCurrentUsers = 0;
	};

	public void entry() throws Exception {
		if (this.totalCurrentUsers < this.capacity) {
			this.setTotalCurrentUsers(totalCurrentUsers + 1);
		} else {
			throw new Exception("O elevador está cheio");
		}
	}

	public void exit() throws Exception {
		if (this.totalCurrentUsers > 0) {
			this.setTotalCurrentUsers(totalCurrentUsers - 1);
		} else {
			throw new Exception("O elevador está vazio");
		}
	}

	public void up() throws Exception {
		if (this.currentFloor < this.totalFloors) {
			this.setCurrentFloor(currentFloor + 1);
		} else {
			throw new Exception("O elevador está no último andar");
		}
	}

	public void down() throws Exception {
		if (this.currentFloor > 0) {
			this.setCurrentFloor(currentFloor - 1);
		} else {
			throw new Exception("O elevador está no terreo");
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getTotalFloors() {
		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public int getElevatorCapacity() {
		return capacity;
	}

	public void setElevatorCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTotalCurrentUsers() {
		return totalCurrentUsers;
	}

	public void setTotalCurrentUsers(int totalCurrentUsers) {
		this.totalCurrentUsers = totalCurrentUsers;
	};

}
