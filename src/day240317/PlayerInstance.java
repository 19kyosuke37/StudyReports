package day240317;

public class PlayerInstance {

    public static void main(String[] args) {

        // 引数なしコンストラクタ
        Player player1 = new Player();
        /*
         * ★オブジェクトをインスタンス化して、実体化するまでの一連の流れ★ 上で初期化している
         * Playerクラスの変数player1に対して、右辺のnewでインスタンス（実体）を生成している
         * この一行により、Playerクラスが１つのインスタンスとして実体化して、変数player1に格納される。
         * しかし、このままでは実体化しただけで空のため、コンストラクタや、<インスタンスが格納された変数名>.<フィールド名>という記述で
         * 値をセットして利用していく
         */
        player1.name = "桜木花道";
        player1.position = "PF";
        player1.height = 189.2;
        player1.number = 10;
        player1.hello = "ちゅーーーっっす!!!!!";
        player1.fullVitality = 500;
        player1.vitality = 500;

        player1.introduce();
        player1.greeting();
        player1.hp();

        // 引数が２つのコンストラクト
        Player player2 = new Player("流川楓", 11);
        player2.position = "SF";
        player2.height = 187.0;
        player2.hello = "うす。";
        player2.fullVitality = 380;
        player2.vitality = 380;

        player2.introduce();
        player2.greeting();
        player2.hp();

        // 引数が5つのコンストラクタ
        Player player3 = new Player("三井寿", "SG", 184.0, 14, "オッス！", 230, 230);

        player3.introduce();
        player3.greeting();
        player3.hp();



        //仮にフィールドに何も設定しないとどうなるか
        Player player4 = new Player();
        //以下のメソッドを実行すると、参照型のString等にはnull（参照するものがない）が入る。
        //★positionには初期値が設定されため、”ベンチ”が代入される
        //また、基本型のintやdoubleには0や0.0が入る。
        player4.introduce();

    }

}
