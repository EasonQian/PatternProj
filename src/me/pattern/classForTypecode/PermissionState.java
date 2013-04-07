package me.pattern.classForTypecode;

/**
 * 
 * @author eason qian
 * 用类代替类型代码，替换类型不安全的字段的比较和赋值操作
 * 客户端需要赋值或比较都只能调用已经建立好的安全的类型常量
 * 
 * + 使用枚举这种语言特性也可以做到，但是本模式优点是:可以支持扩展来实现更多的行为，而枚举类型做不到这一点
 * + 避免非法的赋值和比较
 * - 比使用类型不安全的代码需要更多的代码
 * 
 */
public class PermissionState {

	/*
	 * 创建一个常量表示法，声明为final的permissionState的public static变量
	 */
	public final static PermissionState REQUESTED = new PermissionState("REQUESTED");
	public final static PermissionState CLAIMED = new PermissionState("CLAIMED");
	
	
	private String stateName;
	
	public PermissionState() {
		// TODO Auto-generated constructor stub
	}
	public PermissionState(String stateName){
		this.setStateName(stateName);
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
}
