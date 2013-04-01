package me.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class SquarePegDecorator implements Work{
	
	/** decorator必须与原始类实现同样的接口，这是与adapter完全不同的地方，后者改变了接口。decorator与它被装饰的对象共享一个接口，
	* 因此使用它对于客户代码来说是透明的，除非使用instanceof刻意检查类型（显然decorator和其被装饰对象不是一个类型的）
	* 需要尽量选择原始类或其父类较为合适的作为包装类型
	* . 被装饰的类包含很多的公共方法，则这样的类不适合用decorator模式，为了保证接口的透明性，会在decorator中增加过多的冗余代码
	* . 如果存在多个decorator，需要考虑顺序问题，最好封装所有的decorator，让客户代码通过create method访问这些decorator的安全组合
	* + 比静态的继承更加灵活，可以动态调整新增加功能的顺序和细节
	* + 有效地把类的核心指责和装饰功能区分开来，java i/o中大量使用了这种decorator
	* + 可以除去几个相关类中的重复的装饰逻辑
	* - 改变了被decorate的对象的类型
	* - 只能改变对象的外表，而strategy改变了对象的内核，是完全不同的操作方式 
	*/
	
	private Work work;
	private List<String> newFunctionsArrayList  = new ArrayList<String>(); // 新增功能
	
	public SquarePegDecorator(Work work) {
		this.work = work;
		newFunctionsArrayList.add("dig");
		newFunctionsArrayList.add("hunt");
	}

	@Override
	public void insert() {
		newMethod();
		work.insert();
	}
	
	private void newMethod(){
		// ... new method added
	}
	
	
	public static void main(String[] args){
		Work squareWork = new SquarePegDecorator(new SquarePeg()); // decorator 模式
		squareWork.insert(); // 调用了SquarePegDecorator的insert方法，实现了新增的功能装饰
	}

}
