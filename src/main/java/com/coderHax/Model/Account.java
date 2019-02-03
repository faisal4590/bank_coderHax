package com.coderHax.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {
	@NonNull
	private String account_number;
	@NonNull
	private String branch_name;
	@NonNull
	private Double balance ;
}
