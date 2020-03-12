// FIXME-begin
function sumofall(...args) {
    let sum = 0;
    for (let arg of args) sum += arg;
    return sum;
  }
// FIXME-end


console.log(sumofall());
console.log(sumofall(1));
console.log(sumofall(1, 2));
console.log(sumofall(p1=9));
console.log(sumofall(p2=8));
console.log(sumofall(p2=8, p1=14));
console.log(sumofall(1, 2, 3));