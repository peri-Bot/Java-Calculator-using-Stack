package Calculator;

import java.util.Stack;

/**
 *
 * @author peribot
 */
public class InfixToPostFix {
     private int precedenceLevel(char op)
    {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public String postfixConversion(String input) {

            int i;
            String postfix = "";
             
            
            
            Stack<Character> stack = new Stack<Character>();

            for (i = 0; i < input.length(); i++) {
                    while (input.charAt(i) == ' ') {
                            ++i;
                    }

                    if (Character.isDigit(input.charAt(i)) || input.charAt(i)=='.') { 
                                    postfix += input.charAt(i);
                                    
                                    if (i+1 >= input.length() || !Character.isDigit(input.charAt(i+1)) && input.charAt(i+1)!='.' ) { 
                                        
                                        
                                            postfix += ' ';
                                    }
                                    
                    }else if (precedenceLevel(input.charAt(i)) != 0) {
                            while ((!stack.isEmpty()) && (precedenceLevel(stack.peek()) >= precedenceLevel(input.charAt(i))) && (stack.peek() != '(')) {
                                    postfix += stack.peek();
                                    postfix += ' ';
                                    stack.pop();
                            }

                            stack.push(input.charAt(i));
                    }else if (input.charAt(i) == '(') {
                            stack.push(input.charAt(i));
                    }else if (input.charAt(i) == ')') {
                            while (!stack.isEmpty() && stack.peek() != '(') {
                                    postfix += stack.peek();
                                    stack.pop();
                            }

                            stack.pop();
                    }
            }

            while (!stack.isEmpty()) {
                    postfix += stack.pop();
                    postfix += ' ';
            }

            return postfix;
    }
}
