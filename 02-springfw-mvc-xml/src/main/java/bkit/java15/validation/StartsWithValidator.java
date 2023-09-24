package bkit.java15.validation;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartsWithValidator implements ConstraintValidator<StartsWith, String>{
	
	private List<String> prefixes;
	
	@Override
	public void initialize(StartsWith startsWith) {
		prefixes = List.of(startsWith.prefixes());
	}
	
	@Override
	public boolean isValid(String input, ConstraintValidatorContext context) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		return prefixes.stream().anyMatch(input::startsWith);
	}
	
}
