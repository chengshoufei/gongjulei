package com.chengshoufei.common.utils.test;

import java.util.List;

import org.junit.Test;

import com.chengshoufei.common.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void test() {
		List<String> readTextFileOfList = FileUtil.readTextFileOfList("C:\\Users\\Administrator\\Desktop\\pom.xml");
		System.out.println(readTextFileOfList);
	}
}
