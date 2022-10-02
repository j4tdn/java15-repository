package exercies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Ex02 {
	public static void main(String[] args) {
		String input = "aaaababbbddc";
		List<String> character = Arrays.asList(input.split(""));

		Optional<String> op = character.stream()
				.max((c1, c2) -> Collections.frequency(character, c1) - Collections.frequency(character, c2));
		op.ifPresent(System.out::println);
	}
}