/*实验内容：设计一个学生类，包括学生的学号、姓名、性别、学校、专业、课程名称、课程编号、课程成绩、任课老师，
能够统计学生上课的缺勤人数、各科课程成绩的平均分、最高分、最低分、自动对挂科多的学生提出警告等功能。
实验要求：掌握Java 类和对象的使用。*/
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
class stuinfo
{
	int i;
	int j;
	int stuid;
	double d,e,f;
	int k;
  double avg;
	double min;
	double max;
	int [] Id=new int [3];
	String [] name=new String [3];
	String [] sex=new String [3];
	String [] school=new String [3];
	String [] major=new String [3];
	String [] t1=new String [5];
	double [] grade1=new double [5];
	String [] t2=new String [5];
	double [] grade2=new double [5];
	String [] t3=new String [5];
	double [] grade3=new double [5];
	String [] course={"语文","数学","英语","物理","化学"};     //课程名数组
	int [] [] grade=new int [3] [5];                           //学号和分数二维数组
	String [] [] teacher=new String [3] [5];                   //姓名和老师二维数组
	int [] que=new int [5];
  Scanner reader=new Scanner (System.in);
	void input()
  {
  	System.out.println("--------------------请输入学生信息--------------------");
	  for(i=0;i<3;i++)
		{
			System.out.print("请输入第"+(i+1)+"个学生学号：");
			Id[i]=reader.nextInt();
			System.out.print("请输入第"+(i+1)+"个学生姓名：");
			name[i]=reader.next();
			System.out.print("请输入第"+(i+1)+"个学生性别：");
			sex[i]=reader.next();
			System.out.print("请输入第"+(i+1)+"个学生学校：");
			school[i]=reader.next();
			System.out.print("请输入第"+(i+1)+"个学生专业：");
			major[i]=reader.next();
			
			}                                         //基本信息
			
		System.out.println("------------------------------------------------------");
	  for (i=0;i<3;i++)
		{
			for(j=0;j<5;j++)
			{
			System.out.print("请输入学号为"+Id[i]+"的"+course[j]+"老师：");
			teacher[i] [j]=reader.next();
			System.out.print("请输入学号为"+Id[i]+"的"+course[j]+"成绩：");
			grade[i] [j]=reader.nextInt();
			  }
			}																					//课程信息
			
		System.out.println("------------------------------------------------------");
		for(i=0;i<5;i++)
		{
			System.out.print("请输入"+course[i]+"缺勤人数：");
			que[i]=reader.nextInt();
			}
		System.out.println("------------------------------------------------------");
	 }                                                         //输入             
 
		void fenshu()
	{
		for(j=0;j<5;j++)
		{
		d=grade [0] [j];
		e=grade [1] [j];
		f=grade [2] [j];
		avg=(d+e+f)/3;
		
		if(d>e)
		max=d;
		else
		max=e;
		if(f>max) max=f;
		min=d<e ? d : e;
		min=f<min ? f : min;
		System.out.println("------------------------------------------------------");
		System.out.println(course[j]+"平均分："+avg+"  最高分："+max+"  最低分："+min);	
		System.out.println("------------------------------------------------------");
	  }
  }                                                          //求分数状况

  void show()
	{
		System.out.println("请输入学号查询信息:");
		stuid=reader.nextInt();
		for(i=0;i<3;i++)
		{
		if (stuid==Id[i])
		 {
		System.out.println("------------------------------------------------------");
		System.out.println("  姓名："+name[i]+"  学号："+Id[i]+"  性别："+sex[i]+"  学校："+school[i]+"  专业:"+major[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"分数："+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"老师："+teacher [i] [j]);
		  }
		
		System.out.println();  
		for(j=0;j<5;j++)
			{
				if(grade [i] [j] <	60){
				k++;
				}
			  }
			if (k>0){
				System.out.println("------------------警告：你已挂科"+k+"门!------------------");
				}
			else{
				System.out.println("------------------你还未挂科，继续努力！------------------");
			
				}
		 k=0;                                                                     //挂科警告
		 }
		   }
		}                                                        //输出学生信息
		
	void showAll()
	{
		for(i=0;i<3;i++)
		{
		System.out.println("------------------------------------------------------");
		System.out.println("  姓名："+name[i]+"  学号："+Id[i]+"  性别："+sex[i]+"  学校："+school[i]+"  专业:"+major[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"分数："+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"老师："+teacher [i] [j]);
		  }
		
		System.out.println();  
		for(j=0;j<5;j++)
			{
				if(grade [i] [j] <	60){
				k++;
				}
			  }
			if (k>0){
				System.out.println("------------------警告：你已挂科"+k+"门!------------------");
				}
			else{
				System.out.println("------------------你还未挂科，继续努力！------------------");
			
				}
		 k=0;                                                                     //挂科警告
		 
		   }
		}                                                        //输出所有学生信息
		
	void queqin()
	{
			for(i=0;i<5;i++)
			{
			System.out.println(course[i]+"缺勤人数："+que[i]);	
			System.out.println("------------------------------------------------------");
				}
			}	
  }
public class Student
{
public static void main (String  [] args)
 {
 	Scanner reader=new Scanner (System.in);
	stuinfo s1=new stuinfo();
	int n=1;
	int i;
	do
		{
		System.out.print("请输入数字查询对应功能："+"\n"+"1.学生成绩录入"+"\n"+"2.查询单独学生信息"+"\n"+"3.查询所有学生信息"+"\n"+"4.查询各科成绩状况（平均分、最高分、最低分）"+"\n"+"5.查询缺勤人数"+"\n"+"6.退出程序"+"\n");
		System.out.println("------------------------------------------------------");
		int oper;
		oper=reader.nextInt();
	  switch (oper)
		   {
		case 1:
		   s1.input();
		break;
		case 2 :
		  
       s1.show ();
    break;
    case 3:
       s1.showAll();
    break;
		case 4 :
		   s1.fenshu();
		break;                                                                     
		case 5:
       s1.queqin();
	  break;
	  case 6:
	     n=-1;
	     System.out.println("----------------------谢谢使用------------------------");
	  break;
	  default:
		   System.out.println("您输入的数字有误！"); 
	        }                                                          //switch
      }
	while (n>0) ;                                                      //do while 循环
	
}
}
	
	
	
	
	
	
	
	  
	
