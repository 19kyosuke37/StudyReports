package day240314;

public class A {

    public static void main(String[] args) {

//----------三項演算子---------------------------------
        //if else分を一行にまとめることができる。なおelseifで三つ以上の分岐がある場合は使えない
        //値を代入する変数 = (条件式) ? true: false;  ←これに代入する
        int score = 21;

        String result = (score >= 60) ? "合格です！" : "赤点です...";
        System.out.println(result);
        
        
//-------while,do~while--------------------------------
        //whileの()の中の条件が当てはまる間はブロック内の処理を繰り返す
        //★繰り返し回数が不明の場合に使用。
        
        //while分（前判定処理）
        //初めに判定するので、処理は0の場合もある
        int num = 1;
        
        while(num < 1024) {
            num = num * 2;
            System.out.println(num);
        }
        
        //do~while（後判定処理）
        //後に判定するため、たとえwhileの条件外でも絶対に一回は処理が実行される
        int num2 = 1024;
        do {
            num2 = num2 * 2;
            System.out.println(num2);
        }while(num2 < 1024);
       
        
        
        
//------------for-----------------------------------------
        //for(ループカウンター、カウンタ変数｛初期値｝；trueの間の繰り返しの条件｛条件式｝；ループごとに行う処理｛後置式｝)
        //カウンタ変数は i が基本。もし入れ子でforの中にforが続けば、i,j,k　の順番で利用していく
        //★繰り返しの回数が明確な場合に使用。
        for(int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }
        
        //配列のと組み合わせ
        int arrays[] = {1,3,5,7,9,11};
        
        for(int i = 0 ; i < arrays.length; i++) {
            System.out.println( i + "=" + arrays[i]);
        }
        //拡張for分を使った場合
        //for(データ型 変数名 : 配列名またはコレクション名) 
        //★配列やコレクションの全データをとりだしたら自動的に終わる
       
    
        for(int array : arrays) {
            System.out.println(array);
        }
        
        
//-----continueを使った処理------------------------------------
        
        int testScores[] = {23,43,67,87,66,12,34,98,58,71};
        int count = 0;
        for(int value: testScores) {
            if(value < 60) { //このif~continueで、ifの条件に合致するものはcontinueによって残りのコードは処理はすきっぷされて、ループに戻る
                continue; 
            }
            count++;
        }
        System.out.println("60点以上の人は、" + count + "人です。");
       
//---------switch-----------------------------------------
        //★ある程度繰り返される処理の回数や結果に見当がついている
        //”switch()”の()の中に入れることができるのはbyte、short、char、int、String、enum（列挙型）の6種類
        /*caseの後に記述する value には、定数（固定値）のみ記述可能。
         * より大きいなどの範囲を持たせることはできない*/
        //defaultはどのcaseにも一致しないときのみ実行。if分のelseに当たる。


        int rank = ranking(score);

        switch(rank) {

        case 0:
            System.out.println("赤点です...補講を行ないます");
            break;
        case 1:
            System.out.println("合格です！");
            break;
        case 2:
        case 3:
            System.out.println("よくできました！");
            break;
        default:
            System.out.println("点数は0以上30以内で代入してください。");
            break;
        }
    }
    //switchで利用するメソッド
    public static int ranking(int num) {
        if(num < 0) {
            return -1;
        }else if(num > 30) {
            return 4;
        }else {
            return num /10;
        }

    }

}
