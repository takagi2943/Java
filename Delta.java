// Java SE Bronze 8-13
interface Foo {}
class Alpha implements Foo {}
class Beta extends Alpha {}
class Delta extends Beta {
  public static void main(String[] args) {
    Beta x = new Beta();
    // Alpha a = x;　　//エラーなし
    // Foo f = (Delta)x;   //実行時に java.lang.ClassCastException エラー
    // Foo f = (Alpha)x;  //エラーなし
    Beta b = (Beta)(Alpha)x;    //エラーなし
  }
}

/*
 Betaクラスをインスタンス化している
 Foo型、Alpha型、Beta型で宣言された変数で扱うことが可能
 しかし、BetaのサブクラスであるDelta形で扱うことはできない
 */