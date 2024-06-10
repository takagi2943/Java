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
class Test {
  public static void main(String[] args) {
    int x = 10;
    int y = (x = 3) + x;
      System.out.println(x + "" + y);
  }
}
/*
まず、(x = 3)が処理され、ｘは3となる
そして、3 + x の処理により、6が代入される
したがって実行結果は 3 6 になる
 */


// 【２０】
class Test {
  public static void main(String[] args) {
    for(int a = 0; a < 2; a++) {
      for(a = 5; a < 10; a++) {
        System.out.print(a);
      }
    }
  }
}

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
class Test {
  public static void main(String[] args) {
    char[] x = {'a', 'b', 'c'};
    char[] y = {'d', 'e'};
    for(int a = 0; a < x.length; a++) {
      System.out.print(x[a] + "");
    }
    for(int a = 0; b < y.length; b++) {
      System.out.print(y[b] + "");
    }
  }
}

/*
for 文に for 文を入れ子にする
a < x.lenght により a 変数が3に達するまで繰り返し処理を行う
1回目 a d e
2回目 b d e
3回目 c d e
実行結果 adebdecde
 */

// 【２８】
class Test {
  String fruit;
  public void show() {
    System.out.println(fruit);
  }
  public static void main(String[] args) {
    Test obj1;
    Test obj2;
    obj1.fruit = "Grape";
    obj2.fruit = "Lemon";
    obj1.show();
    obj2.show();
  }
}

/*
Test 型を宣言しているが初期化をしていない
初期化していない変数を使用しているためここでは、コンパイルエラーになります。
メンバ変数はデフォルト値で初期化されるが、ローカル変数は暗黙で初期化されることはない
ローカル変数は使用する前に明示的に初期化しておく必要がある
 */

// 【３０】
class Test {
  static String fruit = "Grape";
  Test(String fruit) {
    this.fruit = fruit;
  }
public static void main(String[] args) {
  Test obj1 = new Test();
  test obj2 = new Test("Lemon");
  System.out.println(obj1.fruit + ":" + obj2.fruit);
}
}

/*
Test クラスの3行目でコンストラクタを定義している
これによりデフォルト
 */

// 【４０】
// 【４１】
// 【４５】
// 【５１】
// 【５２】
// 【５６】
// 【５８】
// 【５９】