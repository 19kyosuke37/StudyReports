package day240313;

public class Review01 {

    public static void main(String[] args) {

        int taxOut = 1500;
        int tax = tax(taxOut);
        System.out.println(taxOut + "円の商品の税込価格は"
        + (taxOut + tax) + "円（消費税は" + tax +"円）です。");
    }

    public static int tax(int num1) {
        int result =(int) (num1 * 0.1);
        return result;

    }

}
