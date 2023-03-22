package day13;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
//		int a = 100; // Primitive variable
//		System.out.println(a);
		
//		Integer a1 = 100;
//		System.out.println(a1);
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;
		
//		Convert primitives into objects : Autoboxing
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Character charobj = c;
		Boolean boolobj = b2;
		
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Char object: " + charobj);
		System.out.println("Boolean object: " + boolobj);
		
//		Converting objects to primitives : Unboxing
		
		byte bytevalue = byteobj.byteValue();
		short shortvalue = shortobj.shortValue();
		int intvalue = intobj.intValue();
		long longvalue = longobj.longValue();
		float floatvalue = floatobj.floatValue();
		char charvalue = charobj.charValue();
		boolean boolvalue = boolobj.booleanValue();
		
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
		
//		
		int phoneNo = 12312387;
		
		
		
		
	}
}
