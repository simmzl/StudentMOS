import java.util.*;
import java.io.*;
//import java.math.BigDecimal;
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
class grad extends stuinfo                //�̳�
{
	String [] place=new String [3];
	String [] [] tutor=new String [3] [5]; 
	String [] course={"JAVA","RFID","LINUX","����","ͨ��"};     //�γ�������
	void input()
  {
  	System.out.println("--------------------������ѧ����Ϣ--------------------");
	
		for (i=0;i<3;i++)
		{
			System.out.print("�������"+(i+1)+"���о���ѧ�ţ�");
			Id[i]=reader.nextInt();
			System.out.print("�������"+(i+1)+"���о���������");
			name[i]=reader.next();
			System.out.print("�������"+(i+1)+"���о����Ա�");
			sex[i]=reader.next();
			System.out.print("�������"+(i+1)+"���о���ѧУ��");
			school[i]=reader.next();
			System.out.print("�������"+(i+1)+"���о���רҵ��");
			major[i]=reader.next();
			System.out.print("�������"+(i+1)+"���о�����Դ�أ�");
			place[i]=reader.next();
			}                                                        																//������Ϣ
			
		System.out.println("------------------------------------------------------");
	  for (i=0;i<3;i++)
		{
			for(j=0;j<5;j++)
			{
			System.out.print("������ѧ��Ϊ"+Id[i]+"��"+course[j]+"�ɼ���");
			grade[i] [j]=reader.nextInt();
			System.out.print("������ѧ��Ϊ"+Id[i]+"��"+course[j]+"��ʦ��");
			tutor[i] [j]=reader.next();		 
			}
		}																																													//�γ̳ɼ���ʦ
		
		System.out.println("------------------------------------------------------");
		for(i=0;i<5;i++)
		{
			System.out.print("������"+course[i]+"ȱ��������");
			que[i]=reader.nextInt();
			}	
		System.out.println("------------------------------------------------------");		                     										//ȱ����Ϣ
	}                                      										 //input������д
  void show()
	{
		System.out.println("������ѧ�Ų�ѯ��Ϣ:");
		stuid=reader.nextInt();
		for(i=0;i<3;i++)
		{
		if (stuid==Id[i])
		 {
		System.out.println("------------------------------------------------------");
		System.out.println("  ������"+name[i]+"  ѧ�ţ�"+Id[i]+"  �Ա�"+sex[i]+"  ѧУ��"+school[i]+"  רҵ:"+major[i]+"  ��Դ��:"+place[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"������"+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"��ʦ��"+tutor [i] [j]);
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
		}                                                        //���ѧ����Ϣ������д
		
  void showAll()
	{
		for(i=0;i<3;i++)
		{
		System.out.println("------------------------------------------------------");
		System.out.println("  ������"+name[i]+"  ѧ�ţ�"+Id[i]+"  �Ա�"+sex[i]+"  ѧУ��"+school[i]+"  רҵ:"+major[i]+"  ��Դ��:"+place[i]);
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"������"+grade [i] [j]);
		  }
		System.out.println();
			for (j=0;j<5;j++)
	    { 
		System.out.print("  "+course[j]+"��ʦ��"+tutor [i] [j]);
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
		
	void queqin()
	{
			for(i=0;i<5;i++)
			{
			System.out.println(course[i]+"ȱ��������"+que[i]);	
			System.out.println("------------------------------------------------------");
				}
			}	
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
  		}   		                                               //�������״��������д
  }
public class shiyan2
{
public static void main (String  [] args)
 {
 	Scanner reader=new Scanner (System.in);
	stuinfo s1=new stuinfo();																//����������
	grad g1=new grad();																			//�о�������
	int n;
	int m=1;
	int i;
	
	do
	{
	System.out.println("���������ֲ�ѯ��Ӧ���ܣ�"+"\n"+"1.����ѧ��ϵͳ"+"\n"+"2.�о���ϵͳ"+"\n"+"3.�˳�����");
	System.out.println("------------------------------------------------------");
	int oper1;
			oper1=reader.nextInt();
			switch (oper1)
				{
					case  1:
					    n=1;
							do
							{
							System.out.println("------------------------------------------------------");	
							System.out.print("���������ֲ�ѯ��Ӧ���ܣ�"+"\n"+"1.�������ɼ�¼��"+"\n"+"2.��ѯ����ѧ����Ϣ"+"\n"+"3.��ѯ����ѧ����Ϣ"+"\n"+"4.��ѯ���Ƴɼ�״����ƽ���֡���߷֡���ͷ֣�"+"\n"+"5.��ѯ����ȱ������"+"\n"+"6.������һ��"+"\n");
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
					    case 3 :
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
						  break;
						  default:
							   System.out.println("------------������������������������룡------------"); 
						        }                                                          //switch
					      }
						  while (n>0) ; 
					break;  
					case 2:
							do
							{
							System.out.print("���������ֲ�ѯ��Ӧ���ܣ�"+"\n"+"1.�о����ɼ�¼��"+"\n"+"2.��ѯ����ѧ����Ϣ"+"\n"+"3.��ѯ����ѧ����Ϣ"+"\n"+"4.��ѯ���Ƴɼ�״����ƽ���֡���߷֡���ͷ֣�"+"\n"+"5.��ѯ����ȱ������"+"\n"+"6.������һ��"+"\n");
							System.out.println("------------------------------------------------------");
							int oper2;
							oper2=reader.nextInt();
							n=1;
						  switch (oper2)
							   {
							case 1:
							   g1.input();
							break;
							case 2 :
							  
					       g1.show ();
					    break;
					    case 3:
					       g1.showAll();
					    break;
							case 4 :
							   g1.fenshu();
							break;                                                                     
							case 5:
					       g1.queqin();
						  break;
						  case 6:
						     n=-1;
						  break;
						  default:
							   System.out.println("------------������������������������룡------------");  
						        }                                                          //switch
					      }
							while (n>0) ; 
					break;
					case 3:
					m=-1;
					System.out.println("----------------------ллʹ��------------------------");
					break;
					default:
					   System.out.println("------------������������������������룡------------");                                                  //do while ѭ��
				}
	}
	while (m>0) ; 
	
 }
}