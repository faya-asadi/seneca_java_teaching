package Exceptions.UserDefined;

public class SimpleCalculator {

    public int Calculate(String operator, String operand1, String operand2){
        int result = 0;
        try {
            result = applyCalculation(operator, operand1, operand2);
        } catch (OperatorValidationException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }finally {
            return result;
        }
    }

    private int applyCalculation(String operator, String operand1, String operand2) throws OperatorValidationException {
        int intOp1 = Integer. parseInt(operand1);
        int intOp2 = Integer.parseInt(operand2);
        switch (operator){
            case "+":
                return intOp1 + intOp2;
            case "-":
                return intOp1 / intOp2;
            case "*":
                return intOp1 * intOp2;
            case "/":
                return intOp1 / intOp2;
            case "^":
                return intOp1 ^ intOp2;
            default:
                throw new OperatorValidationException(operator + "is not a vlalid operator!");
        }

    }
}
