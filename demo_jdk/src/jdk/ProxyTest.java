package jdk;

public class ProxyTest {

	public static void main(String[] args) {

		CountImpl countImpl = new CountImpl();
		CountProxy cp = new CountProxy(countImpl);
		cp.queryCount();
		cp.updateCount();
	}

}
