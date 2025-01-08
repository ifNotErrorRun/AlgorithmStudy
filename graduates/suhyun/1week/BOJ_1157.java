import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 알파벳수 만큼 배열 초기화
        int[] alphabetList = new int[26];

        String str = st.nextToken();
        // 받은 단어 대문자로 변환
        str = str.toUpperCase();

        // 문자열에 단어에 따라 count 증가
        for(int i = 0 ; i<str.length() ; i++){
            int count = str.charAt(i)-'A';
            alphabetList[count]++;
        }

        int max = Integer.MIN_VALUE;
        char result = '?';

        // 배열 돌면서 최댓값 계산
        for(int i = 0 ; i<alphabetList.length ; i++){
            if(max < alphabetList[i]){
                max = alphabetList[i];
                result = (char)(i+'A');
            }else if(max == alphabetList[i]){
                result = '?';
            }
        }

        System.out.println(result);


    }
}
