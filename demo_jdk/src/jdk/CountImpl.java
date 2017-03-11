package jdk;

public class CountImpl implements Count {

	@Override
	public void queryCount() {

		System.out.println("查询账户");

	}

	@Override
	public void updateCount() {

		System.out.println("更新账户");
		
	}

}
