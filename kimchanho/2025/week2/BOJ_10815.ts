/**
 * @title 숫자 카드 (10815)
 * @description 가지고 있는 카드면 1, 아니면 0을 출력
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/10815
 */
const solution = (inputArr: string[]) => {
  const card: Set<number> = new Set(inputArr[1].split(" ").map(Number));
  const result = inputArr[3].split(" ")
  .map(s => card.has(Number(s)) ? "1" : "0")
  .join(" ")
  console.log(result)
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => inputArr.push(line))
.on("close", () => solution(inputArr));
