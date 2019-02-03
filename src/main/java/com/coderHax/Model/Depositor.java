package com.coderHax.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Depositor {
	@NonNull
	private String customer_id;
	@NonNull
	private String customer_name;
	@NonNull
	private String account_number ;
	
}
