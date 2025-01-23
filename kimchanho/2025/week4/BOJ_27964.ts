/**
 * @title 콰트로치즈피자 (27964)
 * @description 각기 다른 치즈토핑이 4개 이상이면 yummy, 아니면 sad
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/27964
 */
const solution = (input: string[]) => {
  const toppings= input[1].split(" ").filter((s) => s.endsWith("Cheese"));
  const toppingSet: Set<string> = new Set(toppings);
  console.log(toppingSet.size >= 4 ? "yummy" : "sad");
};

// setting for baekjoon online judge
const input: string[] = [];
require("readline")
.createInterface({ input: process.stdin, output: process.stdout })
.on("line", (line: string) => input.push(line))
.on("close", () => solution(input));
