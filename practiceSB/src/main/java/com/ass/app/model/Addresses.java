package com.ass.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Addresses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	private String localaddr;
	private String permanentaddr;

}
