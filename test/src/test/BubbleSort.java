package test;

public class BubbleSort extends Sort {
  @Override
  public void sort() {
    int [] num = super.getNum();
    int lenght = super.getLenght();
    for (int i = lenght;i > 1; i--) {
      for (int j = 1;j < i;j++) {
        if (num[j] > num[j + 1]) {
          int t = num[j];
          num[j] = num[j + 1];
          num[j + 1] = t;
        }
      }
    }
  }
  
  /** 我的数组帮助类
   * 用于测试这个类
   * @author deng
   * @version v1.0
   */
  public static void main(String [] args) {
    BubbleSort bu = new BubbleSort();
    bu.inputdata();
    bu.sort();
    bu.printdata();
  }

}
