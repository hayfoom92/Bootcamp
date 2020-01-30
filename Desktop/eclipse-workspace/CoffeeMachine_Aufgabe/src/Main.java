import java.util.Scanner;

public class Main {

	public static void buy(int coffeeNow, int waterNow, int milkNow, int money, int cupsNow) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
		int choice = scan.nextInt();
		String coffeeType = "nothingYet";

		switch (choice) {
		case 1:
			coffeeType = "espresso";
			break;
		case 2:
			coffeeType = "latte";
			break;
		case 3:
			coffeeType = "capuccino";
			break;
		default:
			System.out.println("Please choose a correct button from choice!");
		}

		int waterFinal;
		int milkFinal;
		int coffeeFinal;
		int moneyFinal;
		int cupsFinal;

		if (coffeeType.equals("espresso")) {
			coffeeFinal = coffeeNow - 16;
			waterFinal = waterNow - 250;
			moneyFinal = money + 4;
			milkFinal = milkNow;
			cupsFinal = cupsNow - 1;
			System.out.println(
					"The coffee machine has:\n" + waterFinal + " of water\n" + milkFinal + " of milk\n" + coffeeFinal
							+ " of coffee beans\n" + cupsFinal + " of disposable cups\n" + moneyFinal + " of money");

		} else if (coffeeType.equals("latte")) {
			coffeeFinal = coffeeNow - 20;
			waterFinal = waterNow - 350;
			milkFinal = milkNow - 75;
			moneyFinal = money + 7;
			cupsFinal = cupsNow - 1;
			System.out.println(
					"The coffee machine has:\n" + waterFinal + " of water\n" + milkFinal + " of milk\n" + coffeeFinal
							+ " of coffee beans\n" + cupsFinal + " of disposable cups\n" + moneyFinal + " of money");

		} else if (coffeeType.equals("capuccino")) {
			coffeeFinal = coffeeNow - 12;
			waterFinal = waterNow - 200;
			milkFinal = milkNow - 100;
			moneyFinal = money + 6;
			cupsFinal = cupsNow - 1;
			System.out.println(
					"The coffee machine has:\n" + waterFinal + " of water\n" + milkFinal + " of milk\n" + coffeeFinal
							+ " of coffee beans\n" + cupsFinal + " of disposable cups\n" + moneyFinal + " of money");

		}

	}

	public static void fill(int coffeeNow, int waterNow, int milkNow, int cupsNow, int moneyNow) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write how many ml of water do you want to add:");
		int waterPlus = scan.nextInt();
		System.out.println("Write how many ml of milk do you want to add:");
		int milkPlus = scan.nextInt();
		System.out.println("Write how many grams of coffee beans do you want to add:");
		int coffeePlus = scan.nextInt();
		System.out.println("Write how many disposable cups of coffee do you want to add:");
		int cupsPlus = scan.nextInt();

		int waterFinal = waterNow + waterPlus;
		int coffeeFinal = coffeeNow + coffeePlus;
		int milkFinal = milkNow + milkPlus;
		int cupsFinal = cupsNow + cupsPlus;

		System.out.println("\nThe coffee machine has:\n" + waterFinal + " of water\n" + milkFinal + " of milk\n"
				+ coffeeFinal + " of coffee beans\n" + cupsFinal + " of disposable cups\n" + moneyNow + " of money");
	}

	public static void take(int coffeeNow, int waterNow, int milkNow, int cupsNow) {
		int moneyFinal = 0;
		System.out.println("I gave you $550\n");
		System.out.println("\nThe coffee machine has:\n" + waterNow + " of water\n" + milkNow + " of milk\n" + coffeeNow
				+ " of coffee beans\n" + cupsNow + " of disposable cups\n" + moneyFinal + " of money");

	}

	public static void main(String[] args) {

		System.out.println("The coffee machine has:\n" + "1200 of water\n" + "540 of milk\n" + "120 of coffee beans\n"
				+ "9 of disposable cups\n" + "550 of money\n");

		System.out.println("Write action (buy, fill, take): ");
		Scanner scan = new Scanner(System.in);
		String press = scan.next();

		if (press.equals("fill")) {
			fill(120, 1200, 540, 9, 550);
		} else if (press.equals("take")) {
			take(120, 1200, 540, 9);
		} else if (press.equals("buy"))
			buy(120, 1200, 540, 550, 9);
	}

}
