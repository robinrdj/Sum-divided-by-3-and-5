package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
	for (int i=0;i<1000;i++){
	    if ((i%3==0)&&(i%5==0)){
	        sum =sum+i;
	        count++;}
	    if (count==3)
                break;

    }
        System.out.println(sum);
    }
}
