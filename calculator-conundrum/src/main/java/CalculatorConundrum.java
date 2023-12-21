class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
                if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

       switch(operation){
           case "+":
               String valueAdd = String.valueOf(operand1) + " " + operation + " " +String.valueOf(operand2) + " "  + "=" + " "  +String.valueOf(operand1 + operand2);
               return valueAdd;
              
            case "*":
                String valueMultiply = String.valueOf(operand1)+  " " + operation+ " " +String.valueOf(operand2) + " "  + "=" + " "  +String.valueOf(operand1 * operand2);
                return valueMultiply;
            
            case "/":
                try {
                    String valueDivide = String.valueOf(operand1) + " " + operation + " " +String.valueOf(operand2) + " " + "=" + " "  +String.valueOf(operand1 / operand2);
               return valueDivide;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
              
        
           default:
                if (operation.isEmpty()) {
                    throw new IllegalArgumentException("Operation cannot be empty");
                } else {
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                }
               
               
       }
        }
}
