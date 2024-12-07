class Solution:
    def isValid(self, s: str) -> bool:
        hashmap = {'(':')','{':'}','[':']'}
        stack = []
        for ch in s:
            if ch in hashmap:
                stack.append(ch)
            else:
                if stack == []:
                    return False
                elif hashmap.get(stack[-1]) != ch:
                    return False
                stack.pop()
                continue
        return True if stack == [] else False