/**
 * @title 베스트셀러 (1302)
 * @description 가장 많이 팔린 책의 제목을 출력하는 문제, 여러 개일 경우 사전 순으로 가장 앞선 것을 출력
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/1302
 */
const solution = (input: string[]) => {
  const books: Map<string, number> = new Map();
  input.slice(1).forEach(book => books.set(book, (books.get(book) || 0) + 1));
  const sortedBooks = Array.from(books).sort(comparingByValueAndOrderingByDesc);
  console.log(sortedBooks[0][0]);
};

const comparingByValueAndOrderingByDesc = (e1: [string, number], e2: [string, number]) => e1[1] === e2[1] 
? e1[0].localeCompare(e2[0])
: e2[1] - e1[1];

// setting for baekjoon online judge
const input: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => input.push(line))
.on("close", () => solution(input));
