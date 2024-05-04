package com.wangsl.digest.impl;

import com.wangsl.digest.Digest;
import org.apache.commons.codec.digest.DigestUtils;

public class SHADigest implements Digest {
	@Override
	public String digest(String raw) {
		System.out.println("使用SHA算法生成摘要");
		return DigestUtils.sha256Hex(raw);
	}
}
