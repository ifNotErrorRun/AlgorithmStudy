/**
 * @title 문자열 (11338)
 * @description A, B문자열이 주어지고 A와 B문자열 길이를 같게 만들 때 문자의 차이를 최소하하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/11338
 */
const fs = require("fs");
const inputTarget =
  process.platform === "linux" ? "/dev/stdin" : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, "utf8").trim().split("\n");
const [A, B] = input[0].split(" ");

const lengthDiff = B.length - A.length;
let minDiff = Number.MAX_SAFE_INTEGER;

for (let i = 0; i <= lengthDiff; i++) {
  let diff = 0;
  for (let j = 0; j < A.length; j++) {
    if (A[j] !== B[i + j]) {
      diff++;
    }
  }
  minDiff = Math.min(minDiff, diff);
}
console.log(minDiff);
