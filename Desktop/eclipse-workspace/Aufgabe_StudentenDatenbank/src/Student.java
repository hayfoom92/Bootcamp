
public class Student {

	String name;
	int matrikelnummer;

	public Student() {
	}

	public Student(String name, int matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}

	public Student(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public void printMe() {
		System.out.println(this.name + " " + this.matrikelnummer);
	}

	public class StudentDatabase {

		Student[] array;

		public StudentDatabase(int size) {
		}

		public void printMe() {
			for (Student student : array) {
				student.printMe();
			}
		}

		public void addMe(String name, int matrikelnummer) {
			int firstFreeIndex = -1;

			for (int i = 0; i < array.length; i++) {
				if (array[i] == null) {
					firstFreeIndex = i;
					break;
				}
			}

			if (firstFreeIndex == -1) {
				System.out.println("Studentendatenbank voll!");
			} else {
				array[firstFreeIndex] = new Student(name, matrikelnummer);
			}
		}
	}
}
