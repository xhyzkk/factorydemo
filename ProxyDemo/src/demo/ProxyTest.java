package demo;

public class ProxyTest {

	public static void main(String[] args) {
		
		BookProxy bp = new BookProxy();
		Book bi =  (Book) bp.bind(new BookImpl());
		bi.addbook();

	}

}
