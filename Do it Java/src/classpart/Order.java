package classpart;

public class Order {

	String orderNum = "201803120001";
	String orderId = "abc123";
	String orderDate = "2018년 3월 12일";
	String orderName = "홍길순";
	String orderProductName="PD0345-12";
	String orderAddress="서울시 영등포구 여의도동 20번지";
	
	public  void printOrderInfo() {
		System.out.println("주문 번호 : " +orderNum);
		System.out.println("주문자 아이디 : " +orderId);
		System.out.println("주문 날짜 : " +orderDate);
		System.out.println("주문자 이름 : " +orderName);
		System.out.println("주문 상품 번호 : " +orderProductName);
		System.out.println("배송 주소 : " +orderAddress);
		
	}

	
	public static void main(String[] args) {
		Order orderList = new Order();
		orderList.printOrderInfo();
	}
		
		
}

