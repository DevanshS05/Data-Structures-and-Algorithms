import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
	
	Scanner scanner = new Scanner(System.in);
	Random rdm = new Random();
	long counter = 0;
	while(true){
	if(counter==1000000)break;
	System.out.println(rdm.nextInt());
	counter++;
	}
	}

}
