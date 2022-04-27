package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	public void execute(String str){
	        
        if("앱".equals(str)){
            runApp();
        }else if("음악".equals(str)){
        	downMusic();
        }else {
        	super.execute(str);
        }
        
    }
    
    public void runApp(){
        System.out.println("앱실행");
    }
    public void downMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
    
}
