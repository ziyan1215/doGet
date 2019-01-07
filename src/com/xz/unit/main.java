package com.xz.unit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import com.xz.unit.HttpClientUtil;

/**
* @author 作者
* @version 创建时间：2019年1月7日 下午1:52:37
* 类说明
*/
public class main {
	public static void main(String[] args ) {
		 String url = "http://rest.shanbay.com/api/v2/quote/quotes/today/?_=1546075870467"; 
		 long time = System.currentTimeMillis(); //获取当前时间毫秒级
		 String fileName = "shanbayToday"+time+".json";
		 System.out.println(fileName);
		 File file2 = new File("./data/",fileName);//存放到data文件夹存档
			if(!file2.exists())
				try {
					file2.createNewFile();		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else 
				file2.delete();			    
	        try {  
	            String str = HttpClientUtil.doGet(url, "UTF-8");  
	            if (str != null) {  
	                System.out.println("http Get request result:" + str);  
	                //讲结果保存成文件
	                PrintStream ps = new PrintStream(new FileOutputStream(file2));
					 ps.println(str);// 往文件里写入字符串
	            } else {  
	               System.out.println("http Get request process fail");  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	}
	
}
