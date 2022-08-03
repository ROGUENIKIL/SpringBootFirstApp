package dataTypes;

public class SignedValues {
	
static void signedValue() {
	int i1=10; //compiler by default considering 10 as +ve value without explicit sign assignment
	int i2=20;
	int i3=i1+i2;
	int i4=+10;
	int i5=20;
	int i6=i4+i5;
	int i7=-10;
	int i8=-(-10); //will become 10
	int i9=i8-i2; //10-20
	int i10=-(-(-10)); //will become -10
	double d1=-2.344;
	double d2=+2.344;
	char c1=+65;
	//char c2=-65; -65 is -ve int value(decimal value) and there is no corresponding unicode character for -65.so type casting is impossible
	int i='A';
	int i11=-'A'; //o/p: -65.here minus sign is not considered with A by compiler because minus character is meaningless,but minus sign with number is meaningful
	char c2=(char)-'A'; //here because of minus sign compiler is considering -A as integer 
	char c3=(char)-'B';
	char c4=(char)-'a'; 
	char c5=(char)-',';
	char c6='A';
	double d3=-'A';
	//boolean b=-false;
	
	System.out.println(i3);
	System.out.println(i6);
	System.out.println(i8);
	System.out.println(i9);
	System.out.println(i10);
	System.out.println(i11);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(d3);
	
}
public static void main(String[] args) {
	signedValue();
}
}
