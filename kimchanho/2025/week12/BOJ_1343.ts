const fs = require("fs");
const inputTarget = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input: string[] = fs.readFileSync(inputTarget, "utf8").trim().split("\n");

const str = input[0];
let replaced: string[] = [];
let lp = 0;
let rp = 0;

// 오른쪽 포인터값이 문자열 길이보다 작거나 같으면 반복
while (rp <= str.length) {
  const char = str.charAt(rp);

  // 오른쪽 포인터가 X이면 오른쪽을 탐색을 계속하기
  if (char === "X") {
    rp++;
    continue;
  }

  const interval = rp - lp;
  // 포인터 간격이 홀수면, 출력값 배열을 [-1]로 초기화 후 반복 종료
  if (interval % 2 === 1) {
    replaced = ["-1"];
    break;
  }

  // 포인터 간격이 짝수면, 출력값 배열에 A, B, char를 넣고 포인터를 다음 위치로 초기화
  // char는 점 또는 undefined이기 때문에 undefined는 제외됨
  const A = "AAAA".repeat(interval / 4);
  const B = "B".repeat(interval % 4);
  replaced.push(A, B, char);
  lp = ++rp;
}

console.log(replaced.join(""));
