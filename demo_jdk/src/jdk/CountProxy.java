package jdk;

public class CountProxy implements Count {
	
	private CountImpl countImpl;

	//覆盖默认的构造器
	 public CountProxy(CountImpl countImpl) {
		 
		 this.countImpl = countImpl;
		 
	}
	
	@Override
	public void queryCount() {
		// TODO Auto-generated method stub
		System.out.println("调用方法前");
		countImpl.queryCount();
		System.out.println("调用方法后");

	}

	@Override
	public void updateCount() {
		// TODO Auto-generated method stub

		System.out.println("调用方法前");
		countImpl.updateCount();
		System.out.println("调用方法后");
	}

}
