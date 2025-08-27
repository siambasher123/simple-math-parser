package your.package.name; // <-- change this to match the existing package, or remove if there's none

public class Expression {
    private String expression;

    // Constructor
    public Expression(String expression) {
        this.expression = expression;
    }

    // Getter
    public String getExpression() {
        return expression;
    }

    // Setter
    public void setExpression(String expression) {
        this.expression = expression;
    }

    // Method to display the expression
    public void printExpression() {
        System.out.println("Expression: " + expression);
    }
}
