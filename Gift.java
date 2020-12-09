package Random_Gift_Suggestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Gift
{
    private String name, surname, adress, email, sex, phone_number;
    private int number;
    private int[] birthday = new int[]{0,0,0};
    
    public Gift(int number , String name, String surname, String sex, String adress, String email, int birthday[], String phone_number) 
    {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.adress = adress;
        this.email = email;
        this.birthday = birthday;
        this.phone_number = phone_number;
    }
    
    public int getNumber() 
    {
        return number;
    }
    public String getName() 
    {
        return name;
    }
    public String getSurname() 
    {
        return surname;
    }
    public String getAdress() 
    {
        return adress;
    }
    public String getEmail() 
    {
        return email;
    }                     
    public String getSex() 
    {
        return sex;
    }
    public int getBirsday() 
    {
        return birthday[3];
    }
    public String getPhone_number() 
    {
        return phone_number;
    }
    public void setNumber(int number) 
    {
        number = number;
    }
    public void setName(String name) 
    {
        name = name;
    }
    public void setSurname(String surname) 
    {
        surname = surname;
    }
    public void setAdress(String adress) 
    {
        adress = adress;
    }
    public void setEmail(String email) 
    {
        email = email;
    }
    public void setSex(String sex) 
    {
        sex = sex;
    }
    public void setBirthday(int []birthday) 
    {
        birthday = birthday;
    }
    public void setPhone_number(String phone_number) 
    {
        phone_number = phone_number;
    }
    
    @Override
    public String toString() 
    {
        return "Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                ", Adress: '" + adress + '\'' +
                ", Email: '" + email + '\'' +
                ", Sex: '" + sex + '\'' +
                ", Phone: '" + phone_number + '\'' +
                ", Birthday: " + Arrays.toString(birthday);
    }
    
    public static boolean isOnlyDigits(String str) 
    {
        return str.matches("[\\d]+");
    }  
    
    public static int[] current_time() 
    {
        int [] Date_now = {0,0,0};
        Date date = new Date();
        SimpleDateFormat Format = new SimpleDateFormat("d M y");
        String []str = (Format.format(date)).split(" ");
        for(int i = 0; i < 3 ; i++)
        {
            Date_now[i] = Integer.parseInt(str[i]);
        }
        return Date_now;
    }
    
    // список людей, у кого день народження
    public static List<Gift> list_of_birthdays(ArrayList<Gift> Base_of_date) 
    {
        List<Gift> Birthdays_in_this_day = new ArrayList<>();
        int count = 0;
        for (Gift gift: Base_of_date) 
        {
            if(gift.birthday[0] == Gift.current_time()[0] && gift.birthday[1] == Gift.current_time()[1])
            {
                count++;
                Birthdays_in_this_day.add(gift);
            }
        }
        return Birthdays_in_this_day;
    }
    
    // редагування листівки
    public static void editorOfpostcard(Gift friend) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();
        String sell, edit = " ", delete, rewrite, str;
        String line;
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("Send.txt"));
        lines.add(friend.name + "Вітаю тебе з " + (Gift.current_time()[2]- friend.birthday[2]) + " днем народження.!");
        System.out.println("Привітання для " + friend.getName() + " " + friend.getSurname() + ":\n");
        
        if (friend.getSex().equals("Чоловіча")) 
        {
            Gift.postcardForBoy();
            BufferedReader reader = new BufferedReader(new FileReader("postcardForBoy.txt"));
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }
            reader.close();
        } 
        else 
        {
            Gift.postcardForGirl();
            BufferedReader reader = new BufferedReader(new FileReader("postcardForGirl.txt"));
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }
            reader.close();
        }
        
        for (int i = 0; i < lines.size(); i++) 
        {
            System.out.println(lines.get(i));
        }
        for (int i = 0; i < lines.size(); i++) 
        {
            bw.write(lines.get(i));
        }
        
        do
        {
	        System.out.println("1- Редагувати привітання, 2 - Відправити на пошту");
	        sell = scan.nextLine();
        }
        while(!sell.equals("1") && !sell.equals("2"));

        if(sell.equals("1")) 
        {
            while (!edit.equals("4")) {
                for (int i = 0; i < lines.size(); i++) 
                {
                    bw.write(lines.get(i));
                    bw.newLine();
                }
                BufferedReader reader = new BufferedReader(new FileReader("Send.txt"));
                while ((line = reader.readLine()) != null) 
                {
                    lines.add(line);
                }
                for (int i = 0; i < lines.size(); i++) 
                {
                    System.out.println(i+1 + " " + lines.get(i));
                }
                
                System.out.println("1 - Вилучити рядок, 2 - Редагувати рядок, 3 - Додати рядок, 4 - Закінчити редагування");
                edit = scan.nextLine();
                switch (edit) 
                {
                    case "1": 
                    {
                        do 
                        {
                            System.out.println("Введіть номер рядка, який необхідно видалити");
                            delete = scan.nextLine();
                        } 
                        while (Integer.parseInt(delete) < 1 || Integer.parseInt(delete) > lines.size() + 1 || !isOnlyDigits(edit));
                        lines.remove(Integer.parseInt(delete) - 1);
                        break;
                    }
                    case "2": 
                    {
                        do 
                        {
                            System.out.println("Введіть номер рядка, який необхідно переписати: ");
                            rewrite = scan.nextLine();
                        } 
                        while (Integer.parseInt(rewrite) < 1 || Integer.parseInt(rewrite) > lines.size() + 1 || !isOnlyDigits(edit));
                        System.out.println("Введіть новий рядок: ");
                        str = scan.nextLine();
                        lines.set(Integer.parseInt(rewrite)-1, str);
                        break;
                    }
                    case "3": 
                    {

                        do 
                        {
                            System.out.println("Введіть номер рядка, куди потрібно вставити новий рядок: ");
                            rewrite = scan.nextLine();
                        } while (Integer.parseInt(rewrite) < 1 || Integer.parseInt(rewrite) > lines.size() + 1 || !isOnlyDigits(edit));
                        System.out.println("Введіть новий рядок: ");
                        str = scan.nextLine();
                        lines.add(Integer.parseInt(rewrite)-1, str);

                        break;
                    }
                    case "4": 
                    {
                        break;
                    }
                    default: 
                    {
                        do 
                        {
                            System.out.println("1 - Видалити рядок, 2 - Переписати рядок, 3 - Додати рядок, 4 - Вийти з програми редагування");
                            edit = scan.nextLine();
                        } 
                        while (!edit.equals("1") && !edit.equals("2") && !edit.equals("3") && !edit.equals("4") && !isOnlyDigits(edit));
                    }
                }
            }
            
            do 
            {
                System.out.println("Надіслати листа на пошту? 1 - Так, 2 - Ні");
                sell = scan.nextLine();
            } 
            while (!sell.equals("1") && !sell.equals("2"));
            
            if (sell.equals("1")) 
            {
                System.out.println("Лист надіслано на електронну пошту з адресою: " + friend.email);
            }
        
        }
        else
        {
            System.out.println("Лист надіслано на електронну пошту з адресою: "+ friend.email);
        }
        
        BufferedReader reader = new BufferedReader(new FileReader("Send.txt"));
        while ((line = reader.readLine()) != null) 
        {
            lines.add(line);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("Friends.txt",true));
        writer.write(friend.surname + " " + friend.name);
        writer.newLine();
        writer.newLine();
        writer.write("Листівка: ");
        if(lines.size()!= 0) 
        {
            for (String i:lines) 
            {
                writer.newLine();
                writer.write(i);
            }
        }
        else
        {
            writer.write("Листівка пуста");
        }
        
        writer.newLine();
        writer.close();
    }            
    
    // рудагування подарунка
    public static void editorOfpresent(Gift friend) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        String sell, line, pres;
        
        System.out.println();
        System.out.println("Подарунок для " + friend.getName() + " " + friend.getSurname() + ":\n");
        
        if (friend.getSex().equals("Чоловіча")) 
        {
            BufferedReader reader = new BufferedReader(new FileReader("giftsForBoy.txt"));
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }
            reader.close();
        } 
        else 
        {
            BufferedReader reader = new BufferedReader(new FileReader("giftsForGirl.txt"));
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }
            reader.close();
        }
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("Friends.txt", true));
        bw.write("Подарунок:");
        System.out.println("Подарунок");
        bw.newLine();
        
        System.out.println("1 - Вибрати подарунок зі списку, 2 - Свій варіант: ");
        sell = scan.nextLine();
        switch (sell)
        {
            case "1":
            {
                for (int i = 0; i < lines.size(); i++) 
                {
                    System.out.println(i+1 + " " + lines.get(i));
                }
                    do 
                    {
                        System.out.println("Введіть номер подарунку: ");
                        pres = scan.nextLine();
                    }
                    while (Integer.parseInt(pres) <= 0 || Integer.parseInt(pres) > lines.size() || !isOnlyDigits(pres));
                    
                System.out.println(lines.get(Integer.parseInt(pres)-1));
                bw.write(lines.get(Integer.parseInt(pres)-1));
                break;
            }
            case "2":
            {
                do 
                {
                    System.out.println("Введіть свій варіант подарунка: ");
                    line = scan.nextLine();
                }
                while (line != null);
            	
                System.out.println(line);
                bw.write(line);
                break;
            }
            default:
            {
                do 
                {
	                System.out.println("1 - Вибрати один із готових подарунків, 2 - Вигадати свій:");
	                sell = scan.nextLine();
	                }
                while (!sell.equals("1") && !sell.equals("2"));
                break;
            }
        }
        bw.newLine();
        bw.newLine();
        bw.newLine();

        bw.close();
    }                           

    public static void clean_file() throws IOException 
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Friends.txt"));
        bw.write("");
        bw.close();
    }                                    

    public static void postcardForBoy() throws IOException 
    {
        Document doc = Jsoup.connect("http://pozdravok.ru/pozdravleniya/den-rozhdeniya/i/na-ukrainskom/drugu/").get();

        Elements body = doc.getElementsByAttributeValue("class", "sfst");
        String str = body.get(0 + (int) (Math.random() * 9)).text();
        BufferedWriter bw = new BufferedWriter(new FileWriter("postcardForBoy.txt"));
        char[] array = str.toCharArray();
        bw.write(array[0]);
        for (int i = 1; i < array.length-1; i++) 
        {
            if (Character.isUpperCase(array[i+1])) 
            {
                bw.write(array[i]);
                bw.newLine();
            }
            else
                bw.write(array[i]);
        }
        bw.close();
    }                                     

    public static void postcardForGirl() throws IOException 
    {
        Document doc = Jsoup.connect("http://pozdravok.ru/pozdravleniya/den-rozhdeniya/i/na-ukrainskom/podruzi/").get();
        
        Elements body = doc.getElementsByAttributeValue("class", "sfst");
        String str = body.get(0 + (int) (Math.random() * 9)).text();
        BufferedWriter bw = new BufferedWriter(new FileWriter("postcardForGirl.txt"));
        char[] array = str.toCharArray();
        bw.write(array[0]);
        for (int i = 1; i < array.length-1; i++) 
        {
            if (Character.isUpperCase(array[i+1])) 
            {
                bw.write(array[i]);
                bw.newLine();
            }
            else
                bw.write(array[i]);
        }
        bw.close();
    }                                     

}



