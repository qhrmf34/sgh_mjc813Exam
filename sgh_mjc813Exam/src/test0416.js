class Test0416{
   //현재 날짜 출력
     exam9(){
           let a=new Date();
           document.getElementById("result9").innerHTML=`${a.getFullYear()}/${a.getMonth()+1}/${a.getDate()}
           ${a.getHours()}:${a.getMinutes()}:${a.getSeconds()}`;

        }
    //입력한 숫자까지 모든 수 더하기
     exam11(){
           let a=document.getElementById("exam11").value;
           a=Number(a);
           let b=[];
           for(let i=1;i<=a;i++){
                b.push(i);
           }
           let d=b.reduce((total,value)=>{return total+value;});
           document.getElementById("result11").innerHTML=`입력 : ${a}<br> total = ${d}`;

        }
     //369
     exam14(){
         let a=document.getElementById("exam14").value;
         a = Number(a);
         if(a%3==0){
         document.getElementById("result14").innerHTML=`입력 : ${a}<br>출력 : 짝`;
         }
         else{
         document.getElementById("result14").innerHTML=`입력 : ${a}<br>출력 : ${a}`;
         }
     }
    //이름 입력
    exam15(){
       let a=document.getElementById("exam15").value;
       document.getElementById("result15").innerHTML=`입력 : ${a}<br>안녕하세요. 저는 ${a}입니다.`;

    }

    //키
    exam17(){
//        let a= Number(prompt("키를 입력하세요."));
        let a = document.getElementById("exam17").value;
        a = Number(a);
        if(a>=150){
            document.getElementById("result17").innerHTML=`키 : ${a} <br> YES`;
    }
        else{
            document.getElementById("result17").innerHTML=`키 : ${a} <br> NO`;

    }

    }
    //성적 평균
    exam18(){
        let a=document.getElementById("exam180").value;
        let b=document.getElementById("exam181").value;
        let c=document.getElementById("exam182").value;
        a = Number(a);
        b = Number(b);
        c = Number(c);
        document.getElementById("result18").innerHTML=`입력 : ${a} ${b} ${c} <br> 출력 : ${Math.round((a+b+c)/3)}`;
    }
    //제곱
    exam19(){
        let a=document.getElementById("exam190").value;
        let b=document.getElementById("exam191").value;
        a = Number(a);
        b = Number(b);
        document.getElementById("result19").innerHTML=`결과 : ${a**b}`;
    }


}


function start() {
    let test0416 = new Test0416();
    test0416.exam9();
    test0416.exam11();
    test0416.exam14();
    test0416.exam15();
    test0416.exam17();
    test0416.exam18();
    test0416.exam19();

}