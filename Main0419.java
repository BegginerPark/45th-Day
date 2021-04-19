// import java.util.Scanner;
class Main {

  // static int Euclid1(int x, int y) {
  //   while(true) {
  //     if (y == 0)
  //       return x;
  //     else {
  //       int t;
  //       t = x;
  //       x = y;
  //       y = t % y;
  //     }
  //   }
  // }

  // 재귀 함수 사용
  // static int Euclid2(int x, int y){
  //   if (x % y == 0) {
  //     return y;
  //   } return Euclid2(x, x%y);

  // }

  // do while 사용
  static int Euclid (int x, int y) {
    int t = x % y;
    do {
      x = y;
      y = t;
      t = x % y;  
    } while (t != 0);
  }

  public static void main(String[] args) {
    // int finger = 10;
    // System.out.printf("finger = [%5d]%n", finger);
    // System.out.printf("finger = [%-5d]%n", finger);
    // System.out.printf("finger = [%05d]%n", finger);

    // Scanner sc = new Scanner(System.in);

    
    // System.out.print("두자리 정수를 하나 입력해주세요. ");
    // String input = sc.nextLine();
    // int num = Integer.parseInt(input);
    
    // System.out.println("입력내용 : " + input);
    // System.out.printf("num = %d%n", num);

    System.out.println("최대 공약수는 " + Euclid(12,8));
    System.out.println("최대 공약수는 " + Euclid(221,143));

    // System.out.println("최대 공약수는 " + Euclid1(12,8));
    // System.out.println("최대 공약수는 " + Euclid1(221,143));

    // System.out.println("최대 공약수는 " + Euclid2(12,8));
    // System.out.println("최대 공약수는 " + Euclid2(221,143));
  }
}