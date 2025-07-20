
class Stack:
    def __init__(self):
        self.items = []

    def push(self, item): 
        self.items.append(item)

    def pop(self):
        return self.items.pop() if not len(self.items) == 0 else None
    
    def peek(self):
        return self.items[-1] if not len(self.items) == 0 else None