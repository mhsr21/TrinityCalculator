package edu.trinity;

public class RPNCalculator {
    public static double evaluate(String expr) {
        MyStack<Double> stack = new MyStack<Double>();
        double ans = 0;
        double temp = 0;
        String[] tokens = expr.split(" ");
        for(int i = 0; i < tokens.length; i++) {
            if (isDouble(tokens[i])) stack.push(Double.parseDouble(tokens[i]));
            else {
                switch(tokens[i]) {
                    case "+":
                        temp = stack.pop();
                        temp = stack.pop() + temp;
                        stack.push(temp);
                        break;
                    case "-":
                        temp = stack.pop();
                        temp = stack.pop() - temp;
                        stack.push(temp);
                        break;
                    case "*":
                        temp = stack.pop();
                        temp = stack.pop() * temp;
                        stack.push(temp);
                        break;
                    case "/":
                        if (stack.peek() == 0) throw new IllegalArgumentException();
                        temp = stack.pop();
                        temp = stack.pop() / temp;
                        stack.push(temp);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        while(stack.getSize() != 1) stack.pop();
        return stack.pop();
    }

    private static boolean isDouble(String str) {
        try { Double.parseDouble(str); }
            catch (NumberFormatException e) { return false; }
        return true;
    }
}
