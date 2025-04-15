class Test0416{
    exam0(){
//        let a= Number(prompt("키를 입력하세요."));
        let a = document.getElementById("exam17").value;
        a = Number(a);
        if(a>=150){
            document.getElementById("result0").innerHTML=`키 : ${a} <br> YES`;
    }
        else{
            document.getElementById("result0").innerHTML=`키 : ${a} <br> NO`;

    }

    }
    exam1(){
        let a=document.getElementById("exam180").value;
        let b=document.getElementById("exam181").value;
        let c=document.getElementById("exam182").value;
        a = Number(a);
        b = Number(b);
        c = Number(c);
        document.getElementById("result1").innerHTML=`입력 : ${a} ${b} ${c} <br> 출력 : ${Math.round((a+b+c)/3)}`;
    }
    exam2(){
        let a=document.getElementById("exam14").value;
        a = Number(a);
        if(a%3==0){
        document.getElementById("result2").innerHTML=`입력 : ${a}<br>출력 : 짝`;
        }
        else{
        document.getElementById("result2").innerHTML=`입력 : ${a}<br>출력 : ${a}`;
        }
    }
    exam3(){
       let a=document.getElementById("exam15").value;
       document.getElementById("result3").innerHTML=`입력 : ${a}<br>안녕하세요. 저는 ${a}입니다.`;

    }
}

function start() {
    let test0416 = new Test0416();
    test0416.exam0();
    test0416.exam1();
    test0416.exam2();
    test0416.exam3();
}