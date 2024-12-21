const solution = (input) => {
  const N = Number(input[0]);
  for (let i = 1; i <= N; i++) {
    const words = input[i].split(" ");
    let result = "";
    while (words.length) {
      result += words.pop() + " ";
    }
    console.log(`Case #${i}: ${result}`);
  }
};

// setting for baekjoon online judge
const inputArr = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line) => inputArr.push(line))
  .on("close", () => solution(inputArr));
