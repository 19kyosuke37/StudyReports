package day240317;

/*カプセル化
 *アクセス修飾子をprivateに設定することで、
 *外部から隠ぺいし、正な操作・変更されることを防ぐ*/

/*アクセス修飾子の種類
 *●public　：　全てのクラスからアクセス可能
 *●protected　：　同パッケージのクラス・サブクラスからアクセス可能
 *●指定なし　：　同パッケージのクラスからアクセス可能
 *●private　：　同クラスからのみアクセス可能
 *
 *★クラスには"public"と"指定なし"のみが適応可能
 *★フィールドやメソッドには全種類が適応可能*/

/*他クラスからprivate設定のあるフィールド・メソッドへの接続は、
 * getter,setterメソッドを利用することでアクセスできる*/

public class CapsuleCar {
    private String model;
    private int speed;

    // コンストラクタ
    public CapsuleCar(String model) {
        this.model = model;
    }

    // getter,setter
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 以下のアップ、ダウンのメソッドがsetterに値する

    // スピードアップのメソッド
    public void speedUp(int value) {
      //このifで負の加速は無視する
        if (value <= 0) {
      //★voidにreturnを設定するということはこのメソッドを終了させるということを意味する。
            return;
        }
        this.speed += value;
      /*★下のifによって、誰かがふざけて1000などとスピードアップの値をいれたとしても、
       *スピードアップメソッドによる合計値が180を超えたものは一律180になるため、
       *法外なスピード設定などはできない仕様*/
        if(this.speed >= 180) {
            this.speed = 180;
        }
    }


    // スピードダウンのメソッド  個々の説明はスピードアップのメソッドの逆で考える
    public void speedDown(int value) {
        if(value <= 0) {
            return;
        }
        this.speed -= value;
        if(this.speed < 0) {
            this.speed = 0;
        }
    }

    public void copy() {
        if(speed >0) {
            System.out.println(model + "は時速" + speed + "kmで走ります。");
        }else {
            System.out.println(model + "は停車中です。");
        }

    }

}
