package com.zhuziym.char07_03;

import com.zhuziym.char07_02.Subject;

/**
 * @Title: RealSubjcet.java
 * @Package com.zhuziym.char07_02
 * @Description: TODO(具体主题)
 * @author 作者 grq
 * @version 创建时间：2018年8月13日 上午11:34:15
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}

}
