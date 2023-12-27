package VOB07_a2;
import java.lang.String;

public class A2_main {

    public static void main(String[] args) {

        char[][] key = { { 'a', 'b' }, { 'c', 'd' }, { 'e', 'f' }, { 'g', 'h' }, { 'i', 'j' }, { 'k', 'l' },
                { 'm', 'n' }, { 'o', 'p' }, { 'q', 'r' }, { 's', 't' }, { 'u', 'v' }, { 'w', 'x' }, { 'y', 'z' },
                { 'z', 'a' }, { 'b', 'c' }, { 'd', 'e' }, { 'f', 'g' }, { 'h', 'i' }, { 'j', 'k' }, { 'l', 'm' },
                { 'n', 'o' }, { 'p', 'q' }, { 'r', 's' }, { 't', 'u' }, { 'v', 'w' }, { 'x', 'y' }, { '.', '!' },
                { '!', '.' }, { ',', ',' }, { ' ', ' ' }, { ':', ':' }, { '?', '?' }, { '+', '+' } };

        char[] message_1 = { 'i', 'b', 'm', 'm', 'p', '.' };

        char[] message_2 = { 't', 'd', 'i', 'v', 'c', 'g', 'b', 'd', 'i', 'q', 's', 'j', 'o', 'a', 'j', 'q', ':', ' ',
                'x', 'f', 'o', 'o', ' ', 'j', 'd', 'i', ' ', 'f', 'm', 'g', ' ', 'p', 'c', 'k', 'f', 'l', 'u', 'f', ' ',
                'b', 'v', 'g', ' ', 'a', 'f', 'i', 'o', ' ', 'g', 'b', 'f', 'd', 'i', 'f', 's', ' ', 'c', 'f', 'm', 'j',
                'f', 'c', 'j', 'h', ' ', 'w', 'f', 's', 'u', 'f', 'j', 'm', 'f', ',', ' ', 'e', 'b', 'o', 'o', ' ', 'h',
                'j', 'c', 'u', ' ', 'f', 't', ' ', 'n', 'j', 'o', 'e', 'f', 't', 'u', 'f', 'o', 't', ' ', 'f', 'j', 'o',
                ' ', 'g', 'b', 'd', 'i', ' ', 'n', 'j', 'u', ' ', 'a', 'x', 'f', 'j', ' ', 'p', 'c', 'k', 'f', 'l', 'u',
                'f', 'o', ' ', 'e', 'b', 's', 'j', 'o', '!' };

        char[] message_3 = { 'f', 'j', 'o', 'f', ' ', 'i', 'f', 'o', 'o', 'f', ' ', 'j', 't', 'u', ' ', 'o', 'v', 's',
                ' ', 'e', 'j', 'f', ' ', 'b', 's', 'u', ' ', 'v', 'o', 'e', ' ', 'x', 'f', 'j', 't', 'f', ',', ' ', 'x',
                'j', 'f', ' ', 'f', 'j', 'o', ' ', 'f', 'j', ' ', 'f', 'j', 'o', ' ', 'x', 'f', 'j', 'u', 'f', 's', 'f',
                't', ' ', 'f', 'j', ' ', 'f', 's', 'a', 'f', 'v', 'h', 'u', '!' };

        char[] message_4 = { 'e', 'f', 's', ' ', 'd', 'p', 'n', 'q', 'v', 'u', 'f', 's', ' ', 's', 'f', 'd', 'i', 'o',
                'f', 'u', ' ', 'n', 'j', 'u', ' ', 'b', 'm', 'm', 'f', 'n', ',', ' ', 'o', 'v', 's', ' ', 'o', 'j', 'd',
                'i', 'u', ' ', 'n', 'j', 'u', ' ', 't', 'f', 'j', 'o', 'f', 'n', ' ', 'c', 'f', 't', 'j', 'u', 'a', 'f',
                's', '!' };

//test decodeChar method
        char test = 'c';
        System.out.println("decode char is  " + decodeChar(test,key));
        decodeMessage(message_1,key);
        decodeMessage(message_2,key);
        decodeMessage(message_3,key);
        decodeMessage(message_4,key);

    }

    public static char decodeChar(char ch, char[][] key){
        for (int i = 0; i < key.length; i++) {
            if (key[i][1] == ch) {
                return key[i][0];
            }
        }
        return '\u0000'; // Leeres Zeichen
    }

    public static void decodeMessage(char[] endMessage , char[][] key) {


        for (int i = 0; i < endMessage.length; i++) {
            System.out.print(decodeChar(endMessage[i], key));
        }
        System.out.println();
    }

}
