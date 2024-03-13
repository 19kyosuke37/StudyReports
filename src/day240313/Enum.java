package day240313;

/*Enumは少し苦手意識があるから復習
 * 性別や曜日など、決まり切った複数要素で構成されたものを定義する*/
public class Enum {

    //enum型のクラス名の先頭文字は大文字
    public static enum Gender{
        MALE, //この｛｝内に記載されたものを列挙子と呼ぶ、基本的に全て大文字で記載。
        FEMALE
    }
    /*列挙子は記載した順番で自動で番号も振り当てられている。
     * 上のものだと MALE：0　FEMALE：1　というように振り当てられている。
     * 人間は列挙子の値で、ｺﾝﾋﾟｭｰﾀｰは振り当てられた番号でと、互いに処理しやすくなっている*/


    public static void main(String[] args) {

        // Gender型の変数の宣言と初期化
        Gender gender0 = Gender.MALE;
        Gender gender1 = Gender.FEMALE;

        // genderの利用
        System.out.println(gender0);
        System.out.println(gender1);

        // 採番された数値を取得したい場合は 変数名.ordinal() と書く
        System.out.println(gender0.ordinal());
        System.out.println(gender1.ordinal());

    }

}
