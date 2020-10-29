package kr_OOP_4_1;

class test
{
	public static void main(String[] args)
	{	
		Text t = new Text(" ООП — наслідування Object", 
				"Створити додаток, яке задовольняє вимогам, наведеним в завданні. Спадкування\n" + 
				"застосовувати тільки втих завданнях, в яких це логічно обґрунтоване. Аргументувати\n" + 
				"приналежність класу кожного створюваного методу ікорректно перевизначити для кожного класу\n" + 
				"методи equals (), hashCode (), toString ().");
		System.out.println(t);
		
		System.out.print("\n");
		t.addToText("Qsdac sdcac scdsc. Iksan asnsan qweqwdwq.\n"
				+ "Yashdb ashjbaskj jcna. Qisdcdsiona sjkcnak asgv.");
		System.out.println(t);
	}
}