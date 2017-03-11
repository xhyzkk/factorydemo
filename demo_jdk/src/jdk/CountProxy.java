package jdk;

public class CountProxy implements Count {
	
	private CountImpl countImpl;

	//����Ĭ�ϵĹ�����
	 public CountProxy(CountImpl countImpl) {
		 
		 this.countImpl = countImpl;
		 
	}
	
	@Override
	public void queryCount() {
		// TODO Auto-generated method stub
		System.out.println("���÷���ǰ");
		countImpl.queryCount();
		System.out.println("���÷�����");

	}

	@Override
	public void updateCount() {
		// TODO Auto-generated method stub

		System.out.println("���÷���ǰ");
		countImpl.updateCount();
		System.out.println("���÷�����");
	}

}
