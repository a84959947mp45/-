

import static java.lang.System.out;

import java.util.Scanner;

public class reHandlleData extends Function{
	public static void updateDate() {
		while(true) {
			int XXX;
			out.println("���U�ӿ�J�A�Q�n�ק諸��Ƥu�@�s���A��J0���}");
			String select = input.nextLine();
			XXX=judgeUpdate(select);

			if(select.equals("0")) {
				  while(true) {
					   out.println("�T�{���}? Y/N");
				     String ss = input.nextLine();
				     if(ss.equals("Y")) {
						   return;
				     }else if(ss.equals("N")) {
						   break;
				     }else {
				   continue;
				   }
			    }
				   continue;
			   //�P�_��ƥ��T�_
		     }else if(XXX>=0){
		    	  DataStruct re =  DataHere.get(XXX);
				  while(true) {
					    out.println("�п�ܷQ�n�ק�Χ�s���\��A��J0�H�ɥi�H���s���");
					    out.print("(1 �ϥΤu�@�W�l/");
						out.print("(2 �ϥζ}�l�ɶ�/");
						out.print("(3 �ϥε����ɶ�/");
						out.print("(4 �ϥΧ����ʤ���/");
						out.println("(5 �ϥΤu�@���A/");
						out.print("(6 �ϥΤu�@�s��/");
						out.print("(7 �ϥΤu�@����/");
						out.print("(8 �ϥΤu�@���e/");
						out.print("(9 ���s��J�s��/");
						out.print("(10 ��^���/");
						String SelectX = input.nextLine();
						if(SelectX.equals("1")) {
							out.print("��J�ק諸�u�@�W�l");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	re.workName = select;
						    }
						}else if(SelectX.equals("2")) {
							out.print("��J�ק諸�}�l�ɶ�,EX.2017/06/06");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						       Scanner reDate = new Scanner(select).useDelimiter("/");
							   int yy = reDate.nextInt();
							   int mm = reDate.nextInt();
							   int dd = reDate.nextInt();
							   DateX startDate1 = new DateX(mm,dd,yy);
							   if(startDate1.dateOK(mm,dd,yy)) {
							      re.startDate = startDate1;
							   }else {
								    out.println("�ɶ��榡���~�A�нT�{���X");
									continue;
							   }
								 reDate.close();

						    }
						}else if(SelectX.equals("3")) {
							out.print(" ��J�ק諸�����ɶ�,EX.2018/06/06");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	Scanner reDate = new Scanner(select).useDelimiter("/");
								   int yy = reDate.nextInt();
								   int mm = reDate.nextInt();
								   int dd = reDate.nextInt();
								   DateX endDate1 = new DateX(mm,dd,yy);
								   if(endDate1.dateOK(mm,dd,yy)) {
								      re.endDate = endDate1;
								   }else {
									    out.println("�ɶ��榡���~�A�нT�{���X");
										continue;
								   }
								    reDate.close();
						    }
						}else if(SelectX.equals("4")) {
							out.print(" ��J�ק諸�����ʤ���,EX 99%");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	if(select.charAt(select.length()-1)=='%') {
									   Scanner rePercent = new Scanner(select).useDelimiter("%");
									   int ss = rePercent.nextInt();
									   if(0<=ss&&ss<=100) {
										     re.percent = select;
									   }else {
										   out.println("�п�J0~100��������");
										   continue;
									   }
								   }else {
									   out.println("�п�J���T����");
									   continue;
								   }
						    }
						}else if(SelectX.equals("5")) {
							out.print(" ��J�ק�᪺�u�@���A�AEX �����B���椤�B���}�l");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	if(select.equals("����")||select.equals("���椤")||select.equals("���}�l")){
						    		re.status = select;
									   break;
								}else {
									out.println("�п�J���T����");
								}
						    }
						}else if(SelectX.equals("6")) {
							out.print(" ��J�ק��u�@�s���A�Ʀr���i�H");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	if(judgeNumber(select, select.length())==0) {
									   continue;
								   }else {
									   re.Numbering = select;
								   }
						    }
						}else if(SelectX.equals("7")) {
							out.print(" ��J�ק�᪺����");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	  out.println("���U�ӿ�J�u�@����: ");
								   out.println("(1 �u�@/(2 �Ҹ�/(3 �p�H/(4 ����/(5 ��L/(6 �ۭq");
								    select = input.nextLine();
								   if(select.equals("0")) {
									   continue;
								   }else if(select.equals("1")) {
									   re.classX  = "�u�@";
									   break;
								   }else if(select.equals("2")) {
									   re.classX  = "�Ҹ�";
									   break;
								   }else if(select.equals("3")) {
									   re.classX  = "�p�H";
									   break;
								   }else if(select.equals("4")) {
									   re.classX  = "����";
									   break;
								   }else if(select.equals("5")) {
									   re.classX  = "��L";
									   break;
								   }else {
									   out.println("���U�ӿ�J�ۭq����: ");
									   String XX  = input.nextLine();
									   if(XX.equals("0")) {
											continue;
										   //�P�_��ƥ��T�_
									    }else {
											   re.classX=XX;
										}
								   }

						    }
						}else if(SelectX.equals("8")) {
							out.print(" ��J�ק��u�@���e");
							select = input.nextLine();
							if(select.equals("0")) {
								   continue;
							   //�P�_��ƥ��T�_
						    }else {
						    	re.work = select;
						    }
						}else if(SelectX.equals("9")) {
							DataHere.set(XXX, re);
							break;
						}else if(SelectX.equals("10")) {
							DataHere.set(XXX, re);
							return;
						}

				  }

		 }else{
				   out.println("�п�J���T����");
		 }
	  }

    }

	public static void addNewDate() {
		while(true) {
		   out.println("���U�ӿ�J�A�Q�n��s����ơA");
		   out.println("�u�@�W��/�}�l�ɶ�/�����ɶ�/������/�u�@���A/�u�@�s��/�u�@����/�u�@���e");
		   out.println("��J0�i�H���}��J");
		   DataStruct re = new DataStruct();
		   //��J�u�@�W��
		   while(true) {
			   out.println("���U�ӿ�J�u�@�W��:");
			   re.workName  = input.nextLine();
			   //���X���}�T�{
			   if(re.workName.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {
				   break;
			   }
		   }
		   //��J�}�l�ɶ�
		   while(true) {
			   out.println("���U�ӿ�J�}�l�ɶ� ex.2017/06/01:");
			   String XX = input.nextLine();
			   if(XX.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {
				   Scanner reDate = new Scanner(XX).useDelimiter("/");
				   int yy = reDate.nextInt();
				   int mm = reDate.nextInt();
				   int dd = reDate.nextInt();
				   DateX startDate  = new DateX(mm,dd,yy);
				   if(startDate.dateOK(mm,dd,yy)) {
					    re.startDate = startDate;
					}else {
						continue;
					}
				   reDate.close();
				   break;
			   }
		   }
		   //��J�����ɶ�
		   while(true) {
			   out.println("���U�ӿ�J�����ɶ� ex.2017/06/01:");
			   String XX = input.nextLine();
			   if(XX.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {
				   Scanner reDate = new Scanner(XX).useDelimiter("/");
				   int yy = reDate.nextInt();
				   int mm = reDate.nextInt();
				   int dd = reDate.nextInt();
				   DateX endDate1 = new DateX(mm,dd,yy);
				   if(endDate1.dateOK(mm,dd,yy)) {
					    re.endDate = endDate1;
					}else {
						continue;
					}
				   reDate.close();
				   break;
			   }
		   }
		   //��J������
		   while(true) {
			   out.println("���U�ӿ�J������: ex.87%");
			   re.percent  = input.nextLine();
			   //���X���}�T�{
			   if(re.percent.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {
				   if(re.percent.charAt(re.percent.length()-1)=='%') {
					   Scanner rePercent = new Scanner(re.percent).useDelimiter("%");
					   int ss = rePercent.nextInt();
					   if(0<=ss&&ss<=100) {
						     break;
					   }else {
						   out.println("�п�J0~100��������");
						   continue;
					   }
				   }else {
					   out.println("�п�J���T����");
					   continue;
				   }
			   }
		   }
		   //�P�_���A
		   while(true) {
			   out.println("���U�ӿ�J�u�@������: ex.�����A���椤�A���}�l");
			   re.status  = input.nextLine();
			   //���X���}�T�{
			   if(re.status.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else if(re.status.equals("����")||re.status.equals("���椤")||re.status.equals("���}�l")){
				   break;
			   }else {
				   continue;
			   }
		   }
		   //�u�@�s��
		   while(true) {
			   out.println("���U�ӿ�J�u�@�s��: �Ʀr���i�H");
			   re.Numbering  = input.nextLine();
			   //���X���}�T�{
			   if(re.Numbering.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {

				   if(judgeNumber(re.Numbering, re.Numbering.length())==0) {
					   continue;
				   }else {
					   break;
				   }
			   }
		   }
		 //�u�@����
		   while(true) {
			   out.println("���U�ӿ�J�u�@����: ");
			   out.println("(1 �u�@/(2 �Ҹ�/(3 �p�H/(4 ����/(5 ��L/(6 �ۭq");
			   String select = input.nextLine();
			   if(select.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   }else if(select.equals("1")) {
				   re.classX  = "�u�@";
				   break;
			   }else if(select.equals("2")) {
				   re.classX  = "�Ҹ�";
				   break;
			   }else if(select.equals("3")) {
				   re.classX  = "�p�H";
				   break;
			   }else if(select.equals("4")) {
				   re.classX  = "����";
				   break;
			   }else if(select.equals("5")) {
				   re.classX  = "��L";
				   break;
			   }else {
				   out.println("���U�ӿ�J�ۭq����: ");
				   re.classX  = input.nextLine();
			   }
				   //���X���}�T�{
			   if(re.classX.equals("0")) {
				  while(true) {
			    	  out.println("�T�{���}? Y/N");
				      String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
						}else {
				    	   continue;
					   }
		  	      }
					continue;
				   //�P�_��ƥ��T�_
			    }else {
					   break;
				}

		   }
		   //�u�@���e
		   while(true) {
			   out.println("���U�ӿ�J�u�@���e:");
			   re.work  = input.nextLine();
			   //���X���}�T�{
			   if(re.work.equals("0")) {
				   while(true) {
					   out.println("�T�{���}? Y/N");
					   String ss = input.nextLine();
					   if(ss.equals("Y")) {
						   return;
					   }else if(ss.equals("N")) {
						   break;
					   }else {
						   continue;
					   }
				   }
				   continue;
			   //�P�_��ƥ��T�_
			   }else {
				   break;
			   }
		   }
		   DataHere.add(re);
		   break;
		}
	}
	private static  int judgeUpdate(String number) {
		for(int i =0 ;i<DataHere.size();i++) {
			 if(DataHere.get(i).Numbering.equals(number)) {
				 return i;
			 }
		}
		return 0;
	}

	private static int judgeNumber(String a , int b) {
		for(int i =0;i<b;i++) {
			   if(!('0'<=a.charAt(i)&&a.charAt(i)<='9')){
				   out.println("�A��J�����O�Ʀr�A�нT�{��A��J");
				   return 0;
			   }
		}
		for(int i =0 ; i<DataHere.size();i++) {
			if(DataHere.get(i).Numbering.equals(a)) {
				out.println("���঳���ƪ��u�@�s����A�Э��s��J");
				return 0;
			}
		}
		return 1;
	}
}
