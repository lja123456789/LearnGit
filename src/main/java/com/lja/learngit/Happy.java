package com.lja.learngit;

public class Happy {

	public static void main(String args[]) {
		System.out.println("test ....");
		System.out.println("成员二做了修改，然后add 并提交到本地"
				+ "然后push时就会出现冲突,需要先pull,然后解决冲突，"
				+ "然后在add 、commit、push");
		//同时保留两部分内容
		System.out.println("成员一做修改，然后add，并提交到"
				+ "本地库,然后push到远程库。");
		
		
		//成员在feature上开发新任务
		System.out.println("正在开发新的任务......");
	}
}
