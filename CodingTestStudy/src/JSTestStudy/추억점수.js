function solution(name, yearning, photo) {
    var answer = [];
    let nyMap = new Map();
    for(let i=0; i<name.length; i++) {
        nyMap.set(name[i],yearning[i]);
    }
    for(const t of photo) {
        let count = 0;
        for(const l of t) {
            if(nyMap.get(l)){
                count +=nyMap.get(l);
            }
        }
        answer.push(count);
    }
    return answer;
}