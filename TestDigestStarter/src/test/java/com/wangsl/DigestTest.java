package com.wangsl;

import com.wangsl.digest.Digest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class DigestTest {

	@Resource
	private Digest digest;

	@Test
	public void testDigest(){
		String digest = this.digest.digest("hello world");
		System.out.println(digest);
	}
}
