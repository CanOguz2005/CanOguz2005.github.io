import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("enter your bodyweight to get what your daily protein intake should be");
    double abc = 0.0;
    double ac = 0.0;
    Scanner Scanner = new Scanner(System.in);
    double weight = Scanner.nextInt();
    System.out.println("you should consume " + weight*1.1 + " grams of protein");
    System.out.println("do you use creatine if so enter yes otherwise enter no");
    Scanner a = new Scanner(System.in);
    String b = a.nextLine();
    if (b.equals("yes") ){
System.out.println("you should take " + weight*30/1000 +1+ "grams of creatine per day");
      }
    System.out.println("do you want to calculate your max bench press, deadlift or squat");
    Scanner d = new Scanner(System.in);
    String e = d.nextLine();
    if (e.equals("yes") ){
      System.out.println("enter the maximum weight you can do 5 reps at");
    Scanner g = new Scanner(System.in);
    double f = g.nextInt();
      System.out.println("your maximum lift is " + (f * 1.1307 + 0.6998));
      }
    System.out.println("now do you want to know how many calories you need");
      Scanner ab = new Scanner(System.in);
    String ae = ab.nextLine();
    if (ae.equals("yes") ){
      System.out.println("enter height");
      ac = ab.nextInt();
      System.out.println("enter age");
      double ak = ab.nextInt();
      System.out.println("enter your body fat percentage out of a 100 like by saying 13 if you dont know enter 0");
      double abde = ab.nextInt();
    if (abde!=0){
      abc = 21.6*(1-(abde/100))*weight + 370.0;
      System.out.println("your maintanince calories are " + abc);
      }
      else{
      System.out.println("your maintanince calories are");
      abc = (13.397*weight) + (4.799*ac) - (5.677*ak) + 88.362;
      System.out.println(abc);
}
      double bulk = abc+300;
      double cut = abc-300;
      System.out.println("if you want to gain weight you should eat " + bulk +" if you want to lose weight you should eat " + cut);
      }
      System.out.println("do you want to know you ideal body weight?");
        Scanner abcde = new Scanner(System.in);
        String aaa = abcde.nextLine();
    if (aaa.equals("yes") ){
      if(ac>0)
      System.out.println(52+(ac-152)*0.74803149606);
        }
      else
      System.out.println("enter height");
      double abbb = abcde.nextInt();
      System.out.println(52+(abbb-152)*0.74803149606);
      
    }
    }
  
