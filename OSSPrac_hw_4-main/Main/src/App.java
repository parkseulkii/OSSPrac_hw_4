import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("이름을 입력하세요:");
    String name = sc.next();

    System.out.print("학번을 입력하세요:");
    int num = sc.nextInt();
    
    System.out.println("");
    System.out.println("<출력>");
    System.out.println("이름:"+name);
    System.out.println("학번:"+num);

    sc.close();

    }
}
