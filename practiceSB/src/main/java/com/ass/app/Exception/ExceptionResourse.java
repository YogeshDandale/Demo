package com.ass.app.Exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResourse {

	private Date timestamp;
	
	private String massage;
	
	private String details;
	
	
}
