package bkit.java156;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	// interface A
	
	// interface B
	
	// class B1 implements B
	
	// A extends B
	
	// class Test --> A a --> a.methodFromB() --> runtime call override method from B1

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
