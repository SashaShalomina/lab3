import java.io.PrintStream;
import java.util.Scanner;
public class Test {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        Account p1 = new Account("sasha","privet", 76);
        Account p2 = new Account("mama","syp", 3475);
        Account p3 = new Account("papa","molotok", 36);
        Account p4 = new Account("babushka","pirogi", 3476);
        Account p5 = new Account("dedushka","garazh", 6);

        Account [] people= new Account[5];
        people[0]=p1;
        people[1]=p2;
        people[2]=p3;
        people[3]=p4;
        people[4]=p5;

        Posts p=new Posts(people);
        //out.println(p); //проверка метода 1-вывод постов в обратном порядке

        Account p6 = new Account("mama","kotleta", 123);
        p.addPerson(p6);// провекра метода 2 - добавление поста

        p.addLiketoPerson(6); // проверка метода 3 - добавление лайка посту
        //out.println(p);

        int like= p.getLikeofPerson(3); // проверка метода 4 - возврат количества лайков у поста
        //out.println(like);

        p.delitePost(4); // проверка метода 5 - удаление поста по номеру
        out.println(p);

        //p.moreLikethen(100);// проверка метода 6 - вывод постов с лайками больше указанного числа

        //out.println(p.themostPopularPost()); // проверка метода 7 - вывод самого популярного поста

        //p.postwithSemiA("mama");// проверка метода 8 - посты определённого автора

        //p.deliteAforN("mama",1);
        //out.print(p);// проверка метода 9 - удаление поста по автору и номеру

        //p.deliteAvtor("mama");
        //out.println(p); // проверка метода 10 - удаление всех постов автора

        out.println(p.sumLikeofAvtor("mama"));// проверка метода 11 - суммарное количество лайков автора

        out.println(p.allAvtors());// проверка метода 12 - список авторов сверху вниз

        out.println(p.theMostPopularAvtor());// проверка метода 13 - автор с наибольшим количеством лайков
    }
}
