package com.cooper.workoutTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.constraints.Email;

@SpringBootApplication
public class WorkoutTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutTrackerApplication.class, args);
	}
		private Integer id;
		private String name;
		private Email email;

		//		public frank = new main(1,"frank", "frank@gmail.com");
}
