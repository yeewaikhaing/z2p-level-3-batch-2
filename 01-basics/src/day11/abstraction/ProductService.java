package day11.abstraction;

public class ProductService extends DatabaseUtil{

	int price;
	public void insert() {
		System.out.println("insert into proudct values(?,?,?)");
	}

	@Override
	public void update() {
		System.out.println("update product set price = ?");
		
	}

	@Override
	public boolean delete(int id) {
		System.out.println("DELETE FROM product WHERE proudctId = " + id);
		return true;
	}

	@Override
	public Object findById(int id) {
		System.out.println("SELECT * FROM proudct WHERE product_id = " + id);
		return null;
	}

	
}
