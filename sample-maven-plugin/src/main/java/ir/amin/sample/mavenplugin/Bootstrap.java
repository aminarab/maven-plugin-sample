package ir.amin.sample.mavenplugin;

public class Bootstrap {

	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}

}