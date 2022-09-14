function doubleSwap(str, c1, c2) {
    let arr = str.split("");
    let newStr = "";
    for(let i=0; i<arr.length; i++) {
        newStr += arr[i]==c1?c2:arr[i]==c2?c1:arr[i];
    }
    return newStr;
}
let strings = [
    ["aabbccc", "a", "b"],
    ["random w#rds writt&n h&r&", "#", "&"],
    ["128 895 556 788 999", "8", "9"]
    ];
strings.forEach(s => console.log(s[0] + " : " + doubleSwap(s[0],s[1],s[2])));
