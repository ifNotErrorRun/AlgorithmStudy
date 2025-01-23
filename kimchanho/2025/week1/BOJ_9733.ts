/**
 * @title 꿀벌 (9733)
 * @description 단어의 출현 빈도를 계산하여 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/9733
 */
const solution = (inputArr: string[]) => {
  const map: Map<string, number> = new Map();
  for (const line of inputArr) {
    // 공백 기준으로 단어를 분리하고 빈 문자열을 제거
    const words = line.split(" ").filter((v) => v);
    for (const word of words) {
      const count = map.get(word) || 0;
      map.set(word, count + 1);
    }
  }

  const total = Array.from(map.values()).reduce((acc, cur) => acc + cur, 0);
  const turn = ["Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"];
  for (const t of turn) {
    const count = map.get(t) || 0;
    // 소수점 둘째 자리까지 출력
    console.log(`${t} ${count} ${(count / total).toFixed(2)}`);
  }
  console.log(`Total ${total} 1.00`);
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line: string) => inputArr.push(line))
  .on("close", () => solution(inputArr));
