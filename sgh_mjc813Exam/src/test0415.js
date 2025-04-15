//로또
let lotto= [];
for(let k=0; k<6;k++){
    let num = Math.ceil(Math.random()*45);
    if(num!=0&&!lotto.includes(num)){
        lotto.push(num);
    }
    else{
    k--;}
}
lotto.sort((a,b)=>{return a-b;});
console.log(JSON.stringify(lotto));
//트리
let a=Number(prompt("트리 입력하세요."));
const b=(a)=>{
for(let i=1;i<=a;i++){
        let gong=" ";
        let star="*";
        console.log(`${gong.repeat(a-i)}${star.repeat(2*i-1)}`);
    }
};
b(a);
//출력
class Wizard{
constructor(health,mana,armor){
this.health=health;
this.mana=mana;
this.armor=armor;
}
attack(){
console.log("파이어볼");
}
}
const x=new Wizard(545, 210, 10);
console.log(x.health, x.mana, x.armor);
x.attack();


//행성

let strInput=Number(prompt("행성 입력하세요."));
switch(strInput){
    case 1 : console.log("수성");
    break;
    case 2 : console.log("금성");
    break;
    case 3 : console.log("지구");
    break;
    case 4 : console.log("화성");
    break;
    case 5 : console.log("목성");
    break;
    case 6 : console.log("토성");
    break;
    case 7 : console.log("천왕성");
    break;
    case 8 : console.log("해왕성");
    break;
}
//거꾸로
let strInput2=prompt("단어 입력하세요.");
const str2=(str)=>{
    let bb="";
    for(let a=str.length-1;a>=0;a--){
        bb+=str.charAt(a);
    }
    return bb;
}
console.log(str2(strInput2));
