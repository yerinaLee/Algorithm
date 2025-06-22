def solution(n):
    answer = []    
    
    while(n > 0) :
        m = n % 10
        answer.append(m)
        n //= 10
        
    
    return answer