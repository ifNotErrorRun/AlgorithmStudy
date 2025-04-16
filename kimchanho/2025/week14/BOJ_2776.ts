/**
* @title 암기왕 (2776)
* @description 숫자를 입력받고 해당 숫자가 존재하는지 찾는 문제
* @author Chanho Kim
* @see https://www.acmicpc.net/problem/2776
*/
const fs = require('node:fs');
const inputTarget =
  process.platform === 'linux' ? '/dev/stdin' : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, 'utf8').trim().split('\n');
const T = Number(input[0]);
const result: number[] = [];

const binarySearch = (arr: number[], n: number) => {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    const mid = Math.floor(left + (right - left) / 2);
    if (arr[mid] === n) {
      return 1;
    }
    if (arr[mid] < n) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return 0;
}
const compareNumber = (a: number, b: number) => a - b
for (let t = 0; t < T; t++) {
  const inputNums = input[t * 4 + 2].split(" ").map(Number).sort(compareNumber);
  const targetNums = input[t * 4 + 4].split(" ").map(Number);

  for (const num of targetNums) {
    const searchResult = binarySearch(inputNums, num);
    result.push(searchResult);
  }
}

console.log(result.join("\n").trim());
