package com.sparta.jpaquiz.application.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;

	@Getter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Address {
		private String street;
		private String suite;
		private String zipcode;
	}
}
