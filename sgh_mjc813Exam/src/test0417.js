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


class Exam37{
    arrItem=[];
    maps = new Map();
    constructor(input){
        this.arrItem=input.split(" ");
    }
    checkVotes(){
    for(let a of this.arrItem){
        if(this.maps.has(a)){
            this.maps.set(a,this.maps.get(a)+1);
        }
        else{
            this.maps.set(a,1);
        }
    }
    let h="";
    let g=Math.max(...this.maps.values());
        this.maps.forEach((value,key)=>{
            if(value==g){
                h=key;
            }
        });
        document.getElementById("result37").innerHTML=`${h}(이)가 총 ${g}표로 반장이 되었습니다.`;
        //배열의 원소를 검색하여 같은 원소가 나오면 몇번인지 저장
        //map 에다가 원소이름 : 몇번으로 저장한다.
        //다음 원소로 검색할때 map의 키에 원소이름이 존재하는지 조건
        //if(this.maps.has(원소이름)==true)
        //원소 이름이 이미 map에 있다면 다음 배열 원소로 건너뛴다.
        //가장 값이 큰 map 원소를 리턴

    }
}

document.getElementById("button37").onclick = ()=>{
    let ex37=new Exam37(document.getElementById("exam37").value);
    ex37.checkVotes();
};
