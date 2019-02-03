package com.coderHax.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

	@NonNull
	private String emp_name;
	@NonNull
	private String branch_name;
	@NonNull
	private Double emp_salary ;
}
