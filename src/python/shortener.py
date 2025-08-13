import pyshorteners
import sys


if len(sys.argv) <= 1:
    print("Error In Python File")
    sys.exit(1)
else:
    url = sys.argv[1]
s = pyshorteners.Shortener()
x = s.tinyurl.short(url)
print(x)