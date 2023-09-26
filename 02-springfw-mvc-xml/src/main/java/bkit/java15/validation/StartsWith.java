package bkit.java15.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartsWithValidator.class)
public @interface StartsWith {

	String[] prefixes() default {};
	
	String message() default "Invalid Text";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
