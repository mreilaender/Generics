package stack1;


public class StackTest {
//	private final static String let = writeLetters(130);
	private static String let2;
	private static Stack<Integer> si = new Stack<Integer>();//Type the Object u want in the <...> like <String>, in BOTH <...>
	private static Stack<String> ss = new Stack<String>();
	public static void main(String[] args)
	{
		/* Testing with Numbers (Integer) */
		for(int i = 0;i < 10;++i)
		{
			// Creating some Random Binary Numbers //
			si.push(new Integer(Integer.toBinaryString(((int)(64*Math.random())))));
		}
		let2 = "| " + si.list() + " |";
		// Showing the result //
		System.out.println(
				"\t" + writeLetters(130) + "\n" +
				"Testing with Numbers (Integer)\n" +
				"All Objectives: \n" +
				" " + writeLetters(let2) + "\n" +
				let2 + "\n" +
				" " + writeLetters(let2) + " \n" +
				"Object on the Top:\t "+si.peek() + "\n" +
				"Removing the Objective on the Top ... \n" + popSi() +
				"Objective on the Top is now: " + si.peek() + "\n"
		);
//		JOptionPane.showMessageDialog(null, ""+new Integer(Integer.toBinaryString(23)));
		
		/* Testing with Texts */
		System.out.println(
				"\t" + writeLetters(130) + "\n" +
				"\nNow Testing with Texts (String)\n"
		);
		for(int i = 0;i < 10;++i)
		{
			ss.push("Objective"+(i+1));
		}
		let2 = "| " + ss.list() + " |";
		System.out.println(
				"All Objectives: \n" +
				" " + writeLetters(let2) + "\n" +
				let2 +  "\n" +
				" " + writeLetters(let2) + " \n" +
				"Object on the Top:\t "+ss.peek() + "\n" +
				"Removing the Objective on the Top ... \n" + popSs() +
				"Objective on the Top is now: " + ss.peek() + "\n"
		);
//		// Show Updated Objectives //
//		System.out.println(
//				"All Objectives: \n" +
//				" " + writeLetters(let2) + "\n" +
//				let2 +  "\n" +
//				" " + writeLetters(let2) + " \n" +
//				"\t" + writeLetters(130) + "\n"
//				);
	}
	/**
	 * Executes the Method pop in ss but doesn't display anything
	 * @return Empty String
	 */
	private static String popSs()
	{
		ss.pop();
		return "";
	}
	/**
	 * Executes the Method pop in si but doesn't display anything
	 */
	private static String popSi()
	{
		si.pop();
		return "";
	}
	/**
	 * Writes "-" letters as often as said in the parameter passages in an temporarity String
	 * @param passages: Size of the passages
	 * @return String filled with "-" letters as said in the parameter
	 */
	private static String writeLetters(int passages)
	{
		String tmp = "";
		for(;passages != 0;--passages)tmp+="-";
		return tmp;
	}
	private static String writeLetters(String tmp)
	{
		String tmp2 = "";
		for(int i3 = 0;i3 < tmp.length()-2;++i3)tmp2+="-";
		return tmp2;
	}
}