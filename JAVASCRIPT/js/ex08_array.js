/*
    JS Array

    months : array at runtime

    -- using array prototype function
    -- add futher function to prototype

*/

Array.prototype.insert = function (idx, elements) {
    this.splice(idx, 0, elements);
};

console.log('====== Ex08 - Array Demo ======');

let months = [3, 4, 5, 6];
console.log(months);

months.push(7);
console.log(months);

months.insert(2, 888);
console.log(months);

