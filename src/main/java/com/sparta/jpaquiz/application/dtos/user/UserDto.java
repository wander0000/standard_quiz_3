package com.sparta.jpaquiz.application.dtos.user;

import com.sparta.jpaquiz.domain.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(access = AccessLevel.PRIVATE)
public class UserDto {
	private Long id;
	private String name;
	private String username;
	private String email;
	private String fullAddress; // address.street + ' ' + address.suite 로 구성
	private String zipcode;
	private String phoneNumber;

	public static UserDto from(User user) {
		return UserDto.builder()
			.id(user.getId())
			.name(user.getName())
			.username(user.getUsername())
			.email(user.getEmail())
			.fullAddress(user.getFullAddress())
			.zipcode(user.getZipcode())
			.phoneNumber(user.getPhoneNumber())
			.build();
	}

	// public static UserDto from(User user) {
	// 	return new UserDto(
	// 		user.getId(),
	// 		user.getName(),
	// 		user.getUsername(),
	// 		user.getEmail(),
	// 		user.getFullAddress(),
	// 		user.getZipcode(),
	// 		user.getPhoneNumber()
	// 	);
	// }
}
