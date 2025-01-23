#include <stdio.h>

int main()
{
    int n;
    int max = 0;
    float result = 0;
    scanf("%d", &n);

    // n을 입력받은 후 크기가 n인 정수배열 선언
    int num_list[n];

    // 값 입력받으면서 최댓값 구하기
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &num_list[i]);
        if (max < num_list[i])
        {
            max = num_list[i];
        }
    }

    // 점수값 조작하기
    for (int i = 0; i < n; i++)
    {
        result += (float)num_list[i] / max * 100;
    }
    printf("%f", result / n);

    return 0;
}
