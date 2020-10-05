
import acm.program.ConsoleProgram;

public class Fibo extends ConsoleProgram{
	private static final int MAX_TERM_VALUE=10000;
	
	public void run() {
		println("This program lists the Fibonacci sequence");
		int i=0;
		int j=1;
		int k=0;
		
		while (i<MAX_TERM_VALUE) {
			println(i);
			k=i+j;
			i=j;
			j=k;	
		}
		
	}
}

