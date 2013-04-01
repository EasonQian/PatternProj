package me.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class SquarePegDecorator implements Work{
	
	/** decorator������ԭʼ��ʵ��ͬ���Ľӿڣ�������adapter��ȫ��ͬ�ĵط������߸ı��˽ӿڡ�decorator������װ�εĶ�����һ���ӿڣ�
	* ���ʹ�������ڿͻ�������˵��͸���ģ�����ʹ��instanceof���������ͣ���Ȼdecorator���䱻װ�ζ�����һ�����͵ģ�
	* ��Ҫ����ѡ��ԭʼ����丸���Ϊ���ʵ���Ϊ��װ����
	* . ��װ�ε�������ܶ�Ĺ������������������಻�ʺ���decoratorģʽ��Ϊ�˱�֤�ӿڵ�͸���ԣ�����decorator�����ӹ�����������
	* . ������ڶ��decorator����Ҫ����˳�����⣬��÷�װ���е�decorator���ÿͻ�����ͨ��create method������Щdecorator�İ�ȫ���
	* + �Ⱦ�̬�ļ̳и��������Զ�̬���������ӹ��ܵ�˳���ϸ��
	* + ��Ч�ذ���ĺ���ָ���װ�ι������ֿ�����java i/o�д���ʹ��������decorator
	* + ���Գ�ȥ����������е��ظ���װ���߼�
	* - �ı��˱�decorate�Ķ��������
	* - ֻ�ܸı����������strategy�ı��˶�����ںˣ�����ȫ��ͬ�Ĳ�����ʽ 
	*/
	
	private Work work;
	private List<String> newFunctionsArrayList  = new ArrayList<String>(); // ��������
	
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
		Work squareWork = new SquarePegDecorator(new SquarePeg()); // decorator ģʽ
		squareWork.insert(); // ������SquarePegDecorator��insert������ʵ���������Ĺ���װ��
	}

}
