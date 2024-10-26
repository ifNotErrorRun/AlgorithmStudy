#include <stdio.h>
#include <string.h>

int main()
{
    // 입력받는 s의 경우 단어의 길이는 100을 넘지 않지만, 마지막 null문자까지 고려하여 일단 길이를 101으로 설정
    // 찾아보니 malloc이라는 동적할당도 가능하다는데 일단 데이터가 크지 않으니 고정길이로함
    char s[101];
    int alphabet[26], len;

    // %100s -> %s를 100개만 받음... 초과하는 부분은 버려짐(아마도?)
    scanf("%100s", s);
    len = strlen(s);

    // c언어는 배열초기화 함수?메소드?가 딱히 없나봄....
    for (int i = 0; i < 26; i++)
    {
        alphabet[i] = -1;
    }

    // 문자배열 루프
    for (int i = 0; i < len; i++)
    {
        int temp = (int)s[i] - 97;
        if (alphabet[temp] == -1)
        {
            alphabet[temp] = i;
        }
    }

    // 출력
    for (int i = 0; i < 26; i++)
    {
        printf("%d ", alphabet[i]);
    }

    // 종료코드는 항상 필요한가봄....
    return 0;
}
