package com.mjc.studyjava;

import com.mjc813.mjc_library.IMarketInfo;

public class IMarketTest implements IMarketInfo {
    public String getMessageOfMarketInfo(){
        return "홍길동 반점입니다. T.02)1111-2222";
    }
    public String getMessageOfNotValidData(){
        return "부정확한 값입니다.";
    }
}
