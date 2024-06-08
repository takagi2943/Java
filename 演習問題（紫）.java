/* 
main()メソッドの定義のルールは以下の通り
public static void main(String[] args){}
・付与する修飾子は、publicかつstatic
・戻り値は　void型
・メソッド名はmain
・引数はString型の配列
上記のルールに従っている選択肢が正しい
なお、修飾子は『public static 』　『static public 』
いずれに配置しても文法上は問題はない

不正解な記述
引数がString[]ではなく、String型となっている為
public修飾子が付与されていない
static修飾子が付与されていない

メソッドの定義としては文法上問題ないため、コンパイルは成功する
main()メソッドの定義に従っていないことにより実行時エラーになる
【３】
public class Test {
  [ 1⃣ ]
    System.out.println("Hello");
  }
}

・public static void main (String[] args){
・static public void main (String[] args){
*/
// 【６】
public class Test {
  public static void main (String[] args) {
    char[] aryA = new char[5];  //　char型のaryA配列を作成し、1文字ずつ要素を格納
    
    aryA[0] ='b';
    aryA[1] ='y';
    aryA[2] ='e';
    char[] aryB = {'o', 'r','a', 'n' 'g', 'e' };  //新しいaryB配列を作成
    aryA = aryB;  //参照情報がコピーされ、aryAは、aryB配列を参照する事になる
    System.out.println(aryA);   //出力結果はorange
  }
}
/*
aryA {'b',  'y', 'e' }
aryB {'o', 'r','a', 'n' 'g', 'e' }    // !
参照情報がコピーされる
*/

// 配列の宣言として有効なもの
// 【７】
・int[] c = null;
  c = new int[5];
    //int型は基本データ型、int型の配列は参照型であるため、配列名の宣言時にnullで初期化する事は正しい
    // その後にnewによる配列の領域の確保を行っている
・int[] d = new int[5]; // 配列の宣言と領域の確保を1行で行っている
・int[] g = { 1, 2, 3 }; // 配列の初期化を行っている

/*
・配列名の宣言時に要素数の指定はできない
・配列名の宣言の際、『int b』としており、[]がないとダメ
・領域の確保の際に[]を使用しているが、その前に()を使用している為誤り
*/

// 【９】
class Test {
  public static void main(String[] args){
    int x = 3 * 7;
    int y = 10 + 11;
    if(x < y)System.out.print("x < y" + "");
    if(x > y)System.out.print("x > y" + "");
    if(x = y)System.out.print("x = y" + "");  // if文にある条件式がx = yとある
    else System.out.print("else");
  }
}

/*
ｘ、ｙ変数はint型であるためx = yの結果はｘにｙの値が代入され結果はint型の21となる
if文の条件式はboolean型になる式でなければならない
そのため、コンパイルエラーになる
もし、x==yであったら、trueが返り、x==yと表示された
*/

// 【１０】
class Test {
  public static void main(String[] args){
    int x = 0, y = 5;
    if(x++ < 0)
      System.out.println("1");
    else if (x < y)
      System.out.pirntln("2");
    else (y == 5)   // else文に条件式が指定されている為コンパイルエラーになる
      System.out.println("3");
  }
}

// elseのみの記述に変更すればコンパイル、実行ともに成功し、実行結果は2

// 【１２】
class Test {
  public static void main(String[] args) {
    Test[] ary = {new Test(), new Test() };
    int size = ary.length;  // aryの配列の数を表示
    while(size > 0) {
      System.out.print(size-- + "");
    } do;
  }
}

// 【１９】
/*
while（条件式）{}do; という記述はできない
doの記述でコンパイルエラーになる
もし、do;の記述を削除すればコンパイル、実行ともに成功する
その場合21と出力される
*/

// 【２０】
class Test {
  public static void main(String[] args) {
    for(int a = 0; a < 2; a++) {
      for(a = 5; a < 10; a++) {   // a<2がtrueの間行われる処理
        System.out.print(a);   // a<10がtrueの間行われる処理
      }
    }
  }
}
/*
a変数を０で初期化し、a<2により２に到達するまで繰り返し処理を行う
宣言したa変数に５を代入し、a<10により１０に到達するまで繰り返し処理を行う
a変数が１０になった時点で処理は終了する
そして、注目する点は、まだa<2はfalseを返していない
a++により、a変数は１１となり、a<2でfalseが帰り処理が終了する
同じ変数を使用していることで初期化で１０が入っているからfor文を抜けている
なので、一回しか出力されない
 */

// 【２１】
class Test {
  public stetic void main(String[] args){
    for(int x = 0; x++){  // for文にwhile文を入れ子にしている　式２に繰り返し条件式が指定されていない
      int y = 1;
      while(y <= 5){
        System.out.print(y++);
      }
    }
  }
}

/*
コード内でbreak文の使用がないため、無限ループになる
while条件式ではｙが６になるとfalseが帰り処理が終了するが、外側の繰り返し文に
制限が戻り、改めてｙ変数が１に初期化される
その結果無限に12345が出力される
 */

// 【２２】
class Test {
  public static void main(String[] args){
    char[] x = {'a', 'b', 'c'};  // 文字配列ｘに定義している
    char[] y = {'d', 'e'};       // 文字配列ｙに定義している 
    for(int a = 0; a < x.length; a++){  // 外側のループ
      System.out.print(x[a] + "");
      // ｘ配列の各要素を順に処理するためのループ。x.lenghtは配列ｘの長さ(3)を返すのでループは3回
      // 各繰り返しで、ｘ配列の現在の要素('x[a]')を出力

      for(int b = 0; b < y.length; b++){    // 内側のループ
        System.out.print(y[b] + "");
        // ｙ配列の各要素を順に処理するためのループ
        // 'y.length'は配列 'y'の長さ(2)を返す
        // 2回ループは繰り返される
        // 各繰り返しで、'y'配列の現在の要素('y[b]')を出力する
      }
    }
  }
}
/*
for文にfor文を入れ子にしている
a < x.length;によりa変数が３に達するまで繰り返し処理を行う
最初にaが出力する。そして、b < y.length;によりb変数が２に到達するまで繰り返し処理
adebdecdeと出力される
 */

// 【２３】
class Test {
  public static void main(String[] args){
    int x = 10;   // ｘ変数は10で初期化
    for(int y = 1; y < 3; y++){   // ループは2回繰り返される
      x++;    // 後置インクリメント　　二回目以降は12になる
      switch(x){
        case 11;  // 11と出力されbreak文がないから11 12 13と出力
          System.out.print("11");
        case 12;
          System.out.print("12");   // 12と出力されbreak文がないから12　13と出力
        case 13;
          System.out.print("13");
      }
    }
  }
}
// 実行結果は11 12 13 12 13となる


// 【２４】
class A {}
class B {}
class Test{
  public static void main(String[] args){
    A obj = new A();
    System.out.print("Test");
  }
}
/*
1つのソースファイルに複数のクラスを定義することは可能
そしてコンパイルするとソースコード内に定義したクラスごとにクラスファイル(.classファイル)は
生成される。問題文ではAクラス、Bクラス、Testクラスが定義されているため、生成されるクラスファイルは
Test.class, A.class, B.classと表示される
なお、publicなクラスは1つのソースファイルにつき、1つしか記述できない
また、publicなクラスを定義した場合、そのソースファイル名はpublicなクラスの名前と同じでなければならない
違反している場合はコンパイルエラーになる
 */

// 【２６】
/*
メソッドのシグニチャの定義として含まれるもの
シグニチャは、メソッド名、引数の型・数・並びにより、メソッドの宣言や定義を記述するもの
オーバーロードの際、コンパイラはシグニチャから実行するメソッドを判断する
戻り値の型、アクセス修飾子、引数の変数名は含まれない
シグニチャ：　メソッド名、引数の型・数・順序
*/

// 【２７】
class Test {
  public static void main(String[] args){
    int x = 100;
    x = method(x);
    // staticなmain()メソッドから、同じクラス内にあるmethod()メソッドを
    // 直接呼び出している
      System.out.println(x);
  }
  [   1⃣  ] int method(int a) {
    // mainメソッドのmethodメソッドを呼び出すにはstaticと記述する必要がある
    return a + 100;
  }
}
/*
method()メソッドはstaticでなけらばならない
 */

// 【２８】
class Test {
  String fruit;
  public void show(){
    System.out.println(fruit);
  }
  public static void main(String[] args){
    Test obj1;  // Test型の変宣言をしているが初期化していない
    Test obj2;  // Test型の変数宣言をしているが初期化していない
    obj1.fruit = "Grape";
    obj2.fruit = "Lemon";
    obj1.show();
    obj2.show();
  }
}
/*
初期化していない変数を使用しているため、ここではコンパイルエラーになる
メンバ変数はデフォルト値で初期化されるが、ローカル変数は暗黙で初期化されることはない
Test obj1;という宣言だけでは、obj1はまた値を持っていない
そのためobj1はローカル変数のままであり、どのTestクラスのインスタンスも参照しない
 */


// 【３０】
class Test {
  static String fruit = "Grape";  //static 静的変数　fruitを定義
  Test(String fruit) {  
    // コンストラクタを定義している これによりデフォルトコンストラクタは作成されない
    // 引数を取らないTest()が定義されていない
    this.fruit = fruit;   // キーワードを使用してアクセスされる変数、特定のインスタンスに属する変数 
  }                       // 静的で変数定義されているfruitをthisを使用することは適切ではない
  public static void main(String[] args) {
    Test obj1 = new Test();   // 引数を取らないコンストラクタを呼び出そうとしている
    Test obj2 = new Test("Lemon");
    System.out.println(obj1.fruit  + ":" + obj2.fruit);
  }
}
/*
TestクラスのTest(String fruit)でコンストラクタを定義している
これによりデフォルトコンストラクタは作成されない
System.out.println(obj1.furit + ":" + obj2.fruit);のコンストラクタの呼び出しは、
Test(String fruit)が合致するが、コンストラクタ呼び出しに合致するコンストラクタはない
Javaではクラスのコンストラクタはクラスのインスタンスが生成されるときに呼び出される特別なメソッド
コンストラクタの特徴
クラスメイト同じ名前を持つ：コンスト
戻り値がない：void
TestはString fruit
 */

// 【３３】
class Test {
  int method(int num1){
    return num1 * num1; // このメソッドの戻り値は int型
  }
  double method(int num2){  //double method(double num2) に変更すればオーバーロード成功
    return num2 * 0.9;  // このメソッドの戻り値は double型
  }
  public static void main(String[] args){
    int data = 10;
    Test obj =new Test();
      System.out.println(obj.method(data));   // これはint method(int num1)を呼び出す
      // System.out.println(pbj.method((double) data));  // double method(double num)が呼び出される
  }
}

/*
Testクラス内でmethod()を下記のように定義している
int method(int num1)
double method(int num2)   // int => doubleに変更されるとオーバーーロードは成功する

オーバーロードをする際は、引数の型、数、並びが異なっている必要がある
この問題文の例では、引数が全く同じであるためコンパイルエラーになる
なお、オーバーロードでは戻り値は無視されるため、同じであっても異なっていてもかまわない
*/

// 【３５】
/*
メソッドのオーバーロードを行っているクラスとして正しいもの
class Test {  // 名前の異なるメソッドを定義しているためオーバーロードとみなされない
  public void write(int a, int b){}
  public void show(){}
  }

 class Test {  // write()メソッドは戻り値を記載していないためメソッド定義として誤り
  public void write(int a, int b){}
  public write(int a){}
 }

 class Test {   // メソッド名、引数が同じメソッドを定義しているため誤り。オーバーロードでは戻り値は無視される
  ppublic void write(int a, int b){}
  public void write(int a, int b){}
 }

 class Test {   // メソッド名が同じであり、引数の数が異なっているためオーバーロードとして正しい
 public void write(int a, int b){}
 public void write(int a){}
 }
 */

// 【４０】
// MyClass.javaに記載されたクラス宣言として正しいもの 選択

public class MyClass extends java.lang.*{}  
// extendsの後は、単体クラス名もしくは、完全修飾子(パッケージ名 + クラス名)を指定しなければならないため誤り

final class MyClass{}   // 〇
// finalクラスは継承を許可しないクラスとなり、クラスの宣言としては正しい
// クラス宣言自体は正しい構文

public class MyClass{}  // 〇
// publicクラスはソースファイル名と同じにするという制限がある。問題文では、ソースファイル名がMyClass.javaとあるため正しい
// public修飾子はクラスがパッケージ外からもアクセス可能であることを意味する
// クラス宣言自体は正しい構文

private class MyClass extends Object{}
// クラス宣言にprivate修飾子は付与できないため誤り

class MyClass extends java.lang.Object{}  // 〇
// Java宣言が提供するjava.langパッケージのObjectクラスを継承したクラスは定義可能のため正しい
// extends java.lang.Objectは明示的に、Objectクラスを継承することを示しているが、これはデフォルトで行われる
// クラスう宣言自体は正しい構文


// 【４１】
// 【４２】
// 【４５】
// 【４６】
// 【４９】
// 【５０】
// 【５１】
// 【５２】
// 【５６】
// 【５８】
// 【５９】