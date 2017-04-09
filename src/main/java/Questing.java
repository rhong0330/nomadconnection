import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		// FIXME
		return (int) d/2;
	}

	static boolean quest2(String str) {
		// FIXME
		// 1. number of ({[ match )}]
		// 2. Last bracket open has to be closed first

		//http://stackoverflow.com/questions/16874176/parenthesis-brackets-matching-using-stack-algorithm
		if (str.isEmpty())
			return true;

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++)
		{
			char current = str.charAt(i);
			if (current == '{' || current == '(' || current == '[')
			{
				stack.push(current);
			}


			if (current == '}' || current == ')' || current == ']')
			{
				if (stack.isEmpty())
					return false;

				char last = stack.peek();
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return false;
			}

		}

		return stack.isEmpty();
	}
}
