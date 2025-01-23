/**
 * @title 회사에 있는 사람 (7785)
 * @description 회사에 남아 있는 사람 수를 세는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/7785
 */
const solution = (inputArr: string[]) => {
  const people: Set<string> = new Set();
  for (let i = 1; i < inputArr.length; i++) {
    const [name, action] = inputArr[i].split(" ");
    if (action === "enter") {
      people.add(name);
    } else if (people.has(name)) {
      people.delete(name);
    }
  }

  Array.from(people)
  .sort()
  .reverse()
  .forEach(v => console.log(v))
};

// setting for baekjoon online judge
const inputArr: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => inputArr.push(line))
.on("close", () => solution(inputArr));
