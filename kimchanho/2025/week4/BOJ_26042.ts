/**
 * @title 식당 입구 대기 줄 (26042)
 * @description 식당 입구 대기중인 줄의 최대길이와 최대길이일때의 학생 번호의 최소값을 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/26042
 */
const solution = (input: string[]) => {
  const queue: number[] = [];
  let max = 0;
  let lastStudent = 0;

  for (let i = 1; i < input.length; i++) {
    const [action, student] = input[i].split(" ").map(Number);
    if (action === 2) {
      queue.shift();
      continue;
    }
    queue.push(student);

    if (queue.length > max) {
      max = queue.length;
      lastStudent = student;
    } else if (queue.length === max) {
      lastStudent = Math.min(lastStudent, student);
    }
  }
  console.log(max, lastStudent);
};

// setting for baekjoon online judge
const input: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => input.push(line))
.on("close", () => solution(input));
