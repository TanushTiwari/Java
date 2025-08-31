import pyautogui
import time
import random

# Delay so you have time to click inside VS Code
print("You have 5 seconds to click in your VS Code editor...")
time.sleep(5)

# Some random Python code snippets to "type"
snippets = [
    "print('Hello, World!')",
    "for i in range(5): print(i)",
    "def greet(name): return f'Hello {name}'",
    "if True:\n    print('Condition met')",
    "class Bot:\n    def run(self):\n        print('Running...')"
]

# Bot will type 10 random snippets
for _ in range(300):
    line = random.choice(snippets)
    pyautogui.write(line, interval=0.19)  # interval = typing speed
    pyautogui.press("enter")
    time.sleep(0.9)  # pause between lines