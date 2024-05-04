package com.wangsl.digest.conf;

import com.wangsl.digest.Digest;
import com.wangsl.digest.impl.MD5Digest;
import com.wangsl.digest.impl.SHADigest;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Settings.class)
public class Config {

	@Bean
	@ConditionalOnProperty(prefix="digest", name="type", havingValue="md5", matchIfMissing = true)
	public Digest MD5Digest(){
		System.out.println("MD5Digest initialize");
		return new MD5Digest();
	}

	@Bean
	@ConditionalOnProperty(prefix = "digest", name="type", havingValue="sha")
	public Digest SHADigest(){
		System.out.println("SHADigest initialize");
		return new SHADigest();
	}

}
