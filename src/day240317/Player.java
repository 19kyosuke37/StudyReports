package day240317;

/*オブジェクトは抽象的な概念であり、クラスの設計図や抽象的なもの
 * 対して、インスタンスは具体的な実体でありオブジェクトをもとに作られる、実際にプログラム内で利用されるもの*/

//本クラスはpublicでしているので外部のオブジェクトからも自由に利用できる
public class Player {

    public String name;
    public String position = "ベンチ"; // フィールドで初期値の設定もできる
    public double height;
    public int number;
    public int fullVitality;
    public int vitality;
    public String hello;

    /*コンストラクタ
     *コンストラクタ名はクラス名と同じにする
     *コンストラクタに戻り値や、voidは記述しない。記述すると通常のメソッドとして判断される*/

    public Player(String name1, int number) {
        this.name = name1;
        /*
         * 分かりやすくするためにわざわざ名前をname１にしている。 つまり、コンストラクタの引数で与えられた値(name1)が、
         * フィールドの方（this.がついた方)に代入されている 本当は名前をそろえたままがデファクトスタンダードだから、vitalityのほうはそのまま。
         */
        this.number = number;

        // divisionはフィールドで初期値の設定しているから、記載しなくても勝手に入る

    }

    // 引数3つのもの。コンストラクタはオーバーロードするから、何個でも作れる。
    public Player(String name, String position, int number) {
        this.name = name;
        this.position = position;
        // コンストラクタでdivisionを指定すれば、フィールドで設定した初期値は上書きされる（つまり、初期値の”ベンチ”が上書きされる）
        this.number = number;

    }

    // クラスのプロパティをすべて引数にしているもの。
    public Player(String name, String position, double height, int number, String hello, int fullVitality,
            int vitality) {
        this.name = name;
        this.position = position;
        this.height = height;
        this.number = number;
        this.hello = hello;
        this.fullVitality = fullVitality;
        this.vitality = vitality;

    }

    /*
     * デフォルトコンストラクタ（引数なしコンストラクタ）
     * 一つでも引数ありコンストラクタを記載した場合は、
     * デフォルトコンストラクタがないとコンストラクタを指定していないインスタンスで、エラーが起きる
     */
    public Player() {

    }

    // 自己紹介メソッド
    public void introduce() {
        System.out.println("#" + number + "'" + name + "'" + ",ポジションは" + position + ",身長は" + height + "cm");
            }

    // 挨拶メソッド
    public void greeting() {
        vitality = vitality - 230;
        System.out.println(hello);
    }

    // 残り体力メソッド
    public void hp() {
        if(vitality <= 0) {
            System.out.println("もう動けない。。");
        }else {
            System.out.println("残りの体力は" + vitality + "/" + fullVitality);
        }

    }

}
