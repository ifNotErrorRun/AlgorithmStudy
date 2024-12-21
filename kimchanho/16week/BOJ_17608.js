const solution = (inputArr) => {
  const stack = inputArr.slice(1).map(Number);
  let max = 0;
  let count = 0;
  while (stack.length) {
    const cur = stack.pop();
    if (cur > max) {
      max = cur;
      count++;
    }
  }
  console.log(count);
};

// setting for baekjoon online judge
const inputArr = [];
require("readline")
  .createInterface({ input: process.stdin, output: process.stdout })
  .on("line", (line) => inputArr.push(line))
  .on("close", () => solution(inputArr));
