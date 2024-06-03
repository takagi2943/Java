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

public class Test {
  [ 1⃣ ]
    System.out.println("Hello");
  }
}

・public static void main (String[] args){
・static public void main (String[] args){
*/

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
ｘ、ｙ変数はint型であるためｍx = yの結果はｘにｙの値が代入され結果はint型の21となる
if文の条件式はboolean型になる式でなければならない
そのため、コンパイルエラーになる
もし、x==yであったら、trueが返り、x==yと表示された
*/

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


class Test {
  public static void main(String[] args) {
    Test[] ary = {new Test(), new Test() };
    int size = ary.length;  // aryの配列の数を表示
    while(size > 0) {
      System.out.print(size-- + "");
    } do;
  }
}

/*
while（条件式）{}do; という記述はできない
doの記述でコンパイルエラーになる
もし、do;の記述を削除すればコンパイル、実行ともに成功する
その場合21と出力される
*/

