/*
変数

変数はデータの入れ物
変数名のルール　3つがある
  -1文字目
    英字(a~z.A~Z) . _ . $
  -2文字目以降は数字も可
  -キーワードは使えない　直截な意味を持つメソッドはNG
    (public.static.void　など)

    変数の使い方
    1⃣　宣言する：　変数を作る
    データ型　変数名、変数名、・・・・；
      (int month,day;)

    2⃣　代入する：　値を入れる
      変数名　=　値　; (age = 20 ;)
    
    3⃣　参照する：　値を見る

    1⃣、2⃣　初期化　する
    (int age = 20 ;)
 */
class Variable{
  public static void main(String[] args){
    int month;
    month = 9;
    int day = 16;
    
    System.out.println("このチャンネルは、");
    System.out.println(month + "月" + day + "日に公開しました！");
  }
}

/*
 データ型

 データ型：　データの種類
  1⃣　基本データ型
    整数
    小数
    文字
    真偽値

    整数
    byte    8バイト　 -128 ~ 127
    short   16バイト　-32768 ~ 32767
    int     32バイト　-2147483648 ~ 2147483647
    long    64バイト  -9223372036854775808 ~ 9223372036854775807

    小数
    float   32バイト　4バイト単精度浮動小数点数
    double  64バイト  8バイト倍整数浮動小数点数

    文字
    char    16バイト  1文字(Unicode)

    真偽値
    boolean  　true(真)　または　false(偽)

・数値はデフォルトで　int　と　double
    ➡　float型の小数にはf(F)を、long型の整数にはl(L)を付ける
・文字のデータは''で囲むこと

  2⃣　参照型
    文字列
    配列
 */