const solution = (inputArr) => {
  const N = Number(inputArr[0]);
  for (let i = 1; i <= N; i++) {
    const input = inputArr[i].split("");
    isVPS(input);
  }
};

const isVPS = (input) => {
  const stack = [];

  while (input.length) {
    const bracket = input.shift();
    if (bracket === "(") {
      stack.push(bracket);
    } else {
      if (stack.length === 0) {
        console.log("NO");
        return;
      }
      stack.pop();
    }
  }
  console.log(stack.length === 0 ? "YES" : "NO");
};

// setting for baekjoon online judge
const inputArr = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line) => inputArr.push(line))
  .on("close", () => solution(inputArr));
