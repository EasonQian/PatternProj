package me.pattern.singleton;

import me.pattern.classForTypecode.PermissionState;

/**
 * 
 * @author eason qian
 * 用一个singleton代替多个实例，结合creation method和static访问控制
 * 
 * + 改进性能
 * - 从任何地方都可以很容易地访问，在很多情况下可能成为设计的一个缺点
 * - 当对象之间含有不能共享的状态时，重构无效
 */
public class PermissionRequested extends PermissionState{

	/*
	 * 2. 创建单件singleton字段，同样使用父类类型做声明
	 */
	private static PermissionState state = new PermissionRequested();
	
	/*
	 * 1. 将构造函数转化成creation method
	 * 使用父类作为接口的返回类型，从而希望客户端代码都通过父类与它的子类进行交互
	 * 在其他类中，将构造函数的所有调用者更新为调用这个creation method
	 */
	public static PermissionState requestedStateIns(){
//		return new PermissionRequested();
		/*
		 * 3. 返回singleton字段的值
		 * 如果该对象需要被迟实例化，在此处传入参数实现迟实例化（new一个出来）
		 */
		return state;
	}

}
