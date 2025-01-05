/**
 * @title 막대기 (17608)
 * @description 보이는 막대기의 개수를 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/17608
 */
const solution = (inputArr: string[]): void => {
  const stack = inputArr.slice(1).map(Number);
  let max = 0;
  let count = 0;
  while (stack.length) {
    const cur = stack.pop();
    // 현재 막대기가 가장 긴 막대기보다 길면 보이는 막대기로 카운트하고 max값을 업데이트
    if (cur > max) {
      max = cur;
      count++;
    }
  }
  console.log(count);
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line: string) => inputArr.push(line))
  .on("close", () => solution(inputArr));
