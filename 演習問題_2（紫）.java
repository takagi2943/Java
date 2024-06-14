// 【７】
// 配列の宣言として有効なもの
// ・int[] c = null;
//       c = new int[5];

// ・int[] d = new int[5];

// ・int[] g = {1, 2. 3};
/*
int a[5];   配列の宣言前に配列の指定はできない
int b = new int[5];   []がないからダメ
int[] f = new int()[5];   領域確保に[]を使用しているが()を使用しているから誤り
*/

// 【９】
// class Test {
//   public static void main(String[] args) {
//     int x = 10;
//     int y = (x = 3) + x;
//       System.out.println(x + "" + y);
//   }
// }
/*
まず、(x = 3)が処理され、ｘは3となる
そして、3 + x の処理により、6が代入される
したがって実行結果は 3 6 になる
 */


// 【２０】
// class Test {
//   public static void main(String[] args) {
//     for(int a = 0; a < 2; a++) {
//       for(a = 5; a < 10; a++) {
//         System.out.print(a);
//       }
//     }
//   }
// }

/*
a変数を0で初期化し、a<2により2に達するまで繰り返しを行う
内側のfor文で宣言したa変数に5を代入し、a<10により10に達するまで繰り返し処理を行う
つまり、56789が出力される
a変数が10になった時点で、内側のfor文は終了する
そして、注意する点は、まだ外側のfor文はfalseを返していないから、制御が内側に戻るが、
内側のfor文ではa変数は11となっているのでa<2でfaoseが返り内側の処理は終了する
したがって、実行結果は56789が一回のみ出力される
 */

// 【２２】
// class Test {
//   public static void main(String[] args) {
//     char[] x = {'a', 'b', 'c'};
//     char[] y = {'d', 'e'};
//     for(int a = 0; a < x.length; a++) {
//       System.out.print(x[a] + "");
//     }
//     for(int a = 0; b < y.length; b++) {
//       System.out.print(y[b] + "");
//     }
//   }
// }

/*
for 文に for 文を入れ子にする
a < x.lenght により a 変数が3に達するまで繰り返し処理を行う
1回目 a d e
2回目 b d e
3回目 c d e
実行結果 adebdecde
 */

// 【２８】
// class Test {
//   String fruit;
//   public void show() {
//     System.out.println(fruit);
//   }
//   public static void main(String[] args) {
//     Test obj1;
//     Test obj2;
//     obj1.fruit = "Grape";
//     obj2.fruit = "Lemon";
//     obj1.show();
//     obj2.show();
//   }
// }

/*
Test 型を宣言しているが初期化をしていない
初期化していない変数を使用しているためここでは、コンパイルエラーになります。
メンバ変数はデフォルト値で初期化されるが、ローカル変数は暗黙で初期化されることはない
ローカル変数は使用する前に明示的に初期化しておく必要がある
 */

// 【３０】
// class Test {
//   static String fruit = "Grape";  // static で定義しているため静的になる‼
//   Test(String fruit) {    // コンストラクタを定義！
//     this.fruit = fruit;
//   }
// public static void main(String[] args) {
//   Test obj1 = new Test();   // デフォルトコンストラクタを召喚しようとしているがそもそもない
//   test obj2 = new Test("Lemon");    // コンストラクタの呼び出しに成功
//   System.out.println(obj1.fruit + ":" + obj2.fruit);
//   }
// }

/*
デフォルトコンストラクタを呼び出そうとしているためコンパイルエラーになる！
Test クラスの3行目でコンストラクタを定義している
これによりデフォルトコンストラクタは作成されない
Test(){}
と記述するとコンパイル・実行ともに成功する
static で変数を指定しているため静的になるためこれにより固定されるのでLemonで上書きされる
実行結果は Lemon : Lemon
 */

// 【４０】
// MyClass.java に記載されたクラス宣言として正しいものはどれですか？3つ答えよ
// ・public class MyClass extends java.lang.*{}  // x
  // extends の後は、単体のクラス名もしくは。完全修飾名(パッケージ名 + クラス名)を
  // 指定しなければならない為誤り

// ・final class NyClass {}    // 〇
  // final クラスは継承を許可しないクラスとなり、クラスの宣言としては正しい

// ・public class MyClass {}   // 〇
  // public クラスはソースファイル名と同じにするという制限がある
  // 問題文では、ソースファイル名が MyClass.java とあるため正しい

// ・private class MyClass extends Object{}  // x
  // クラス宣言に private 修飾子は付与できない為、誤り

// ・class MyClass extends java.lang.Object{}  // 〇
  // Java 言語が提供する　java.lang パッケージの Object クラスを継承したクラスは定義可能のため正しい


// 【４１】
// class Animal {}
// class Dog extends Animal {}

// // Animal クラスのオブジェクトが生成されるコードとして正しいコードは？2つ選択
// ・ Animal obj;
// ・ new Animal();  // 〇
// ・ Animal obj = new Animal();   // 〇
// ・ Animal obj = null;
// ・ Animal obj = Dog;  // new キーワードを使用していないため文法として誤り

/*
インスタンス化は new によるコンストラクタの呼び出しによって行われる
不正解は Animal 型の変数宣言をしているだけ、インスタンス化はしていない
 */

// 【４５】
// public class Bar {
//   private String str1,str2;
//   private String str3 = "orenge"; // フィールドの初期化子
//   Bar() {
//     [  1  ]
//     this("grape");  // Bar（String s)コンストラクタを呼び出す
//       str1 = "peach";  // str1 を "peach" に初期化
//   }
//   Bar(String s) {
//     str2 = s;   // str2 は s を初期化。ここでは s は "grape"
//   }
//   public void disp() {
//     System.out.println(str1 + ":" + str2);
//   }
//   public static void main(String[] args) {
//     Bar obj = new Bar();
//     obj.disp();
//   }
// }

/*
str1, str2の各変数を初期化するために1に入るコードとして正しいものは
this("grape");
  str1 = "peach";
自クラス内のコンストラクタを呼び出す場合は、this()を使用する
クラス名を使用することはできない
また、this()の呼び出しはコンストラクタ定義の先頭に記述する必要がある
 */


// 【５１】
// interface Foo {
//   [  1  ]
// }

// // プログラムが正常にコンパイルするために、１に挿入するコードとして正しいものは？
// ・ void methodA(String name);
//   // abstract 修飾子の付与はないが、インターフェースでは実装({})がない場合は、
//   // コンパイル時に public abstract が付与される為正しい
// ・ public String methodD();

// // 【５２】
// // インターフェースの定義として正しいものはどれ？
// public interface FOO {
//   public String data = "sample";
//   abstract void method(String info);
// }

// public interface Foo {
//   public String data = "sample";
//   void method(String info);
// }

// 変数に abstract 修飾子は付与できない
// インタフェースでは、変数に private 修飾子は付与できない

// 【５６】
// class MyClassA {
//   static String data;
//     public void show() {
//       System.out.println("MyClassA :" + data);
//     }
//   }
//   public class MyClassB extends MyClassA {
//     public static void show() {
//       System.out.println("MyclassB :" + data);
//     }
//     public static void main(String[] args) {
//       MyClassA obj1, obj2;
//       obj1 = new MyClassA();
//       obj2 = new MyClassB();
//       obj1.data = "Hello";
//       obj2.data = "Bye";
//       obj1.show();
//       obj2.show();
//     }
//   }
// }

/*
MyClassB の show メソッドが static として定義されている
MyClassB の show メソッドは static メソッドであり、
非 static メソッドである MyClassA の show メソッドを
オーバーライドしようとしている為、これはルール違反をしているから

Java では2つの条件を同時に満たすことはできない
1. スーパークラス（親クラス）のメソッドが非 static メソッドである場合
  サブクラス(子クラス)のメソッドが同じシグネチャで static メソッドであること
2. サブクラスのメソッドが static メソッドである場合、スーパークラスの同じシグネチャのメソッドが
  static メソッドであること
 */

// 【５８】
// コンパイルエラーが発生するのは何行目か？
// class MyClassA {}
// public class MyClassB extends MyClassA {
//   public static void main(String[] args) {
//     MyClassA obj1 = new MyClassA();
//     MyClassB obj2 = new MyClassB();
//     MyClassB obj3 = (MyClassB)obj1; 
//     // MyClassA と MyClassB は継承関係があるため、コンパイルは成功する
//     // しかし、obj1 が参照しているのは MyClassA オブジェクトであるため、
//     // 実行時に キャストに失敗し実行時エラーになる
//     Object obj4 = (Object)obj1;
//     // MyClassA はスーパークラスに java.lang.Object クラスを持つため。コンパイル、
//     // 実行ともに成功する。なお、キャストを使用しないコードでも問題ない
//     // Object obj4 = obj1;
//     String obj5 = (String)obj1;
//     // MyClassA と String は継承関係がないため、コンパイルエラーとなる
//     // キャストも含め型変換が可能なのは、継承・実装の関係がある場合
//     MyClassA obj6 = (MyClassA)obj2;
//     // MyClassA と MyClassB は継承関係があるため、コンパイル、実行ともに成功する
//     // なの、キャストを使用しないコードでも問題ない
//     // MyClassA obj6 = obj2;
//   }
//  }



// 【５９】
// interface Fruit {
//   int get();
// }
// class Lemon implements Fruit {
//   public int get() { return 7; }
// }
// class Orange {
//   public int get() { return 64; }
// }
// class Test {
//   public static void main(String[] args) {
//     Fruit[] ary = { new Lemon(), new Orange() };
//     for(int i = 0; i < ary.lenght; i++ ) {
//       System.out.print(ary[i].get() + "");
//     }
//   }
// }

/*
コンパイル、実行した結果として正しいもの
Lemon クラスは Fruit インタフェースの実装クラスですが、Orange クラスの定義内容は
Fruit インタフェースを実装していない。Lemon クラス、Orange クラスの定義内容は文法上誤りはない、
コンパイルは成功する。しかし、Test クラスで
Fruit[] ary = { new Lemon(), new Orange() };
各クラスのオブジェクトを Fruit 型の配列に格納しようとしているが、Orange オブジェクトは
Fruit 型を持たないため格納できない
12行目でコンパイルエラーになる
 */