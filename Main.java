package Random_Gift_Suggestion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	Увага!!!
Для запуску програми необхідно здійснити такі дії:
	1. Завантажити останню версію jsoup з сайту https://jsoup.org/download
	2. Зайти в properties цього проекту
	3. Зліва натиснути Java Build Path
	4. Вибрати вкладку Libraries
	4. Справа знайти кнопку Add External JARs...
	5. Вибрати завантажений файл
	6. Натиснути Apply and Close
	7. Рефрешнути проект
*/

class Main
{
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Gift> friends = new ArrayList<>();
        friends.add(new Gift(1, "Володимир", "Рубаненко", "Чоловіча" , "вулиця1", "pochta1@gmail.com", new int[]{12,6,2001} , "+380123456789"));
        friends.add(new Gift(2, "Марія", "Чєрнова", "Жіноча", "вулиця2", "pochta2@gmail.com", new int[]{29,11,2001} , "+380987654321"));
        friends.add(new Gift(3, "Євген", "Токар", "Чоловіча", "вулиця3", "pochta3@gmail.com", new int[]{4,1,2002} , "+380192837465"));
        friends.add(new Gift(4, "Олексій", "Трощий", "Чоловіча", "вулиця4", "pochta4@gmail.com", new int[]{3,12,2000} , "+380121212121"));
        friends.add(new Gift(5, "Антон", "Рихлік", "Чоловіча", "вулиця5", "pochta5@gmail.com", new int[]{1,5,2001} , "+380666333222"));

        Gift.clean_file();
        Scanner scan = new Scanner(System.in);
        String choice;
        boolean check = true;
        List<Gift> birthdays = new ArrayList<>();
        
        for (Gift gift: Gift.list_of_birthdays(friends)) 
        {
            birthdays.add(gift);
        }

        if(birthdays.size()==0)
        {
            System.out.println("Сьогодні жоден з ваших друзів не відмічає день народження");
        }
        else 
        {
            System.out.println("Увага!\nСьогодні день народження у ваших друзів:");

            while (birthdays.size() != 0) 
            {
                System.out.println();
                System.out.println("Сьогодні відмічають свій день народження: ");
                int N = 0;
                for (Gift gift: birthdays) 
                {
                    System.out.print(N + 1 + "  ");
                    System.out.println(gift.getName() + " " + gift.getSurname());
                    N++;
                }
                
                System.out.println();
                System.out.println("Введіть номер друга або 0, щоб вийти з програми");
                choice = scan.nextLine();
                if(choice.equals("0"))
                {
                    System.exit(0);
                }
                while (check == true) 
                {
                    if(choice.equals("0"))
                    {
                        System.exit(0);
                    }
                    
                    for (int i = 1; i < N + 1; i++) 
                    {
                        if (choice.equals(Integer.toString(i))) 
                        {
                        	check = false;
                        }
                    }
                    
                    if(check == true)
                    {
                        System.out.println("Введіть номер, який є в списку.");
                        choice = scan.nextLine();
                    }
                }
                
                check = true;
                for(int i = 0 ; i  < birthdays.size() ; i++)
                {
                    if(Integer.parseInt(choice) - 1 == i)
                    {
                    	Gift.editorOfpostcard(friends.get(birthdays.get(i).getNumber() - 1));
                        Gift.editorOfpresent(friends.get(birthdays.get(i).getNumber() - 1));
                    }
                }
                birthdays.remove(Integer.parseInt(choice) - 1);
                }
            }
        }
}



