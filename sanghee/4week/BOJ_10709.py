def cloud(cloud_list):
  forecast  = []
  accumulation = 0
  isCloud = False

  for cloud in cloud_list:
    if cloud == 'c':
      isCloud = True
      accumulation = 0
      forecast.append(0)

    else:
      if isCloud:
        accumulation += 1

      if accumulation == 0:
        forecast.append(-1)

      else:
        forecast.append(accumulation)

  print(" ".join(str(s) for s in forecast))


H, W = map(int, input().split())

for i in range(H):
  cloud_now = input()
  cloud(cloud_now)