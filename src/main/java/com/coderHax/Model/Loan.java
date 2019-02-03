package com.coderHax.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Loan {
	@NonNull
	private String loan_number;
	@NonNull
	private String branch_name;
	@NonNull
	private Double amount ;
	@NonNull
	private String customer_id ;
}
