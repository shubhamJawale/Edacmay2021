/*Make a class named Fruit with a data member to calculate the
number of fruits in a basket. Create two other class named
Apples and Mangoes to calculate the number of apples and
mangoes in the basket. Print the number of fruits of each type
and the total number of fruits in the basket.*/

class Fruit
{
	int Cal(int A, int B)
	{
		return A+B;
	}

}
class Apples extends Fruit
{
     int Cal(int A)
	{
		return A;
	}
}
class Mangoes extends Fruit
{
	int Cal(int B)
	{
		return B;
	}
}
class FruitBasket
{
	public static void main(String args[])
	{
		Apples A = new Apples();
		System.out.println("Apples :"+A.Cal(3));
		Mangoes M = new Mangoes();
		System.out.println("Mangoes :"+M.Cal(5));
		Fruit F = new Apples();
		System.out.println("Total number of fruits :"+F.Cal(3,5));
		
	}
}