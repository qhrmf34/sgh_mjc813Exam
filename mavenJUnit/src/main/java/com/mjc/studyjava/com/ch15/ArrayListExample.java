package com.mjc.studyjava.com.ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list=new ArrayList<Board>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));
        int size=list.size();
        System.out.println("총 사이즈 : "+size+"\n");
        Board board=list.get(2);
        System.out.println(board.getSubject()+"\n"+board.getContent()+"\n"+board.getWriter());
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        list.remove(2);
        System.out.println();
        for(Board b:list){
            System.out.println(b);
        }
    }
}
