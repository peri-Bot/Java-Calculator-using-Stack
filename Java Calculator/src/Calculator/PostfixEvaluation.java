package Calculator;

import java.util.Stack;

/**
 *
 * @author peribot
 */
public class PostfixEvaluation {
   public Double evalPostfix(String postfix)
    {
        Stack<Double> s = new Stack<>();
        String postfix2="";
        
        for (int i = 0; i < postfix.length(); i++) {
//                    while (postfix.charAt(i) == ' ') {
//                            ++i;
//                    }

                   if (Character.isDigit(postfix.charAt(i)) || postfix.charAt(i)=='.') { 
                                    postfix2 += postfix.charAt(i);
                                    
                                    if (i+1 >= postfix.length() || !Character.isDigit(postfix.charAt(i+1)) && postfix.charAt(i+1) ==' ' ) { 
                                        
                                        
                                            s.push(Double.parseDouble(postfix2));
                                            postfix2 = "";
                                    }
                   }else if(isOperator(postfix.charAt(i))){
                       switch (postfix.charAt(i)) {
                            case '+': s.push(s.pop() + s.pop());     break;
                            case '*': s.push(s.pop() * s.pop());     break;
                            case '-': s.push(-s.pop() + s.pop());    break;
                            case '/': s.push(1 / s.pop() * s.pop()); break;
                            case '^': double pow = s.pop(),value =s.pop();
                                      s.push(Math.pow(value, pow));  
                                      break;
                }
                       
                   }
        }
        
        if (!s.isEmpty()) 
            return s.pop();
        else
            return 0.0;
    }
    private static boolean isOperator(char ch) {
        return ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^';
    }
    
}
