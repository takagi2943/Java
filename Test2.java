// // Java SE Bronze 8-14 
// interface l1 {
//   public void display();
// }

// interface l2 {
//   public void display();
// }

// class Test2 implements l1, l2 {
//   public void display() {
//     System.out.print("hello");
//   }
// }

/*
 問題文ではインターフェースを2つ宣言している
 それらのインターフェースを実装しているのがTestクラスになる
 implementsキーワードの後には複数のインターフェースを指定することが可能である
 また、2つのインターフェースには修飾子、戻り値の型、メソッド名、引数リストが
 全く同じメソッドが宣言されているが、文法上問題はない
 したがって、コンパイルは成功する
 */

//  interface A {}
//  interface B { void b (); }
//  interface C { public void c(); }
//  abstract class D implements A, B, C {}   //抽象クラス　インターフェースで宣言されているメソッドを実装しなくても問題ない
//  class E extends D {    //　Dクラスを継承しているEクラスは具象クラスである為すべてのメソッドを実装する必要がある
//   void b() {}     //　インターフェースで宣言した抽象メソッドのアクセス修飾子は全て暗黙でpublicとなる
//                   //　void b() {} は親よりも公開範囲が狭い事によるコンパイルエラーになる
//     public void c() {}
//  }

interface Mylnter {
  public static final int VAL = 3;
  void foo(int s);
}
public class Test2 implements Mylnter {
  public static void main(String[] args) {
    int x = 5;
    new Test2().foo(++x);
  }
  void foo(int s) {
    s += VAL + ++s;
    System.out.println("s:" + s);
  }
}