package day240313;

public class A {
    //mainメソッド必ず記述。実行ボタンを押した際にこのメソッドが目印でプログラムが走る
    public static void main(String[] args) {

        System.out.println("3/13より復習開始");

        //--変数--
        /*・変数＝変数を宣言することで、指定した型のdataをいれる箱を用意するイメージ
          そして、この変数（箱）のための領域がメモリ状に確保される*/

        int number1 = 1;
        String str = "abc";
        //printlnだと改行される
        System.out.println(number1);
        System.out.println(str);
        //printだと後に改行が入らない
        System.out.print(number1);
        System.out.println(str);
        /*同じ変数に違う値を代入すれば上書きされる
        （今後変化する可能性がある値を変数で扱う利点。代入しなおせば一括で変更ができるため）*/
        int number = 2;
        System.out.println(number);

        //変数は見直した時や、他の方が見たときにわかりやすいように、a,bとかでなく、できるだけ具体的な名前をつけて宣言する。daysPerYearとか。
        //キャメルケース-2単語目以降の頭文字を大文字　　daysPerYear
        //スネークケース-単語と単語の間に _(ｱﾝﾀﾞｰﾊﾞｰ）  days_per_year

        //予約語が変数にできない　if,for,switch など






        //--基本型（オブジェクトのデータそのものを保持する）以下一部紹介--
        //少数型　32ビットのfloat,64ビットのdouble 基本的にはdoubleを利用
        double num = 1.2;
        System.out.println(num);

        //文字型（Stringとことなり一文字だけ扱える、シングルクォーテーションで囲む）
        char cha = 'A';
        System.out.println(cha);

        //真偽値
        boolean keepRunning = true; //まず真偽値をtrueに設定
        int count = 0;
        //while(真偽値)でtrueの間って意味
        while (keepRunning) {
            System.out.println("Count: " + count);
            count++;
            if (count >= 5) {
                keepRunning = false;//ここでifの条件に当てはまったため、falseになって、whileでの繰り返しが終わる
            }
        }



        //--参照型(オブジェクトへの参照（メモリ上のアドレス）が格納)--
        String sansyo1 = "Takahashi";
        String sansyo2 = "Takahashi";
        System.out.println(sansyo1);
        System.out.println(sansyo2);
        //上の二つは、Takahashiというデータ自体は一つしか存在しておらず、それを二つの変数が参照していることになる
        //参照型変数が指し示す場所がない、または指し示す場所を消したいときはnull
        sansyo1 = null;
        System.out.println(sansyo1);


        //--インクリメント・デクリメント演算子--
        //++で1を足す、--で1を引く。しかし、変数の前か後によって少し勝手が変わる。
        //変数より後の場合
        int x = 3;
        int y = x++;//(代入してから1を加算するという意味になる）
        System.out.println(y);
        System.out.println(x);
        //変数より前の場合
        int xx =3;
        int yy = ++xx;//(1を加算してから代入するという意味になる)
        System.out.println(yy);
        System.out.println(xx);



        //--文字列の連結--
        int num1 = 100;
        int num2 = 10;
        //下のように文字列と数値データを + で連結すると、数値も文字列連結される
        System.out.println("num1 + num2 = " + num1 + num2);
        //もし、数値は数値のまま加算をしたいなら、()で囲んで先に実行されるように指示する
        System.out.println("num1 + num2 = " + (num1 + num2));



        //--★型変換（キャスト）--
        int a = 3;
        int b = 2;
        // int型同士の除算（結果はint型）
        System.out.println(a / b);
        // int型変数aを一時的にdouble型に型変換して除算する（結果は、double型） つまり、3.0を2で割るから1.5になる
        System.out.println((double) a / b);
        // int型同士の除算をした結果（int型）をdouble型に型変換　上に対して、1という結果がでてからそれをdouble型にしているだけだから1.0になる
        System.out.println((double) (a / b));


        //--オーバーロード--
        //同じような処理のメソッドに同じ名前をつけ、引数によって自動でどのメソッドの処理を実行するのかを判断

        // add(int num1, int num2)の呼び出し
        add(20, 30);

        // add(int num1, int num2, int num3)の呼び出し。かつ、戻り値をintで設定してみた
        int result;
        result = add(10, 50, 40);
        System.out.println("int型2つの加算結果：" + result);

        // add(double num1, double num2)の呼び出し
        add(10.2, 6.8);

    }

    //★メソッド独立しているから、メインメソッドとももちろん別で、間違えてメインメソッド内に書いたりしないようにする！

    // int型変数2つを受け取り、加算結果を表示するaddメソッド
    public static void add(int num1, int num2){
        System.out.println("int型2つの加算結果：" + (num1 + num2));
    }

    // int型変数3つを受け取り、加算結果を表示するaddメソッド(戻り値あり)
    public static int add(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }

    // double型変数2つを受け取り、加算結果を表示するaddメソッド
    public static void add(double num1, double num2){
        System.out.println("double型2つの加算結果：" + (num1 + num2));
    }


}
