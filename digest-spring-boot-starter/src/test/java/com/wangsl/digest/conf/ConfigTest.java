package com.wangsl.digest.conf;

import com.wangsl.digest.Digest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConfigTest {

	@Resource
	private Digest digest;

	@Test
	void md5Digest() {
		System.out.println(digest.digest("hello world"));
	}
}