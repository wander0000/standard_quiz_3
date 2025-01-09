package com.sparta.jpaquiz.infrastructure;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sparta.jpaquiz.application.dtos.post.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.post.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.user.UserResponseDto;
import com.sparta.jpaquiz.application.service.post.PostService;
import com.sparta.jpaquiz.application.service.user.UserQueryService;

@Service
public class JsonPlaceholderApiClient implements UserQueryService, PostService {
	private final RestTemplate restTemplate;
	// 외부 API URL
	private final String API_URL = "https://jsonplaceholder.typicode.com/";

	public JsonPlaceholderApiClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * 1. userId 를 Path Parameter 로 전달 할 수 있도록 API 요청 URL 을 만드세요.<br/>
	 * 2. RestTemplate 를 이용해서 외부 API 를 호출한 뒤 {@link UserResponseDto} 객체로 응답하세요.
	 * @see <a href="https://jsonplaceholder.typicode.com/users/1">유저 단건 조회 외부 API 주소</a>
	 * @param userId 유저 ID
	 * @return {@link UserResponseDto} 유저 응답 객체
	 */
	@Override
	public UserResponseDto getUser(Long userId) {
		String url = UriComponentsBuilder
			.fromUriString(API_URL)
			.pathSegment("users", userId.toString())
			.build()
			.toUriString();

		ResponseEntity<UserResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, null, UserResponseDto.class);
		return response.getBody();
	}

	/**
	 * 1. {@link PostRequestDto} 객체를 이용하여 게시글을 저장하는 외부 API를 연동하세요.<br/><br/>
	 * 2. {@link PostResponseDto} 형태로 응답하세요.
	 * @param request 게시글 생성 요청 객체 ({@link PostRequestDto})
	 * @return {@link PostResponseDto}
	 *
	 * @see <a href="https://jsonplaceholder.typicode.com/guide">외부 API 연동 가이드</a>
	 * @see <a href="https://jsonplaceholder.typicode.com/posts">게시글 저장 외부 API</a>
	 *
	 */
	@Override
	public PostResponseDto addPost(PostRequestDto request) {
		String url = UriComponentsBuilder
			.fromUriString(API_URL)
			.path("posts")
			.build()
			.toUriString();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity requestEntity = new HttpEntity(request, headers);

		ResponseEntity<PostResponseDto> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, PostResponseDto.class);
		return response.getBody();
	}
}
