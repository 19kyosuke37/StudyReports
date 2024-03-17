package day240317;

public class CapsuleCarInstance {

    public static void main(String[] args) {


        CapsuleCar car1 = new CapsuleCar("スポーツカー");
        car1.speedUp(180);
        car1.copy();
        car1.speedDown(50);
        car1.copy();


        CapsuleCar car2 = new CapsuleCar("改造車");
        //このインスタンスで仮にスピードを180キロ以上に設定してみる
        car2.speedUp(250);
        /*実行するとわかるが、オブジェクト側のメソッドでスピード制限をかけているため、
         *操作する側の人が法外なスピードを入力しても、180キロ以上は出ない安全なインスタンスが出来上がる*/
        car2.copy();
        //speedDownも上と同じで、範囲を超えるものは制限がかかる
        car2.speedDown(500);
        car2.copy();


    }
}
