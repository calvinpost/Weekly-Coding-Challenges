function sumDigits(num) {
    let sum = 0;
    while(num > 0) {
        sum += num%10;
        num = Math.floor(num/10);
    }
    return sum%2==0 ? "Evenish" : "Oddish";
}
let nums = [43, 373, 4433];
nums.forEach(num => console.log(num + " : " + sumDigits(num)));
