function kgkkgk(){
/* Зміна для інпута */

let input = document.querySelector('#test1');
/*  */

/* Значення позамовченню для інпута */
input.value = 1;
/*  */
/* Зміна для обрахунку числа */
let min = 40;
/*  */

/* Функція для обробки події по в воду числа в інпупт */
input.oninput = function() {
    /* Звертаємось до ійді елемента в яких хочимо помістити число з обрахунків */
    document.querySelector("#test2").innerHTML = min * input.value;
    /*  */
};
console.log("hghhg")
}
kgkkgk();
function demo() {
alert("super" );
}