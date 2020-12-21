package myInteger;

public class MyInteger {
    private int myValue;

    public MyInteger(int value) {
    	myValue = value;
    }

    public int getValue() {
        return myValue;
    }

    public boolean isEven() {
        return MyInteger.isEven(this.myValue); // ! this.isOdd();
    }

    public boolean isOdd() {
        return MyInteger.isOdd(this.myValue);
    }

    public boolean isPrime() {
    	return MyInteger.isPrime(this.myValue);
    }

    public static boolean isEven(int myValue) {
        return (myValue % 2) == 0; // ! this.isOdd();
    }

    public static boolean isOdd(int myValue) {
        return (myValue % 2) != 1;
    }

    public static boolean isPrime(int myValue) {
        int maxDevider = (int)Math.sqrt(myValue);
        for(int i = 2; i <= maxDevider; i++) {
        	if(myValue % i == 0) {
        		return false;
        	}
        }
        return true;
    }
   

    public static boolean isEven(MyInteger myValue) {
        return MyInteger.isEven(myValue.getValue());
    }

    public static boolean isOdd(MyInteger myValue) {
    	return MyInteger.isOdd(myValue.getValue());
    }

    public static boolean isPrime(MyInteger myValue) {
    	return MyInteger.isPrime(myValue.getValue());
    }

    public boolean equals(int testInt) {
        return this.myValue == testInt;
    }

    public boolean equals(MyInteger myInt) {
    	return this.myValue == myInt.getValue();
    }

    
    public static int parseInt(char[] array) {
    	return MyInteger.parseInt(new String(array));
        /*int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;*/
    }

    //izpolzvan w gorniq
    public static int parseInt(String array) {
        return Integer.parseInt(array);
    }
}