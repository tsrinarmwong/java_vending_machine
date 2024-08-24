package vendingMachineProject;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		VM_1 vm1 = new VM_1();
		VM_2 vm2 = new VM_2();

		int vmTesting = 0;
		int stopProgram = -1; // if 0, then will stop
		Character ch = 'x';

		do {
			vmTesting = chooseMachine(sc, vmTesting);
			printMenu(vmTesting);
			testingOperation(sc, ch, vmTesting, vm1, vm2);
			stopProgram = chooseStop(sc, stopProgram, vm1, vm2);
		} while (stopProgram != 0);
	}

	public static int errorHandleInt(Scanner sc) {
		int n = 0;
		boolean validInput = false;
		do {
			try {
				n = Integer.parseInt(sc.nextLine());
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		} while (!validInput);

		return n;
	}

	public static float errorHandleFloat(Scanner scanner) {
		float n = 0;
		boolean validInput = false;
		do {
			try {
				n = Float.parseFloat(scanner.nextLine());
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid float.");
			}
		} while (!validInput);
		return n;
	}

	public static void printMenu(int vmTesting) {
		if (vmTesting == 1) {
			System.out.print("Vending Machine-" + vmTesting + "\n");
			System.out.print("------------------------------\n");
			System.out.print("MENU of Operations\n");
			System.out.print("------------------------------\n");
			System.out.print("0. create(int)\n");
			System.out.print("1. coin(float)\n");
			System.out.print("2. sugar()\n");
			System.out.print("3. tea()\n");
			System.out.print("4. latte()\n");
			System.out.print("5. insert_cups(int)\n");
			System.out.print("6. set_price(float)\n");
			System.out.print("7. cancel()\n");
			System.out.print("q. Quit the demo program\n");
			System.out.print("------------------------------\n");
			System.out.print("Please make a note of these operations\n");
			System.out.print("Vending Machine-1 Execution...\n");
			System.out.print("------------------------------\n");
		} else if (vmTesting == 2) {
			System.out.print("Vending Machine-" + vmTesting + "\n");
			System.out.print("------------------------------\n");
			System.out.print("MENU of Operations\n");
			System.out.print("------------------------------\n");
			System.out.print("0. CREATE(float)\n");
			System.out.print("1. COIN(int)\n");
			System.out.print("2. SUGAR()\n");
			System.out.print("3. CREAM()\n");
			System.out.print("4. COFFEE()\n");
			System.out.print("5. InsertCups(int)\n");
			System.out.print("6. SetPrice(int)\n");
			System.out.print("7. CANCEL()\n");
			System.out.print("q. Quit the demo program\n");
			System.out.print("------------------------------\n");
			System.out.print("Please make a note of these operations\n");
			System.out.print("Vending Machine-1 Execution...\n");
			System.out.print("------------------------------\n");
		}
	}

	public static int chooseMachine(Scanner sc, int vmTesting) {
		do {
			System.out.print("Select Vending Machine to test\nPlease enter 1 or 2\n>");
			vmTesting = errorHandleInt(sc);
		} while (vmTesting != 1 && vmTesting != 2);
		return vmTesting;
	}

	public static void testingOperation(Scanner sc, Character ch, int vmTesting, VM_1 vm1, VM_2 vm2) {
		ch = 'x';
		if (vmTesting == 1) {
			while (ch != 'q') {
				ch = VM1_Operation(sc, vm1);
			}
			;
		} else if (vmTesting == 2) {
			while (ch != 'q') {
				ch = VM2_Operation(sc, vm2);
			}
			;
		}
	}

	public static Character VM1_Operation(Scanner sc, VM_1 vm1) {
		char ch;
		int p1, n1;
		float v1, tempP;
		System.out.print("Select Operation: \n");
		System.out.print("------------------------------\n");
		System.out.print("0-create, 1-coin, 2-sugar, 3-tea, 4-latte, 5-insert_cups, 6-set_price, 7-cancel\n>");
		ch = sc.next().charAt(0);
		switch (ch) {
		case '0': // create
			System.out.print("Operation: create(int p)\n");
			System.out.print("------------------------------\n");
			System.out.print("Enter value of parameter p: \n>");
			sc.nextLine(); // consume remaining newline character
			p1 = errorHandleInt(sc);
			vm1.create(p1);
			break;
		case '1': // coin
			System.out.print("Operation: coin(float v)\n");
			System.out.print("-----------(behaviour might differ by states)----------\n");
			System.out.print("Enter value of parameter v: \n>");
			sc.nextLine(); // consume remaining newline character
			v1 = errorHandleFloat(sc);
			vm1.coin(v1);
			break;
		case '2': // sugar
			System.out.print("Operation: sugar()\n");
			System.out.print("------------------------------\n");
			vm1.sugar();
			break;
		case '3': // tea
			System.out.print(" Operation: tea()\n");
			System.out.print("------------------------------\n");
			vm1.tea();
			break;
		case '4': // latte
			System.out.print(" Operation: latte()\n");
			System.out.print("------------------------------\n");
			vm1.latte();
			break;
		case '5': // insert_cups
			System.out.print(" Operation: insert_cups(int n)\n");
			System.out.print("------------------------------\n");
			System.out.print(" Enter value of parameter n: \n>");
			sc.nextLine(); // consume remaining newline character
			n1 = errorHandleInt(sc);
			vm1.insert_cups(n1);
			break;
		case '6': // set_price
			System.out.print(" Operation: set_price(float v)\n");
			System.out.print("------------------------------\n");
			System.out.print(" Enter value of parameter v: \n>");
			sc.nextLine(); // consume remaining newline character
			tempP = errorHandleFloat(sc);
			vm1.set_price(tempP);
			break;
		case '7': // cancel
			System.out.print(" Operation: cancel()\n");
			System.out.print("------------------------------\n");
			vm1.cancel();
			break;
		default:
			System.out.print(" Invalid Operation.(Enter q to quit)\n");
			break;
		}
		return ch;
	}

	public static Character VM2_Operation(Scanner sc, VM_2 vm2) {
		char ch;
		int v2, n2, x, tempP;
		float p2;
		System.out.print("Select Operation: \n");
		System.out.print("------------------------------\n");
		System.out.print("0-CREATE, 1-COIN, 2-CARD, 3-SUGAR, 4-CREAM, 5-COFFEE, 6-InsertCups, 7-SetPrice, 8-CANCEL\n>");
		ch = sc.next().charAt(0);
		switch (ch) {
		case '0': // create
			System.out.print("Operation: CREATE(float p)\n");
			System.out.print("------------------------------\n");
			System.out.print("Enter value of parameter p: \n>");
			sc.nextLine(); // consume remaining newline character
			p2 = errorHandleFloat(sc);
			vm2.CREATE(p2);
			break;
		case '1': // coin
			System.out.print("Operation: COIN(int v)\n");
			System.out.print("-----------(behaviour might differ by states)----------\n");
			System.out.print("Enter value of parameter v: \n>");
			sc.nextLine(); // consume remaining newline character
			v2 = errorHandleInt(sc);
			vm2.COIN(v2);
			break;
		case '2': // card
			System.out.print("Operation: CARD(int x)\n");
			System.out.print("------------------------------\n");
			System.out.print("Enter value of parameter x: \n>");
			sc.nextLine(); // consume remaining newline character
			x = errorHandleInt(sc);
			vm2.CARD(x);
			break;
		case '3': // sugar
			System.out.print("Operation: SUGAR()\n");
			System.out.print("------------------------------\n");
			vm2.SUGAR();
			break;
		case '4': // tea
			System.out.print(" Operation: CREAM()\n");
			System.out.print("------------------------------\n");
			vm2.CREAM();
			break;
		case '5': // latte
			System.out.print(" Operation: COFFEE()\n");
			System.out.print("------------------------------\n");
			vm2.COFFEE();
			break;
		case '6': // insert_cups
			System.out.print(" Operation: InsertCups(int n)\n");
			System.out.print("------------------------------\n");
			System.out.print(" Enter value of parameter n: \n>");
			sc.nextLine(); // consume remaining newline character
			n2 = errorHandleInt(sc);
			vm2.InsertCups(n2);
			break;
		case '7': // set_price
			System.out.print(" Operation: SetPrice(float v)\n");
			System.out.print("------------------------------\n");
			System.out.print(" Enter value of parameter v: \n>");
			sc.nextLine(); // consume remaining newline character
			tempP = errorHandleInt(sc);
			vm2.SetPrice(tempP);
			break;
		case '8': // cancel
			System.out.print(" Operation: CANCEL()\n");
			System.out.print("------------------------------\n");
			vm2.CANCEL();
			break;
		default:
			System.out.print(" Invalid Operation.(Enter q to quit)\n");
			break;
		}
		return ch;
	}

	public static int chooseStop(Scanner sc, int stopProgram, VM_1 vm1, VM_2 vm2) {
		System.out.print("------------------------------\n");
		System.out.print("Stop or continue test another VM?\n" + "Enter 0 to stop or any number to continue\n");
		System.out.print("------------------------------\n>");
		sc.nextLine(); // consume remaining newline character
		if (stopProgram != 0) {
			vm1 = new VM_1();
			vm2 = new VM_2();
		}
		return stopProgram = errorHandleInt(sc);
	}
}
