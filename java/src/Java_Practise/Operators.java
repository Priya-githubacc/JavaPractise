package Java_Practise;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic operators
				int i=50;
				System.out.println(i/2);
				System.out.println(i%2);
				
		// Relational operators
				System.out.println('a'>112);
				System.out.println('a'=='b');
				System.out.println('a'<100);
				System.out.println('a'>'A');
				System.out.println(10<20);
				//System.out.println(10<20<30);
				//System.out.println("Priya">"Bharath"); 
				// For object types we can't do comparison
				
        // Relational/ Comparison / Conditional operators
				//EXAMPLE 1 ;;
				String a=("Priya"); 
				String b=("Priya"); 
				String c=("Priya123");
				
				System.out.println("");
				System.out.println(a==b);
				System.out.println(a==c);
				
				//EXAMPLE 2 ;;
				String s1=new String("Priya");
				String s2=new String("Priya");
				System.out.println(s1==s2);
				System.out.println(s2.equals(s1));
				
		// SHORT CIRCUIT OPERATORS
				System.out.println("Example for shor circuit operators");
				int x=10, y=15;
				// Using single &(AND) operator, here when we use single &{AND) operator, 
				// it will check both the conditions of IF condition, though the first condition/argument is TRUE
				// Here time taking as it is evaluating both the arguments, so performance is relatively slow compared to &&
				// but applicable for both BOOLEAN and INTEGER types
				if(++x<10 & ++y>15) {
					x++;
				}else
				{
					y++;
				}
				System.out.println("X and Y values when using '&' (SINGLE AND operator)"+"  "+"X is... "+x+"...."+"Y is ..."+y);
	
				
				// EXAMPLE for && operator
				int x1=10, y1=15;
				// Using single &&(DOUBLE AND) operator, here when we use single &&{DOUBLE AND) operator, 
				// it will check first condition first, if the first condition is TRUE then only it evaluats the second
				// condition, b/c && works if both the conditions are TRUE, if condition is false means, its anyhow goes to else block
				// Here no time taking as it is evaluating both the arguments when 1st condition is TRUE, so performance is relatively HIGH compared to &
				// Applicable to BOOLEAN type only
				if(++x1<10 && ++y1>15) {
					x1++;
				}else
				{
					y1++;
				}
	
				System.out.println("X1 and Y1 values when using '&&' (DOUBLE AND operator)"+"  "+"X1 is... "+x1+"...."+"Y1 is ..."+y1);
	
				// EXAMPLE for SINGLE | operator
				int x2=10, y2=15;
				
				if(++x2<10 | ++y2>15) {
					x2++;
				}else
				{
					y2++;
				}
	
				System.out.println("X2 and Y2 values when using '&&' (DOUBLE AND operator)"+"  "+"X2 is... "+x2+"...."+"Y2 is ..."+y2);
	
				
				// EXAMPLE for DOUBLE || operator
				int x3=10, y3=15;
			    if(++x3<10 || ++y3>15) {
					x3++;
				}else
				{
					y3++;
				}
	
				System.out.println("X3 and Y3 values when using '&&' (DOUBLE AND operator)"+"  "+"X3 is... "+x3+"...."+"Y3 is ..."+y3);
	
	
	
	}	
}
