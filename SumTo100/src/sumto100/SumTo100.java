package sumto100;

/*
This program adds the numbers 1 through 100
*/
class SumTo100 {
public static void main(String[] args) {
	int num=0;//declare some variables
	int total=0;
	int count;
	for (count=1; count<=100; count++) {
		num++;
		total = total + num;
	}
	System.out.println
("The sum of the numbers 1 through 100 is " +
total);
}
}