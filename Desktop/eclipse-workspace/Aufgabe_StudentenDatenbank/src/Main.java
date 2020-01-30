import java.util.*;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.name = "Haithem";
		student1.matrikelnummer = 3002800;

		System.out.println(student1.name + " " + student1.matrikelnummer);

		Student student2 = new Student("Amine", 3006090);

		student2.printMe();

		Student[] array = new Student[100];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			array[i] = new Student(name, random.nextInt(899999) + 100000);
			array[i].printMe();
		}

	}

}
