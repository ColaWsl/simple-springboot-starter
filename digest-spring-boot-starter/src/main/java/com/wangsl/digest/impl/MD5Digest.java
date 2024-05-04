package com.wangsl.digest.impl;

import com.wangsl.digest.Digest;
import org.apache.commons.codec.digest.DigestUtils;

public class MD5Digest implements Digest {

	@Override
	public String digest(String raw) {
		System.out.println("使用MD5算法生成摘要");
		return DigestUtils.md5Hex(raw);
	}
}
