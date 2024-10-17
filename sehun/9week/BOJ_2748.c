#include <stdio.h>

long long fibonacchi(int n)
{
    // n이 90일때는 int의 범위를 넘기때문에 long long으로 선언함
    long long a = 0, b = 1, result = 0;
    if (n == 1)
    {
        result = 1;
    }
    else
    {
        for (int i = 2; i <= n; i++)
        {
            result = a + b;
            a = b;
            b = result;
        }
    }

    return result;
}

int main()
{
    // 45보다 작거나 같은 자연수
    int n;
    // scanf("타입", 메모리주소)
    // 아래는 표준입력으로 받은 값을 정수형으로 &n(n의 메모리 주소)에 대입함
    scanf("%d", &n);

    printf("%llu", fibonacchi(n));

    return 0;
}