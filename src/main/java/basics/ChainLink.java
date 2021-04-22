package basics;

enum Side {
	NONE, LEFT, RIGHT
}

public class ChainLink {
	private ChainLink left, right;

	public void append(ChainLink rightPart) {
		if (this.right != null)
			throw new IllegalStateException("Link is already connected.");

		this.right = rightPart;
		rightPart.left = this;
	}

	

	public static void main(String[] args) {
		ChainLink left = new ChainLink();
		ChainLink middle = new ChainLink();
		ChainLink right = new ChainLink();
		left.append(middle);
		middle.append(right);
		System.out.println(left.longerSide());
	}
	
	 
	 public Enum<Side> longerSide() {

		if (Side.LEFT.values().length> Side.RIGHT.values().length)
			return Side.LEFT;
		else
			 return Side.RIGHT;

	}
	
	
}