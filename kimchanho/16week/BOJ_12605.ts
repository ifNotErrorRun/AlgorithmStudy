/**
 * @title 단어순서 뒤집기 (12605)
 * @description 문자열을 입력받아 단어의 순서를 뒤집어 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/12605
 */
const solution = (input: string[]) => {
  const N = Number(input[0]);
  for (let i = 1; i <= N; i++) {
    const words = input[i].split(" ");
    let result = "";
    // pop()을 이용하여 역순으로 출력
    while (words.length) {
      result += words.pop() + " ";
    }
    console.log(`Case #${i}: ${result}`);
  }
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line: string) => inputArr.push(line))
  .on("close", () => solution(inputArr));
