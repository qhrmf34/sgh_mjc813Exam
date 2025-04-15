class Test0415{
    exam1(){
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
        document.getElementById("result1").innerText=`답 : ${JSON.stringify(lotto)}`;

    }
    exam2(){
    let a=Number(prompt("트리 입력하세요."));
    const b=(a)=>{
    let k="";
    for(let i=1;i<=a;i++){
            let gong="&nbsp;";
            let star="*";
            k+=`${gong.repeat(a-i)}${star.repeat(2*i-1)}<br>`;

        }
    document.getElementById("result2").innerHTML=k;

    };
    b(a);
    }
    exam3(){
    let strInput=Number(prompt("행성 입력하세요."));
    let a="";
    switch(strInput){
        case 1 : a="수성";
        break;
        case 2 : a="금성";
        break;
        case 3 : a="지구";
        break;
        case 4 : a="화성";
        break;
        case 5 : a="목성";
        break;
        case 6 : a="토성";
        break;
        case 7 : a="천왕성";
        break;
        case 8 : a="해왕성";
        break;
    }
    document.getElementById("result4").innerHTML=`답 : ${a}`;

    }
    exam4(){
    let strInput2=prompt("단어 입력하세요.");
    const str2=(str)=>{
        let bb="";
        for(let a=str.length-1;a>=0;a--){
            bb+=str.charAt(a);
        }
        return bb;
    }
    document.getElementById("result5").innerHTML=`답 : ${str2(strInput2)}`;

    }
}
let test0415=new Test0415();
test0415.exam1();
test0415.exam2();
test0415.exam3();
test0415.exam4();

//출력
class Wizard{
constructor(health,mana,armor){
this.health=health;
this.mana=mana;
this.armor=armor;
}
attack(){
document.getElementById("result3").innerHTML=`능력치 : ${this.health},${this.mana},${this.armor}<br> 기술 : 파이어볼`;
}
}
let wizard=new Wizard(545,210,10);
wizard.attack();


