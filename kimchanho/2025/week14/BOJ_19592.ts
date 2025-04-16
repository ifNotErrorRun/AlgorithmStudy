/**
* @title 장난감 경주 (19592)
* @description 장난감 경주를 위한 자동차의 속도를 계산하는 문제
* @author Chanho Kim
* @see https://www.acmicpc.net/problem/19592
*/
const fs = require('node:fs');
const inputTarget =
  process.platform === 'linux' ? '/dev/stdin' : `${__dirname}/input.txt`;
const input = fs.readFileSync(inputTarget, 'utf8').trim().split('\n');
const T = Number(input[0]);

for (let i = 0; i < T; i++) {
  const [N, X, Y] = input[i * 2 + 1].split(" ").map(Number);
  const V = input[i * 2 + 2].split(" ").map(Number);
  const maxV = Math.max(...V);
  const maxTime = X / maxV;
  const myV = V[N - 1];
  const myTime = (X - Y) / myV + 1;

  if (maxV === myV && V.filter((v: number) => v === myV).length === 1) {
    console.log(0);
  } else if (myTime >= maxTime) {
    console.log(-1);
  } else {
    let min = myV;
    let max = Y;
    while (min <= max) {
      const mid = Math.floor((min + max) / 2);
      const time = (X - mid) / myV + 1;
      if (time < maxTime) {
        max = mid - 1;
      } else if (time >= maxTime) {
        min = mid + 1;
      }
    }
    console.log(min);
  }
}