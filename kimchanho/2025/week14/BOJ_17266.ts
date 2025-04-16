/**
* @title 굴다리 (17266) 
* @description 
* @author Chanho Kim
* @see https://www.acmicpc.net/problem/
*/
const fs = require('node:fs');
const inputTarget =
  process.platform === 'linux' ? '/dev/stdin' : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, 'utf8').trim().split('\n');
const N = Number(input[0]);
const M = Number(input[1]);
const arr = input[2].split(" ").map(Number);

let maxLength = Math.max(arr[0], N - arr[M - 1]);
for (let i = 1; i <= M - 1; i++) {
  const length = Math.ceil((arr[i] - arr[i - 1]) / 2);
  maxLength = Math.max(maxLength, length);
}

console.log(maxLength);
