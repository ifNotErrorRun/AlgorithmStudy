/**
 * @title 전주 듣고 노래 맞히기 (31562)
 * @description 노래의 코드를 입력받아 노래 제목을 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/31562
 */
const solution = (inputArr: string[]): void => {
  const memo: Map<string, string> = new Map();
  const [N, ] = inputArr[0].split(" ").map(Number);
  const songs = inputArr.slice(1, N + 1);
  const codes = inputArr.slice(N + 1);

  for (const song of songs) {
    // 값1: 무시 / 값2: 노래 이름 / 값3, 값4, 값5: 코드
    const [, name, c1, c2, c3] = song.split(" ");
    const code = `${c1}${c2}${c3}`;
    // 값이 있으면 ?로 변경하고 없으면 이름으로 설정
    if (memo.has(code)) {
      memo.set(code, "?");
    } else {
      memo.set(code, name);
    }
  }

  for (const c of codes) {
    // 값1, 값2, 값3: 코드
    const [c1, c2, c3] = c.split(" ");
    const code = `${c1}${c2}${c3}`;
    // 코드에 대한 값이 있으면 출력하고 없으면 ! 출력
    const answer = memo.has(code) ? memo.get(code) : "!";
    console.log(answer);
  }
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line: string) => inputArr.push(line))
  .on("close", () => solution(inputArr));
