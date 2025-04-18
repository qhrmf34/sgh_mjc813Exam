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
    let count=0;
    let g=Math.max(...this.maps.values());
        this.maps.forEach((value,key)=>{
            if(value==g){
                h=key;
                count++;
            }
        });
    if(count>=2){
    alert("동점입니다 다시 투표해주세요.");
    return;
    }
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

class Exam38{
    static exam38(){
        let a=document.getElementById("exam38").value;
        let b=[];
        b=a.split(" ");
        let maps = new Map();
        for(let aa of b){
            if(maps.has(aa)){
                maps.set(aa,maps.get(aa)+1);
            }
            else{
                maps.set(aa,1);
            }
        }


      let c=[...maps].sort((a,b)=>b[0]-a[0]);
        let d=c.slice(0,3);
        let e=0;
        d.forEach((item,index)=>{
            e+=item[1];
        });

    document.getElementById("result38").innerHTML=`사탕은 총 ${e}개`;

    }
}

document.getElementById("button38").onclick = ()=>{
    Exam38.exam38();
};

class Exam39{
    static exam39(){
    document.getElementById("result39").innerHTML=`${document.getElementById("exam39").value.replaceAll("q","e")}`;
    }
}

document.getElementById("button39").onclick = ()=>{
    Exam39.exam39();
};


class Exam41{
    exam41(){
        let a=document.getElementById("exam41").value;
        a=Number(a);
        if(this.exam411(a)){
                document.getElementById("result41").innerHTML=`YES`;
        }
        else{
                document.getElementById("result41").innerHTML=`NO`;
        }

    }
    exam411(a){
        for(let i=2;i<a;i++){
                if(a%i==0){
                     return false;
                }
          }
          return true;
    }

}

document.getElementById("button41").onclick = ()=>{
    let ex41=new Exam41();
    ex41.exam41();
};



class Exam42{

    static exam42(){
        let a=document.getElementById("exam420").value;
        let b=document.getElementById("exam421").value;
        let c=document.getElementById("exam422").value;
        a = Number(a);
        b = Number(b);
        c = Number(c);
        const d = new Date(`${a},${b},${c}`);
        switch(d.getDay()){
            case 0 : document.getElementById("result42").innerHTML=`일요일`;
            break;
            case 1 : document.getElementById("result42").innerHTML=`월요일`;
            break;
            case 2 : document.getElementById("result42").innerHTML=`화요일`;
            break;
            case 3 : document.getElementById("result42").innerHTML=`수요일`;
            break;
            case 4 : document.getElementById("result42").innerHTML=`목요일`;
            break;
            case 5 : document.getElementById("result42").innerHTML=`금요일`;
            break;
            case 6 : document.getElementById("result42").innerHTML=`토요일`;
            break;

        }
    }

}
document.getElementById("button42").onclick = ()=>{
    Exam42.exam42();
};

class Exam43{
    static exam43(){
        let a=document.getElementById("exam43").value;
        a=Number(a);
        document.getElementById("result43").innerHTML=`${a.toString(2)}`;
    }
}

document.getElementById("button43").onclick = ()=>{
    Exam43.exam43();
};

//class Test37 {
//                arrItem = [];
//
//                    this.arrItem = input.split(" ");
//                }
//                checkVotes() {
//                    // 배열에 루프를 실행하여 검색해본다.
//                    for( let i = 0; i < this.arrItem.length; i++ ) {
//                        if ( this.isExistItem(this.arrItem[i]) ) {
//                            // map 에 원소이름의 키가 있을때 실행한다.
//                            let number = this.maps.get(this.arrItem[i]);
//                            // map 에서 원소이름이 키인 원래값을 가져온다.
//                            this.maps.set(this.arrItem[i], number + 1);
//                            // map 에 {원소이름: 원래값+1} 으로 저장 한다
//                            // this.maps.set( 키, 값 );
//                        } else {
//                            // map 에 원소이름의 키가 없을때 실행한다.
//                            this.maps.set(this.arrItem[i], 1);
//                            // map 에 {원소이름: 1} 으로 저장 한다
//                            // this.maps.set( 키, 값 );
//                        }
//                    }
//                    console.log(this.maps);
//                    console.log([...this.maps]);    // [... JavaScript Map, Set, Array] ===> 배열로 변환
//                    let item = [...this.maps].reduce( (a,b) =>  // Array reduce 사용
//                        a[1] >= b[1] ? a : b    // 앞의 원소 a[1] 값 >= 뒤의 원소 b[1] 값 보다 크면 a 를 리턴
//                    );
//                    return item;
//                    // return 가장 [1] 값이 큰 map 원소를 리턴한다.
//                }
//                isExistItem(item) {
//                    // 원소가 maps 에 키로 존재하면 true 를 리턴한다.
//                    return this.maps.has(item);
//                    // if ( this.maps.has(item) == true )
//                }
//            }
//            // 원범 혜원 유빈 원범 혜원 곰 유빈 원범 곰 혜원 호랑이 혜원
//            let exam37 = new Exam37(prompt("투표할 항목을 공백으로 구분해서 입력하세요."));
//            let result = exam37.checkVotes();
//            console.log(`투표 결과 ${result[0]}가 ${result[1]}표로 가장 많습니다.`);