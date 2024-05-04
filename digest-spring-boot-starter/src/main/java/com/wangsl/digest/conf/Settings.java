package com.wangsl.digest.conf;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "digest")
public class Settings {

	@Getter
	@Setter
	private String type;
}
