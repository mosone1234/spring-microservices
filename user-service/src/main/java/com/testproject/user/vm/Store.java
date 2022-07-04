package com.testproject.user.vm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Store
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {

	private Long id;
	private String name;
	private String adress;
	private String code;

}
