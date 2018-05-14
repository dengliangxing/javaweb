package test;

import java.util.Scanner;

public abstract class Sort {
  private int[] num = new int[1000];
  private int lenght;
  
  void inputdata() {
    System.out.println("要输排序的个数");
    Scanner input = new Scanner(System.in);
    lenght = input.nextInt();
    System.out.println("输入排序的数");
    for (int i = 1;i <= lenght; i++) {
      num[i] = input.nextInt();
    }
  }
  
  void printdata() {
    for (int i = 1;i <= lenght;i++) {
      System.out.println(num[i]);
    }
  }
  
  abstract void sort();
  
  public int[] getNum() {
    return num;
  }
  
  public int getLenght() {
    return lenght;
  }

}
