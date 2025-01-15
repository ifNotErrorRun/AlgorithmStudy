import sys

activities_list = ["Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"]
honeybee_counts = {}

for activity in activities_list:
    honeybee_counts[activity] = 0

# EOF까지 입력은 sys.stdin.read()
honeybee_data = sys.stdin.read().split()
total = len(honeybee_data)

for activity in honeybee_data:
    if activity in honeybee_counts:
        honeybee_counts[activity] += 1

for activity in activities_list:
    count = honeybee_counts[activity]
    ratio = count / total if total > 0 else 0
    print(f"{activity} {count} {ratio:.2f}")
print(f"Total {total} 1.00")
