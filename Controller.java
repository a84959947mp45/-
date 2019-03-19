
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import static java.lang.System.out;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public  class Controller extends Function{
	private String account;
	private String password;
	//�}�l
	public void Start() {
		AnsiConsole.systemInstall();
		data.inputFile();
		EnterInformation();
	}
	//��J�b��
	public void EnterInformation() {
		// TODO Auto-generated method stub

		while(true){
			out.println(ansi().fg(CYAN).a("�w��Ө�u�@����ï�A�п�J�A���b���K�X�п�J���T���A�����п�J0"));
			out.println("�b��:");
			account = input.nextLine();
			if(account.equals("0")) {
				data.outputFile();
				input.close();
				System.exit(1);
			}
			out.println("�K�X:");
			password = input.nextLine();
			if(account.equals("cis")&&password.equals("1234") ) {
				Menu();
				continue;
			}else {
				out.println("�b���K�X���~");
				continue;
			}
		}


	}
	//�D�e��
	public void Menu() {
		String select;
		while(true) {
			out.println(ansi().fg(YELLOW).a("�п�ܷQ�i�J���Ҧ�").reset());
			out.println(ansi().fg(CYAN).a("(1 �ϥΪ̼Ҧ�").reset());
			out.println(ansi().fg(RED).a("(2 �޲z�̼Ҧ�").reset());
			out.println(ansi().fg(GREEN).a("(3 ��^�b��").reset());
			out.println(ansi().fg(MAGENTA).a("(4 �h�X�{��").reset());
			select = input.nextLine();
			//��ܨϥΪ̼Ҧ�
			if(select.equals("1")) {
				USER();
				continue;
			}else if(select.equals("2")) {
				Manager();
				continue;
			}else if(select.equals("3")) {
				EnterInformation();
				continue;
			}else if(select.equals("4")) {
				data.outputFile();
				input.close();
				System.exit(1);
			}else {
				 continue;
			}
		}
	}
	//���e��
	public void USER() {

		String select="";
		while(true) {
			out.println("�п�ܱ��U�ӷQ���檺����");
			out.println("(1 ��ܸ��");
			out.println("(2 �d�߸��");
			out.println("(3 �s�W���");
			out.println("(4 �ק�B��s���");
			out.println("(5 �R�����");
			out.println("(6 ��^");
			out.println("(7 �h�X�{��");
			select = input.nextLine();
			//������ܪ��Ҧ�
			if(select.equals("1")) {
				while(true) {
					out.println("�п�ܦp����ܸ��");
					out.println("(1 �������");
					out.println("(2 �̷Ӥ������");
					out.println("(3 ��^");
					select = input.nextLine();
					//��ܥ���
					if(select.equals("1")) {
						view.ViewAll();
						break;
					//��ܤ���
					}else if(select.equals("2")) {
						//�̬ƻ����
						while(true) {
							out.println("�п�ܭn��ܬƻ����?");
							out.println("(1 �u�@/(2 �Ҹ�/(3 �p�H/(4 ����/(5 ��L/(6 �ۭq");
							select = input.nextLine();
							if(select.equals("1")) {
								view.ViewClass("classX","�u�@");
								break;
							}else if(select.equals("2")) {
								view.ViewClass("classX","�Ҹ�");
								break;
							}if(select.equals("3")) {
								view.ViewClass("classX","�p�H");
								break;
							}if(select.equals("4")) {
								view.ViewClass("classX","����");
								break;
							}if(select.equals("5")) {
								view.ViewClass("classX","��L");
								break;
							}if(select.equals("6")) {
								select = input.nextLine();
								view.ViewClass("classX",select);
								break;
							}else {
								continue;
							}
						 }
						break;
					}else if(select.equals("3")){
						break;
					}else {
						continue;
					}
				}
				continue;
			//�d�߸��
			}else if(select.equals("2")) {
				while(true) {
					out.println("�п�ܦp���ܸ��");
					out.print("(1 �ϥΤu�@�W�l/");
					out.print("(2 �ϥζ}�l�ɶ�/");
					out.print("(3 �ϥε����ɶ�/");
					out.print("(4 �ϥΧ����ʤ���/");
					out.println("(5 �ϥΤu�@���A/");
					out.print("(6 �ϥΤu�@�s��/");
					out.print("(7 �ϥΤu�@����/");
					out.print("(8 �ϥΤu�@���e/");
					out.print("(9 ��^���/");
					out.println("(10 �h�X�{��");
					select = input.nextLine();
					//��ܥ���
					if(select.equals("1")) {
						out.println("�п�J�n�j�M���u�@�W�l");
						select = input.nextLine();
						view.ViewClass("workName",select);
						break;
					}else if(select.equals("2")) {
						out.println("�п�J�n�j�M���}�l�ɶ�: ex,2017/06/06");
						select = input.nextLine();
						Scanner re = new Scanner(select).useDelimiter("/");
						int yy,mm,dd;
						yy = re.nextInt();
						mm = re.nextInt();
						dd = re.nextInt();
						DateX reDate = new DateX(mm,dd,yy);
						//�P�_����O�_���T
						if(reDate.dateOK(mm,dd,yy)) {
							view.ViewClass("startDate",reDate.toString());
						}else {
							continue;
						}
						break;
					}else if(select.equals("3")) {
						out.println("�п�J�n�j�M�������ɶ�: ex,2017/06/06");
						select = input.nextLine();
						Scanner re = new Scanner(select).useDelimiter("/");
						int yy,mm,dd;
						yy = re.nextInt();
						mm = re.nextInt();
						dd = re.nextInt();
						DateX reDate = new DateX(mm,dd,yy);
						//�P�_����O�_���T
						if(reDate.dateOK(mm,dd,yy)) {
							view.ViewClass("endDate",reDate.toString());
						}else {
							continue;
						}

						break;
					}else if(select.equals("4")) {
						out.println("�п�J�n�j�M�������ʤ���");
						select = input.nextLine();
						view.ViewClass("percent",select);
						break;
					}else if(select.equals("5")) {
						out.println("�п�J�n�j�M���������A");
						select = input.nextLine();
						view.ViewClass("status",select);
						break;
					}else if(select.equals("6")) {
						out.println("�п�J�n�j�M���u�@�s��");
						select = input.nextLine();
						view.ViewClass("Numbering",select);
						break;
					}else if(select.equals("7")) {
						out.println("�п�J�n�j�M���u�@����");
						select = input.nextLine();
						view.ViewClass("classX",select);
						break;
					}else if(select.equals("8")) {
						out.println("�п�J�n�j�M���u�@���e");
						select = input.nextLine();
						view.ViewClass("work",select);
						break;
					}else if(select.equals("9")) {
						break;
					}else if(select.equals("10")) {
							System.exit(1);
					}else {
						out.println("�Э��s��J");
						 continue;
					}
				}
				continue;
			//�s�W���
			}else if(select.equals("3")) {
				 reHandlleData.addNewDate();
				 continue;
			}else if(select.equals("4")) {
				reHandlleData.updateDate();
				 continue;
			}else if(select.equals("5")) {
				out.println("(1 �R���浧���");
				out.println("(2 �榡�ƥ������");
				out.println("(3 ��^");
				 select = input.nextLine();
				 if(select.equals("1")) {
					 	out.println("�п�J�Q�R�����s��");
					 	select = input.nextLine();
				 }else if(select.equals("2")) {
					 while(true) {
						 out.println("�T�w�n�榡�Ƹ��? Y/N");
						 select = input.nextLine();
						 if(select.equals("Y")) {
							 DataHere.clear();
							 break;
						 }else if(select.equals("N")) {
							 break;
						 }else {
							 continue;
						 }
					 }
				 }else if(select.equals("3")) {
					 continue;
				 }
			}else if(select.equals("6")) {
				Menu();
				input.close();
				return;
			}else if(select.equals("7")) {
				data.outputFile();
				System.exit(1);
			}else {
				 continue;
			}
		}
	}
	//���n���
	public void Manager() {
		while(true) {
			out.println("�п�ܱ��U�ӷQ���檺����");
			out.println("(1 �Ƨǥ�����ơA��s�J���");
			out.println("(2 �]�w�ϥΪ̱ƧǬO�Ѥj�Τp");
			out.println("(3 ��^");
			out.println("(4 �h�X�{��");
			String select = input.nextLine();
			//������ܪ��Ҧ�
			if(select.equals("1")) {
					out.println("(1 �Ѥj��p");
					out.println("(2 �Ѥp��j");
					out.println("(3 ��^");
					select = input.nextLine();
					if(select.equals("1")) {
						view.controlls=-1;
						view.SortWhat(select);
						data.outputFile();
						out.println("�����Ƨ�");
					}else if(select.equals("2")) {
						view.controlls=1;
						view.SortWhat(select);
						data.outputFile();
					}else if(select.equals("3")) {
						continue;
					}
			}
			else if(select.equals("2")) {
				out.println("(1 �Ѥj��p");
				out.println("(2 �Ѥp��j");
				out.println("(3 ��^");
				select = input.nextLine();
				if(select.equals("1")) {
					view.controlls=-1;
				}else if(select.equals("2")) {
					view.controlls=1;
				}else if(select.equals("3")) {
					continue;
				}
			}else if(select.equals("3")) {
				return;
			}else if(select.equals("4")) {
				System.exit(1);
			}

		}
	}
}
