public class Calculator{
	public static void main(String args[]){
		Calculator c = new Calculator();
			c.square(5);
			c.sum(5,6);
			c.power(5,6);
}

public static int square(int x){
	return x*x;
	}
public static int sum(int x, int y){
	return x+y;
	}
public static int power(int x, int y){
	int res = 1;
	for(;y>0;y--)
		res = res*x;
	return res;
	}

}