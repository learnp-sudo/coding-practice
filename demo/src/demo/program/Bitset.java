package demo.program;

import java.util.BitSet;

public class Bitset {
	public static void main(String args[]) {
		BitSet obj = new BitSet(5);
		for (int i = 0; i < 5; ++i)
			obj.set(i);
		System.out.print(obj.get(3));
	}

}
