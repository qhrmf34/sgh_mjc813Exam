class Exam27{
    static maps=new Map();
    static exam270(){
        let names=document.getElementById("exam270").value;
        let score=document.getElementById("exam271").value;
        let arrName=names.split(" ");
        let arrScore=score.split(" ");
        if (arrName.length != arrScore.length) {
                    alert("두개 배열의 길이가 다릅니다. 다시 시작하세요.");
                    return false;   // 함수가 false 를 리턴한다.
                }
        for(let i=0; i<arrName.length;i++){
            this.maps.set(arrName[i],Number(arrScore[i]));
        }
        return true;
    }
    static exam271(){
    let result270="{ ";
            this.maps.forEach((value,key)=>{
                result270+=`'${key}' : ${value}, `;
            });
            result270 = result270.substring(0 , result270.length - 2);
            result270+=" }";
            document.getElementById("result27").innerHTML=`출력 ${result270}`;

        }

    }

document.getElementById("button27").onclick = ()=>{
    if(Exam27.exam270()){
    Exam27.exam271();
    }
};

class Exam28{
    static exam28(){
        let a=document.getElementById("exam28").value;
        let b="";
        let c="";
        for(let i=0; i<a.length;i++){
            if(i+1!=a.length){
            b+=`${a.charAt(i)} ${a.charAt(i+1)}<br>`;
            }
        }

            document.getElementById("result28").innerHTML=`${b}<br>`;

    }
}


document.getElementById("button28").onclick = ()=>{
    Exam28.exam28();
};



