package compare.demo;

public class Student {
	
	private String name;
	private int score;
	private int height;
	
	
	public Student(String name, int score, int height) {
		super();
		this.name = name;
		this.score = score;
		this.height = height;
	}
		
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", height=" + height + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}