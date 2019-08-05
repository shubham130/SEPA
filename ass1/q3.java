class Number {
	static int obj = 0;
	int num;
	public Number(int num) {
		this.num = num;
		obj++;
	}
	@Override
	protected void finalize() throws Throwable {
		obj--;
		super.finalize();
	}
	public static void countObj() {
		System.out.println("Number of object: " + obj);
	}
	public boolean isPrime() {
		int n = num;
		if (n <= 1) {  
    		return false;  
       	}  
       	for (int i = 2; i < Math.sqrt(n); i++) {  
       	   if (n % i == 0) {
               return false;
           }
       }
       return true;
	}
	public double factorial() {
		int n = num;
		if (n == 0)
			return 0;
		double f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
	}
	public int sumOfDigit() {
		int n = num;
		int sum = 0;
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
	}
	public int reverseNum() {
		StringBuilder b = new StringBuilder(num);
		return Integer.parseInt(b.reverse().toString());
	}
	public double operate(String op, int b) {
		switch(op) {
			case "+":
				return num + b;
				break;
			case "-":
				return num - b;
			case "*":
				return num * b;
			case "/":
				return num / b;
		};
	}	
	
}
