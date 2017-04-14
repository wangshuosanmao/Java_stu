package com.wang.java_stu.thread;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Pen {
	private String name = "I'm Pen!";
	private String owner; // 对象的拥有者
	private Boolean isPrivated = false;// 是否被占有
}
