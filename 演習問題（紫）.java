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
// Animalクラスのオブジェクトが生成されるコードとして正しいもの
Animal obj;
new Animal();   // 〇
Animal obj = new Animal();   // 〇
Animal obj = nul;
Animal obj = DOg; // new キーワードを使用していないから文法として誤り

/*
インスタンス化はnewによるコンストラクタの呼び出しによって行われる
不正解はAnimal型の変数宣言をしているだけ、インスタンス化はしていない
 */


// 【４２】
class A {
  void processA(){}
  void processB(String data){}
  int processC(int val1, doble val2){retun 0;}
  int processD(int num){retun 0;}
}
class B extends A {
  public void processA(){}  // 〇
  public void processB(String[] data){}
  int processC(int val1, float val2){retun 0;}
  int processD(int num){retun 0;}   // 〇
}

/*
オーバーライドのルールは以下の通り
・メソッド名、引数リストが全く同じメソッドをサブクラスで定義する
・戻り値は、スーパークラスで定義したメソッドが返す方と同じか、その型のサブクラス型とする
・アクセス修飾子は、スーパークラスと同じものか、それよりも公開範囲が広いものであれば使用可能

ルールに従っているのは
・public void processA(){}
・int processD(int num){retun 0;}

 */


// 【４５】
public class Bar {
  private String str1, str2;
  private String str3 = "orange";  // フィールド初期化子
  Bar(){
    [   1   ]
    // this("grape");   // Bar（Strint s）コンストラクタを呼び出す
    // str1 = "peach";  // str1 を "peach" に初期化
  }
  Bar(Strint s){
    str2 = s;     // str2 は s を初期化。ここでは s は "grape"
  }
  public void desp(){
    System.out.println(str1 + ":" + str2);  // str3も記述すると
  }
  public void main(String[] args){
    Bar obj = new Bar();
    obj.disp();    // "peach:prape:orage" が表示される
  }
}
// str1、str2の各変数を初期化するために１に入るコードとして正しいものは？
// this("grape");
//   str1 = "peach";
/*
自クラス内のコンストラクタを呼び出す場合は、this()を使用する
クラス名を使用することはできない
また、this()の呼び出しはコンストラクタ定義の先頭に記述する必要がある
 */

// 【４６】
class Test {
  int num1, num2;
  public Test(int num2){
    this.num2 = num2;
  }
  public Test(int num1, int num2){
    this.num1 = num1++;
    this(++num2);  // コンストラクタ定義の先頭に記述する必要がある
  }
  public static void main(String[] args){
    int num1 = 3;
    int num2 = 5;
    Test obj = new Test(num1, num2);
    System.out.println(obj.num1 + ":" + obj.num2);
  }
}

/*
コンパイルエラーになる
this(++num2); 
this.num1 = num1++;
上記のように逆にするとコンパイル、実行ともに成功し、実行結果は3:6になる
 */

// 【４９】
abstract class MyClassA {   // 抽象メソッド methodA()が定義されている
  public abstract void mhethodA();
  void methodB() {
    System.out.println("MyClassA#methodB");
  }
  // MyClassB クラスもこれを実装する必要がある
  public class MyClassB extends MyClassA { // MyClassAを継承している
    [  1  ]
    // public void methodA(){  // metehodA()がpublicでなければならないことに注意する
    // System.out.println("MyClass#methodA");
    //  }
  }
}

/*
なぜならMyClassBクラスでmehodA()をオーバーライドする際に、アクサス修飾子は広げることができないため
抽象メソッドで作られているため具象メソッドで実装する必要がある
抽象メソッドは本体を持たないため、サブクラスで実装する必要がある
そのため、MyClassBクラスでmethodA()を実装することでMyClassAクラスの抽象メソッドを具現化する
 */

// 【５０】
// ポリモフィズムと最も関連が深いもの
/*
スーパークラスの型で宣言した変数に、サブクラスのオブジェクトを代入すること

ポリモフィズム（多能性、多相性）は、呼び出す名前が同じであっても、実際にはオブジェクトごとに
振る舞いや動作が異なること。Javaではスーパークラスのインターフェースの型で、実際のオブジェクト
（サブクラスや実装クラスのオブジェクト）を扱うことが可能である
これにより、親の型を使用したメソッドを呼び出しであっても、オブジェクトごとに異なる機能を提供
することを実現している

【メソッドのオーバーライド】
サブクラスはスーパークラスのメソッドをオーバーライドできる
スーパークラスの型で宣言された変数がサブクラスのインスタンスを参照する場合
実際に呼び出されるメソッドはそのサブクラスのものになる

【ランタイムの振る舞いの決定】
コンパイル時ではなく実行時にメソッドの振る舞いが決定されるため、プログラムの柔軟性が向上する
プログラムの振る舞いが実行時に決定され、異なるオブジェクトに同じメソッドを呼び出すことができる

【ポリモフィックなコレクションの利用】
スーパークラスの型で宣言されたコレクションに、そのサブクラスのオブジェクトを格納できる
これにより、異なる型のオブジェクトを同じコレクションで管理できる
 */

// 【５１】
interface Foo{
  [  1  ]
}
// プログラムが正常にコンパイルするために、１に挿入するコードとして正しいもの
/*
・void methodA(String name);  // 〇
    abstract修飾子はないが、インターフェースでは実装（{}）がない場合は、
    コンパイル時に public abstract が付与されるため正しい

・public static void methodB(String name);  // X
    abstract な static メソッドは宣言できないため、実装（{}）がなく、static修飾子を
    付与するとコンパイルエラーになる
    インタフェース自体で実装を持つ静的メソッドとして扱われる
    インターフェース内のメソッドはインスタンスメソッドではなく、クラスメソッドとして扱われるため抽象メソッドではない
    インターフェースの本来の用途である
    「契約（インターフェースを実装するクラスがそのメソッドを実装すること）」とは異なるものになってしまう

・String name;    // X
    インターフェースでの変数は、public static final となるため定数となる
    そのため宣言時に初期化しておく必要がある
    フィールドの宣言
    初期値の代入がない為、コンパイルエラーになる
    
・private void methodC(int val);   // X
    private な抽象メソッドは宣言できないため、コンパイルエラーになる

・public String methodD();  // 〇
    abstract修飾子はないが、インターフェースでは実装（{}）がない場合は、
    コンパイル時に public abstract が付与されるため正しい


インターフェースにおけるメソッド宣言のルール
1. メソッドは暗黙的に public および abstract として宣言される
   ・インターフェース内のメソッドは、自動的に public および abetract として扱われる
   ・明示的に public と書かなくても、インターフェース内のメソッドは常に public になる
2. メソッド本体は含めない
   ・インターフェースのメソッドは、メソッド本体を持たない
   　これは、実装クラスにおいてそのメソッドがどのように実装されるかを定義するため

これらのルールに従うと、どちらも有効なインターフェースメソッドの宣言
void methodA(String name);
public String methodD();

 */

// 【５２】
// インタフェースの定義として正しいものを2つ選択

public interface Foo {    // 〇
  public String data = "sample";
  abstract void method(String info);
}

public interface Foo {    // 〇
  public String data = "sample";
  void method(String info);
}

public interface FOO {    // X
  abstract String data = "sample";    // 変数にabstract修飾子は付与できない
  abstract void method(String info);  // 変数にabstract修飾子は付与できない
}

public interface FOO {    // X
  private String data = "sample"; // private修飾子は付与できない
  public void method(String info);
}

// 【５６】
// コンパイルエラー
class MyClassA {
  static String data;
  public void show() {    // show() メソッドは 非staticメソッド
    System.out.println("MyClassA :" + data);
  }
}
public class MyClassB extends MyClassA {
  public static void show() { // show() メソッドがstaticとして定義している（ルール違反）
    System.out.println("MyClassB :" + data);
  }
  public static void main(String[] args) {
    MyClassA obj1, obj2;
    obj1 = new MyClassA();
    obj2 = new MyClassB();
    obj1.data = "Hello";
    obj2.data = "Bye";
    obj1.show();
    obj2.show();
  }
}

/*
MyClassBのshowメソッドがstaticとして定義されているため
MyClassBのshowメソッドはstaticメソッドであり、
非staticメソッドであるMyClassAのshowメソッドを
オーバーライドしようとしている。これはルール違反をしているから

Javaでは2つの条件を同時に満たすことはできない
1. スーパークラス（親クラス）のメソッドが非 static メソッドである場合、サブクラス（子クラス）
   のメソッドが同じシグネチャで static メソッドにすること
2. サブクラスのメソッドが static メソッドである場合、スーパークラスの同じシグネチャのメソッドが
   stataic メソッドであること

 */

// 【５８】
class MyClassA {
  public class MyClassB extends MyClassA {
    public static void main(String[] args) {
      MyClassA obj1 = new MyClassA();
      MyClassB obj2 = new MyClassB();
      MyClassB obj3 = new MyClassB()obj1; 
      // MyClassA と MyClassB は継承関係あるためコンパイルは成功
      //  obj1が参照されているのは MyClassA のためキャストに失敗し実行時エラー

      Object obj4 = (Object)obj1;
      // MyClassA はスーパークラスにjava.lang.Objectクラスを持つため
      // コンパイル、実行ともに成功する。なお、キャストを使用しないコードでも問題ない
      // Object obj = obj1;

      String obj5 = (String)obj1;
      // MyClassA と String は継承関係がないため、コンパイルエラーになる
      // キャストも含め型変換が可能なのは、継承・実装の関係がある場合

      MyClassA obj6 = (MyClassA)obj2
      // MyClassA とMyClassB は継承関係があるため、コンパイル、実行ともに成功する
      // キャストを使用しないコードでも問題ない
      // MyClassA obj6 = obj2;
    }
  }
}


// 【５９】
interface Fruit {
  int get();
}
class Lemon implements Fruit {
  public int get() { return 7; }
}
class Orange {
  public int get() { return 64; }
}
class Test {
  public static void main(String[] args) {
    Fruit[] ary = { new Lemon(), new Orange() }; 
    // Lemon クラスはFruit インターフェースの実装クラスだが、Orenge クラスは
    // Fruit インタフェースを実装していない
    // 各クラスのオブジェクトを Fruit 型の配列に格納しようとしているが、
    // Orenge オブジェクトは Fruit 型を持たないため格納不可　コンパイルエラーになる

    for(int i = 0 i < ary.length; i++) {
      System.out.print(ary[i].get() + "");
    }
  }
}