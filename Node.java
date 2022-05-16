public class Node {
	int freq;
	Byte ch;
	Byte ch2;
	Node left;
	Node right;

	public Node(byte ch, int freq) // constructor for leaf
	{
		this.freq = freq;
		this.ch = ch;
		this.ch2 = null;
		left = null;
		right = null;
	}

	public Node(byte ch, byte ch2, int freq) // constructor for leaf
	{
		this.freq = freq;
		this.ch = ch;
		this.ch2 = ch2;
		left = null;
		right = null;
	}

	public Node(int freq, Node left, Node right) // constructor for inside node
	{
		this.freq = freq;
		this.ch = null;
		this.ch2 = null;
		this.left = left;
		this.right = right;
	}

	public String toString() {
		if (ch2 == null) {
			byte c = ch;
			return "freq: " + freq + ", char: " + c + "|";
		} else {
			byte c1 = ch;
			byte c2 = ch2;
			return "freq: " + freq + ", char: " + c1 + "," + c2 + "|";
		}
	}
}
