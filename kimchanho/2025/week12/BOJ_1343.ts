const fs = require("fs");
const inputTarget = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input: string[] = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const str = (input[0] + " ").split("");
let replaced: string[] = [];
let count = 0;

for (const char of str) {
  if (char === "X") {
    count++;
    continue;
  }

  if (count % 2 === 1) {
    replaced = ["-1"];
    break;
  }

  const A = "AAAA".repeat(count / 4);
  const B = "B".repeat(count % 4);
  replaced.push(A, B, char);
  count = 0;
}

console.log(replaced.join("").trimEnd());
