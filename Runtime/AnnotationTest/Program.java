
class Program {

	public static void main(String[] args) throws Exception{
	
	double p = Double.parseDouble(args[0]);
	var c = Class.forName(args[1]);
	var obj = c.getConstructor().newInstance();	//dynamic instantiation
	var method = c.getMethod(args[2], double.class, int.class);
	int m = 10;
	for(int n=1; n<=m; ++n){
		float rate = (float)method.invoke(obj, p, n);	//late binding
		float i = rate / 1200;
		double emi = p * i / (1-Math.pow(1 + i, -12 * n));
		System.out.printf("%d\t%.2f%n", n, emi);
	}




	}

}

