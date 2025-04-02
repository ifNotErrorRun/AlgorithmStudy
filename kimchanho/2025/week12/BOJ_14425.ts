const fs = require("fs");
const inputTarget = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const [N, M] = input[0].split(" ").map(Number);
const set = new Set();
for (let i = 1; i <= N; i++) {
  set.add(input[i]);
}
let count = 0;

for (let i = N + 1; i <= N + M; i++) {
  if (set.has(input[i])) {
    count++;
  }
}

console.log(count);
