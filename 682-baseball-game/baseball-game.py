class Solution:
    def calPoints(self, operations: List[str]) -> int:
        record = []
        for operation in operations:
            if operation == 'C':
                record.pop()
                continue
            elif operation == 'D':
                record.append(2*int(record[-1]))
                continue
            elif operation == '+':
                record.append(int(record[-1]) + int(record[-2]))
                continue
            else:
                record.append(int(operation))
                continue
        return sum(record)
