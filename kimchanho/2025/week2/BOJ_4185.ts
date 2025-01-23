/**
 * @title CD (4185)
 * @description 둘 다 가지고 있는 CD개수 세기 / 0 0 이 읿력될때까지 계속 반복
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/4185
 */
const solution = (inputArr: string[]) => {
  let i = 0;
  while (true) {
    const [n, m] = inputArr[i++].split(" ").map(s => Number(s));
    if (n === 0 && m === 0) {
      break;
    }

    const cd: Set<number> = new Set();
    for (let j = 0; j < n; j++) {
      cd.add(Number(inputArr[i++]));
    }

    let count = 0;
    for (let j = 0; j < n; j++) {
      if (cd.has((Number(inputArr[i++])))) {
        count++;
      }
    }
    console.log(count);
  }
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => inputArr.push(line))
.on("close", () => solution(inputArr));
