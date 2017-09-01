package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        String line = br.readLine();
        char[] chars = new char[line.length()];
        for (int i = 0; i < chars.length; i++)
            chars[i] = line.charAt(i);
        ans(chars);
    }

    // нахождение максималной подстроки-палиндрома в строке
    public static void ans(char[] chars) {
        int ansS = 0, ansF = 0;
        for (int mid = 0; mid < chars.length; mid++) {
            for (int q = 0; q < 2; q++) {
                int l = mid - 1;
                int r = mid + 1 + q;
                while (l >= 0 && r < chars.length) { // идем из середины влево и вправо
                    if (chars[l] == chars[r]) {
                        if (r - l > ansF - ansS) {
                            ansS = l;
                            ansF = r;
                        }
                    } else {
                        break;
                    }
                    l--;
                    r++;
                }
            }
        }
        for (int i = ansS; i <= ansF; i++)
            System.out.print(chars[i]);
        System.out.println();
    }

}
