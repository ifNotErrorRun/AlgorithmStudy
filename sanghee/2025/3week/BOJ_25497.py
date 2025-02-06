# 3주차 기술 연계마스터 임스
# https://www.acmicpc.net/problem/25497

def skill_success(skills_input):
    LR_skill = []
    SK_skill = []
    skills_sum = 0

    for skill in skills_input:
        if skill.isdigit():
            skills_sum += 1

        elif skill == 'L':
            LR_skill.append(skill)

        elif skill == 'R':
            if LR_skill:
                LR_skill.pop()
                skills_sum += 1
            else:
                break # 연계할 사전 기술 없이 본 기술을 사용했을 경우에 이후 사용하는 기술들이 발동되지 않는다. (이후 기술 싹 다 무시)

        elif skill == 'S':
            SK_skill.append(skill)

        elif skill == 'K':
            if SK_skill:
                SK_skill.pop()
                skills_sum += 1
            else:
                break

    print(skills_sum)

N = int(input())
skills_ims = input()
skill_success(skills_ims)