package com.coderHax.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Branch {
	@NonNull
	private String branch_name;
	@NonNull
	private String branch_city;
	@NonNull
	private Double assets ;
}
