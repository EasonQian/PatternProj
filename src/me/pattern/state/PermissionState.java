package me.pattern.state;

/**
 * 
 * @author eason qian
 * 应用类替换类型代码重构，将所有的state转化成一个父类
 * 所有的类型设置为final static的该类实例
 * 提炼子类：将每天一个类型替换为一个child state, 在子类中重写父类的特定方法，处理单个状态相关的操作
 * 
 * + 减少或除去复杂的状态改变条件逻辑
 * - 首先应该考虑的是通过提炼方法等方式简化，只有当逻辑过于复杂时才考虑使用state模式，否则会增加不必要的代码量
 */
public abstract class PermissionState {
	
	public abstract String toString();
	// 以下方法被子类state重写，从而用不同的类简化复杂的状态逻辑 
	public void claimedBy(SystemUser user, SystemPermission permission){}
	public void deniedBy(SystemUser user, SystemPermission permission){}
	public void grantedBy(SystemUser user, SystemPermission permission){}
	
	
	// 实例化为子类state类型
	public final static PermissionState REQUESTED = new PermissionRequested();
	public final static PermissionState CLAIMED = new PermissionClaimed();
	//...
	
	
}
