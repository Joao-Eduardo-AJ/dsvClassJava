package Aula4E1;

public class Aula4E1 {
	static Elevator elevator = new Elevator(8, 20);

	public static void main(String[] args) {
		entry(8);
		goUp(2);
		exit(2);
		goUp(7);
		exit(1);
		entry(3);
		goUp(18);
		exit(3);
		entry(2);
		goDown(0);
	}

	public static void goUp(int targetFloor) {
		if (targetFloor < elevator.getCurrentFloor()) {
			System.out.println("Andar inválido, ao envés disso, você deseja descer?");
		} else if (targetFloor == elevator.getCurrentFloor()) {
			System.out.println("Você já está neste andar, deseja sair?");
		}

		try {
			System.out.println("");
			while (elevator.getCurrentFloor() < targetFloor) {
				elevator.up();
				System.out.print("| " + elevator.getCurrentFloor() + " |");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

	public static void goDown(int targetFloor) {
		if (targetFloor > elevator.getCurrentFloor()) {
			System.out.println("Andar inválido, ao envés disso, você deseja subir?");
		} else if (targetFloor == elevator.getCurrentFloor()) {
			System.out.println("Você já está neste andar, deseja sair?");
		}

		try {
			System.out.println("");
			while (elevator.getCurrentFloor() > targetFloor) {
				elevator.down();
				System.out.print("| " + elevator.getCurrentFloor() + " |");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

	public static void entry(int numPeople) {
		try {
			System.out.println("");
			System.out.print("Entrou e tem: ");
			for (int i = elevator.getTotalCurrentUsers(); i <= numPeople; i++) {
				if (i > 0) {
					elevator.entry();
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exit(int numPeople) {
		try {
			System.out.println("");
			System.out.print("Saiu e tem: ");
			int initialUsers = elevator.getTotalCurrentUsers();
			int param = initialUsers - numPeople;
			for (int i = elevator.getTotalCurrentUsers(); param <= i; i--) {
				if (i < initialUsers) {
					elevator.exit();
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
