/**
 * @title 접미사배열 (11656)
 * @description 입력받은 단어의 모든 접미사를 배열로 만들어 오름차순 정렬하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/11656
 */
const fs = require("fs");
const inputTarget =
  process.platform === "linux" ? "/dev/stdin" : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const word = input[0];
const suffixArray: string[] = [];

for (let i = 0; i < word.length; i++) {
  suffixArray.push(word.slice(i));
}

console.log(suffixArray.sort().join("\n"));
