/**
 * @title 30 (10610)
 * @description 주어진 숫자를 조합하여 30의 배수가 되는 최댓값을 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/10610
 */
const fs = require("fs");
const inputTarget =
  process.platform === "linux" ? "/dev/stdin" : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const numbers: number[] = input[0].split("").map(Number);
const hasZero = numbers.includes(0);
const sum = numbers.reduce((acc, curr) => acc + curr, 0);

if (!hasZero || sum % 3 !== 0) {
  console.log(-1);
} else {
  console.log(numbers.sort().reverse().join(""));
}
