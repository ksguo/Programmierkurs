package VOB08_a2;

public class LetterGame {

    public String keyString ="FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER\n" +
            "DURCH BAYERN!";
    public  String word ="";

    public int[] a ;


    public  void setWord(int[] a){
        word = "";

        for(int i = 0; i < a.length ; i++){
            word = word + keyString.charAt(a[i]);
        }

    }

    public void findCode(String s){
        a =  new int[s.length()];
        for(int i = 0 ; i < a.length ;i++){
            a[i]  = keyString.indexOf(s.charAt(i));
        }


    }

}
