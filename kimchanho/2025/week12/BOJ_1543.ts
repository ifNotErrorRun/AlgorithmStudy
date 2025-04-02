const fs = require("fs");
const inputTarget = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const str = input[0];
const pattern = input[1];
let count = 0;
let lp = 0;
let rp = pattern.length - 1;

while (rp < str.length) {
  let flag = true;
  for (let i = 0; i < pattern.length; i++) {
    if (str[lp + i] !== pattern[i]) {
      flag = false;
      break;
    }
  }

  if (flag) {
    count++;
    lp += pattern.length;
    rp += pattern.length;
  } else {
    lp++;
    rp++;
  }
}

console.log(count);
