public class Main {

	static String animalsound(String animal) {
		String sound = switch (animal) {
			case "dog", "Dog" -> "woof";
			case "cat", "Cat" -> "meow";
			default -> "no sound";
		};
		return sound;
	}

	static void even_numbers(int max) {
		int i = 0;
		while (i <= max) {
			i++;
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	static void odd_numbers(int max) {
		int i = 1;
		while (true) {
			if (i > max) {
				break;
			}
			System.out.println(i);
			i += 2;
		}
	}

	public static void main(String[] args) {
		String sound = animalsound("dog");
		System.out.println(sound);

		Circle circ = new Circle(3.0f);
		float radius = circ.area();
		float circum = circ.circumference();
		System.out.println(radius);
		System.out.println(circum);

		even_numbers(10);

		odd_numbers(10);
	}
}