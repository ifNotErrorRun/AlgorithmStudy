/**
 * @title 나는야 포켓몬 마스터 이다솜 (1620)
 * @description 포켓몬 이름과 번호를 입력받아 번호로 이름을 찾거나 이름으로 번호를 찾는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/1620
 */
const solution = (inputArr: string[]) => {
  const pokemonIndexMap: Map<number, string> = new Map();
  const pokemonNameMap: Map<string, number> = new Map();
  const [N] = inputArr[0].split(" ");
  for (let i = 1; i <= Number(N); i++) {
    // 인덱스, 이름별로 맵에 저장
    pokemonIndexMap.set(i, inputArr[i]);
    pokemonNameMap.set(inputArr[i], i);
  }

  for (let i = Number(N) + 1; i < inputArr.length; i++) {
    const target = inputArr[i];
    // 입력값이 숫자면 인덱스로 이름을 찾고, 문자면 이름으로 인덱스를 찾음
    if (isNaN(Number(target))) {
      console.log(pokemonNameMap.get(target));
    } else {
      console.log(pokemonIndexMap.get(Number(target)));
    }
  }
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line: string) => inputArr.push(line))
  .on("close", () => solution(inputArr));
