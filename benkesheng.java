/*ʵ�����ݣ����һ��ѧ���࣬����ѧ����ѧ�š��������Ա�ѧУ��רҵ���γ����ơ��γ̱�š��γ̳ɼ����ο���ʦ��
�ܹ�ͳ��ѧ���Ͽε�ȱ�����������ƿγ̳ɼ���ƽ���֡���߷֡���ͷ֡��Զ��Թҿƶ��ѧ���������ȹ��ܡ�
ʵ��Ҫ������Java ��Ͷ����ʹ�á�*/
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
	String [] course={"����","��ѧ","Ӣ��","����","��ѧ"};     //�γ�������
	int [] [] grade=new int [3] [5];                           //ѧ�źͷ�����ά����
	String [] [] teacher=new String [3] [5];                   //��������ʦ��ά����
	int [] que=new int [5];
  Scanner reader=new Scanner (System.in);
	void input()
  {
  	System.out.println("--------------------������ѧ����Ϣ--------------------");
	  for(i=0;i<3;i++)
		{
			System.out.print("�������"+(i+1)+"��ѧ��ѧ�ţ�");
			Id[i]=reader.nextInt();
			System.out.print("�������"+(i+1)+"��ѧ��������");
			name[i]=reader.next();
			System.out.print("�������"+(i+1)+"��ѧ���Ա�");
			sex[i]=reader.next();
			System.out.print("�������"+(i+1)+"��ѧ��ѧУ��");
			school[i]=reader.next();
			System.out.print("�������"+(i+1)+"��ѧ��רҵ��");
			major[i]=reader.next();
			
			}                                         //������Ϣ
			
		System.out.println("------------------------------------------------------");
	  for (i=0;i<3;i++)
		{
			for(j=0;j<5;j++)
			{
			System.out.print("������ѧ��Ϊ"+Id[i]+"��"+course[j]+"��ʦ��");
			teacher[i] [j]=reader.next();
			System.out.print("������ѧ��Ϊ"+Id[i]+"��"+course[j]+"�ɼ���");
			grade[i] [j]=reader.nextInt();
			  }
			}																					//�γ���Ϣ
			
		System.out.println("------------------------------------------------------");
		for(i=0;i<5;i++)
		{
			System.out.print("������"+course[i]+"ȱ��������");
			que[i]=reader.nextInt();
			}
		System.out.println("------------------------------------------------------");
	 }                                                         //����             
 
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
		System.out.println(course[j]+"ƽ���֣�"+avg+"  ��߷֣�"+max+"  ��ͷ֣�"+min);	
		System.out.println("------------------------------------------------------");
	  }
  }                                                          //�����״��

  void show()
	{
		System.out.println("������ѧ�Ų�ѯ��Ϣ:");
		stuid=reader.nextInt();
		for(i=0;i<3;i++)
		{
		if (stuid==Id[i])
		 {
		System.out.println("------------------------------------------------------");
		System.out.println("  ������"+name[i]+"  ѧ�ţ�"+Id[i]+"  �Ա�"+sex[i]+"  ѧУ��"+school[i]+"  רҵ:"+major[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"������"+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"��ʦ��"+teacher [i] [j]);
		  }
		
		System.out.println();  
		for(j=0;j<5;j++)
			{
				if(grade [i] [j] <	60){
				k++;
				}
			  }
			if (k>0){
				System.out.println("------------------���棺���ѹҿ�"+k+"��!------------------");
				}
			else{
				System.out.println("------------------�㻹δ�ҿƣ�����Ŭ����------------------");
			
				}
		 k=0;                                                                     //�ҿƾ���
		 }
		   }
		}                                                        //���ѧ����Ϣ
		
	void showAll()
	{
		for(i=0;i<3;i++)
		{
		System.out.println("------------------------------------------------------");
		System.out.println("  ������"+name[i]+"  ѧ�ţ�"+Id[i]+"  �Ա�"+sex[i]+"  ѧУ��"+school[i]+"  רҵ:"+major[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"������"+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"��ʦ��"+teacher [i] [j]);
		  }
		
		System.out.println();  
		for(j=0;j<5;j++)
			{
				if(grade [i] [j] <	60){
				k++;
				}
			  }
			if (k>0){
				System.out.println("------------------���棺���ѹҿ�"+k+"��!------------------");
				}
			else{
				System.out.println("------------------�㻹δ�ҿƣ�����Ŭ����------------------");
			
				}
		 k=0;                                                                     //�ҿƾ���
		 
		   }
		}                                                        //�������ѧ����Ϣ
		
	void queqin()
	{
			for(i=0;i<5;i++)
			{
			System.out.println(course[i]+"ȱ��������"+que[i]);	
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
		System.out.print("���������ֲ�ѯ��Ӧ���ܣ�"+"\n"+"1.ѧ���ɼ�¼��"+"\n"+"2.��ѯ����ѧ����Ϣ"+"\n"+"3.��ѯ����ѧ����Ϣ"+"\n"+"4.��ѯ���Ƴɼ�״����ƽ���֡���߷֡���ͷ֣�"+"\n"+"5.��ѯȱ������"+"\n"+"6.�˳�����"+"\n");
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
	     System.out.println("----------------------ллʹ��------------------------");
	  break;
	  default:
		   System.out.println("���������������"); 
	        }                                                          //switch
      }
	while (n>0) ;                                                      //do while ѭ��
	
}
}
	
	
	
	
	
	
	
	  
	