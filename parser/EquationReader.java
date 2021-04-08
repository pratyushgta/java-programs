package parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * double evaluate(String eqn, double x) takes an equation in x and y in the form y=c_1 + c_2+ c_3... + c_n and a value for x and returns the value of y.
 * This algorithm is made by BoltonB07.
 * @author BoltonB07
 * @version 0.1.2 (24/7/2020)
 */
public class EquationReader {
    double evaluate(String eqn,double x){
        eqn=eqn.replaceAll(" ",""); //Gets rid of all spaces //vv
        StringBuffer sb=new StringBuffer(eqn); //Assuming eqn is in y=c_1 + c_2+ c_3... + c_n form (for now at least.)
        int j;
        String coefft;
        double termValue;
        double yIs=0.0d;
        boolean isExponent=false;
        char[] symbols={'+','-','=','*','/','^','(',')'};
        for(int i=2;i<=sb.length()-1;i++){
            if(sb.charAt(i)=='x'){
                /*j=i; //Problem in next line: where x=5, 2x^2 = garbage
                while(j-1!=-1&&sb.charAt(j-1)!='='&&sb.charAt(j-1)!='+'&&sb.charAt(j-1)!='-'&&sb.charAt(j-1)!='/'&&sb.charAt(j-1)!='*'&&sb.charAt(j-1)!='^'&&sb.charAt(j-1)!='('&&sb.charAt(j-1)!=')') {
                    /*if(sb.charAt(j+1)=='^') {
                        isExponent=true;break;
                    j--;
                }
                coefft=sb.substring(j,i);
                /*if(isExponent){
                        sb.replace(j, i + 1, "(" + x + ")");
                }
                else if(coefft.length()!=0) {
                    sb.replace(j,i+1, "("+ x +")");
                }
                else{
                    sb.replace(j,i+1, String.valueOf(x));
                }
                */
                sb.replace(i,i+1,"("+x+")");
                //isExponent=false; //Re-initializing values for the next iteration.
            }
        }
        System.out.println("Step 1: "+sb);
        for(int i = sb.length() - 1; i > 1; i--){
            if(sb.charAt(i)=='('){
                if(Character.isDigit(sb.charAt(i-1))){
                    sb.insert(i,"*");
                }
            }
        }
        System.out.println("Step 2: "+sb);
        for(int i = sb.length() - 1; i > 1; i--){
            if(Character.isLetter(sb.charAt(i))&&sb.charAt(i)!='x'){
                if(Character.isDigit(sb.charAt(i-1))){
                    sb.insert(i,"*");
                }
            }
        }
        /*for(int i = sb.length() - 1; i > -1; i--){
            if(sb.charAt(i)=='('){
                j=i;
                while(j>=0&&sb.charAt(j-1)!='='&&sb.charAt(j-1)!='+'&&sb.charAt(j-1)!='-'&&sb.charAt(j-1)!='/'&&sb.charAt(j-1)!='*'&&
                        sb.charAt(j-1)!='^'&&sb.charAt(j-1)!='('&&sb.charAt(j-1)!=')'){
                    j--;
                }
                coefft=sb.substring(j,i);
                if(!(coefft.equalsIgnoreCase("sin")||coefft.equalsIgnoreCase("cos")||coefft.equalsIgnoreCase("tan")||
                        coefft.equalsIgnoreCase("sqrt")||sb.charAt(i-1)=='('||sb.charAt(i-1)=='+'|| sb.charAt(i-1)=='-'||
                        sb.charAt(i-1)=='*'||sb.charAt(i-1)=='/')){
                    if(!((sb.charAt(i-1)>64&&sb.charAt(i-1)<91)||(sb.charAt(i-1)>96&&
                            sb.charAt(i-1)<120)||(sb.charAt(i-1)>120&&sb.charAt(i-1)<123))) {
                        sb.insert(i, "*");
                    }
                }
            }
        }*/
        /*
        for(int i = sb.length() - 1; i > 2; i--){
            if((Character.isLetter(sb.charAt(i-1))&&sb.charAt(i-1)!='x')) {
                if (Character.isDigit(sb.charAt(i-1))) {
                j = i;
                while (j > 1 && sb.charAt(j - 1) != '=' && sb.charAt(j - 1) != '+' && sb.charAt(j - 1) != '-' && sb.charAt(j - 1) != '/' && sb.charAt(j - 1) != '*' &&
                        sb.charAt(j - 1) != '^' && sb.charAt(j - 1) != '(' && sb.charAt(j - 1) != ')') {
                    j--;
                }
                coefft = sb.substring(j, i);
                if (!(coefft.isEmpty())) {
                    sb.insert(i, "*");
                }
                }
            }
        }
         */
        for(int i=0;i<=sb.length()-1;i++){    //Assuming that the equation is in y=c_1 + c_2+ c_3... + c_n form.
            if(sb.charAt(i)=='=')
                yIs=Calculate.eval(sb.substring(i+1));
        }
        return yIs;
    }
    void test(){
        StringBuilder b=new StringBuilder("Apples");
        System.out.println(b.charAt(-1));
    }


    public static void main(String[] args) throws IOException {
        EquationReader o = new EquationReader();
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an equation in the form of y=m_1x+...+m_nx+c_1+...+c_n:");
        String eqn=buff.readLine();
        System.out.println("Enter a value for x:");
        double x= Double.parseDouble(buff.readLine());
        System.out.println("\n"+eqn+" where x="+x);
        double i =o.evaluate(eqn,x);
        System.out.println("y="+i);
    }


/**
 * This algorithm and program is by 'Boann'. Link to their profile on stackoverflow: https://stackoverflow.com/users/964243/boann
 * Link to the stackoverflow page I found the algorithm on: https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form
 * @author Boann
 * Note: Slight modifications to the original code has been made for optimization.
 */

static class Calculate {
    static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}
}
    