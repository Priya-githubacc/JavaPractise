package Java_Practise;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// 
		// byte ---> short --->
		//                       .
		//                        .
		//                         --> int ---> long ---> float ---> double
		//                        .  
		//                       .
		//           char ---->
		
		// byte (1 byte = 8 bits) --> -2^7 to +2^7-1 
		// short (2 bytes = 16 bits) --> -2^15 to +2^15-1 
		// char (2 bytes = 16 bits)
		// int (4 bytes = 32 bits) --> -2^31 to +2^31-1
		// float (4 bytes = 32 bits) --> -2^31 to +2^31-1
		// long (8 bytes = 64 bits) --> -2^63 to +2^63-1
		// double (8 bytes =64 bits) --> -2^63 to +2^63-1
		// boolean (1 bit) ------------> false(0) / true(1)
		
		//  We apply arithmetic operation between two operands a, b, the result type is always
		//  max(int, datatype of a, datatype of b)
		
		byte a=10;
		byte b=20;
		byte c=a+b; // Here it self its compiling and suggesting to change to result type to int or do type casting
		            // we can solve this issue by applying type casting...
		System.out.println(c);
		
		byte d=a++;
		System.out.println(d/0); // Though a++ means a=a+1 and it does belong to byte type, here we won't get complite err
		// because for increment/decrement operators, internal implicit type casting will be performed automatically by default 
		

	}

}
