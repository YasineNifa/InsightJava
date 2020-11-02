package com.company;

public class Main {

	public static void main(String[] args) {
		int score = 10000;
		int leveCompleted = 8;
		int bonus = 200;

		int x = calculatscore(score, leveCompleted, bonus);
		System.out.println(x);
	}
	public static int calculatscore ( int score, int leveCompleted, int bonus){
		return (score + (leveCompleted * bonus) + 100);
	}
}

//	int myValue = 1000;
//	// if we add 1 to maxinteger we will obtain -2147483648, it is the overflowed;
//	//If we try and put a value larger than the max value in java, or a value smaller than the min value in java, then we will get an Overflow in the case of the max value and an Underflow in the case of min
//
//	int minNumber = Integer.MIN_VALUE;
//	int maxNumber = Integer.MAX_VALUE;
//	System.out.println("Integer Maximum value " + maxNumber);
//	System.out.println("Integer Minimum value " + minNumber);
//	System.out.println("Busted Maximum value " + (maxNumber + 1));
//	System.out.println("Busted Minimum value " + (minNumber - 1));
//	int number = 2_147_483_647;// to be lisible
//	System.out.println(number);
//// byte width 8 bits
//	byte maxbyte = Byte.MAX_VALUE;
//	byte minbyte = Byte.MIN_VALUE;
//	System.out.println(maxbyte);
//	System.out.println(minbyte);
//// width 16 bits
//	short maxshort = Short.MAX_VALUE;
//	short minshort = Short.MIN_VALUE;
//	System.out.println(maxshort);
//	System.out.println(minshort);
//// int width 32 bits
////long width bits
//	long mylong = 100L;
//	long maxlong = Long.MAX_VALUE;
//	long minlong = Long.MIN_VALUE;
//	System.out.println(maxlong);
//	System.out.println(minlong);
//
//	int myintnumber = (minNumber/2);// by default following parenties we have int
//	byte mybytenumber = (byte)(minbyte/2);//casting in this case we will obtain a byte number so we must use casting
//
//
//
//
//	byte bytevar = 20;
//	short shortvar = 300;
//	int intvar = 1000;
//	int sum = (int)(intvar+shortvar+bytevar);
//	long longvar = (long)(50000 + 10*sum);
//	System.out.println(longvar);
//
//
//
//
//	int x = 6;
//	x+=1;//x++;x+=1
//	System.out.println(x);
//	x -= 1;//x--//x=x-1
//	System.out.println(x);

	// Methods

