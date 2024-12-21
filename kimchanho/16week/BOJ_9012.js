/**
 * @title 괄호 (9012)
 * @description 괄호 문자열이 주어졌을 때, 문자열이 올바른 괄호 문자열인지 판단하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/9012
 */
const solution = (inputArr) => {
  const N = Number(inputArr[0]);
  for (let i = 1; i <= N; i++) {
    const input = inputArr[i].split("");
    isVPS(input);
  }
};

const isVPS = (input) => {
  const stack = [];

  while (input.length) {
    const bracket = input.shift();
    // 여는 괄호면 스택에 추가
    if (bracket === "(") {
      stack.push(bracket);
    // 닫는 괄호면 스택에서 제거
    } else {
      // 스택이 비어있으면 올바르지 않은 괄호 문자열이므로 NO 출력 후 종료
      if (stack.length === 0) {
        console.log("NO");
        return;
      }
      stack.pop();
    }
  }
  // 스택이 비어있으면 올바른 괄호 문자열
  console.log(stack.length === 0 ? "YES" : "NO");
};

// setting for baekjoon online judge
const inputArr = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line) => inputArr.push(line))
  .on("close", () => solution(inputArr));
