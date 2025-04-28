package ASSIGN5_test;
import ASSIGN5.Book;
import ASSIGN5.Member;
import java.util .*;

public class test1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Book Title:");
            String title = sc.nextLine();
            System.out.println("Enter Book Author:");
            String author = sc.nextLine();
            System.out.println("Enter Book ISBN:");
            String isbn = sc.nextLine();
            Book book = new Book(title, author, isbn);
            System.out.println("Enter Member name:");
            String name = sc.nextLine();
            System.out.println("Enter Member id:");
            String memberId = sc.nextLine();
            Member member = new Member(name, memberId);
            System.out.println("-----Book Details-----");
            book.displyBook();
            System.out.println("-----Member Details-----");
            member.displyMember();
        }
}

/*
output:
Enter Book Title:
time
Enter Book Author:
RN
Enter Book ISBN:
2656
Enter Member name:
raj
Enter Member id:
555
-----Book Details-----
Book Title:time
Book Author:RN
ISBN:2656
-----Member Details-----
Member Name:raj
Member id:555

 */