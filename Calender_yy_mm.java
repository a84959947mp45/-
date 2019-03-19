import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date; 
import java.text.SimpleDateFormat;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Calender_yy_mm {

        int ann;int mois,X;
        Calender_yy_mm(int ann,int mois,int day){
        	if(ann==0&&mois==0&&day==0) {
        		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        		Date date = new Date();
        		String strDate = sdFormat.format(date);
        		
        		this.ann= Integer.valueOf(strDate.substring(0,4));
            	this.mois=Integer.valueOf(strDate.substring(5,7));
            	this.X=Integer.valueOf(strDate.substring(8,10));
        		
        	}else {
        	
        	
        	this.ann=ann;
        	this.mois=mois;
        	this.X=day;
        	}
        }//end_�غc�l
	Color color1=GREEN;
	Color color2=YELLOW;
	Color color3=BLUE;
	Color color4=RED;
	Color color5=CYAN;


        void printCalender_yy_mm(){
//ansi().fg(WHITE).a("��"+" �@"+" �G"+" �T"+" �|"+" ��"+" ��").reset()
	//color1
        System.out.print( ansi().fg(color1).a(Integer.toString(ann)));
  	System.out.print(ansi().fg(color1 ).a(" �~  "));
 	System.out.print(ansi().fg(color1).a(Integer.toString(mois)));
 	System.out.print(ansi().fg(color1).a(" ��  "));
	System.out.print(ansi().fg(color1).a(Integer.toString(X)));
	System.out.println(ansi().fg(color1).a(" ��"));

	//color2
        System.out.print( ansi().fg(color2).a("��"));
	System.out.print(ansi().fg(color2).a(" �@"));
	System.out.print(ansi().fg(color2).a(" �G"));
	System.out.print(ansi().fg(color2).a(" �T"));
	System.out.print(ansi().fg(color2).a(" �|"));
	System.out.print(ansi().fg(color2).a(" ��"));
	System.out.println(ansi().fg(color2).a(" ��").reset() );

	//color3
        System.out.println(ansi().fg(color3).a("---------------------").reset());

        Calendar cal = new GregorianCalendar(ann,mois-1,1);
        int day = cal. getActualMaximum(Calendar.DATE); //���o���̤j�Ѽ�
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);//�P���X?
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);//��몺�Ĥ@��

        for(int k = 1 ; k < day_of_week ; k++){
          System.out.print("   ");
        } //����Ů�ťX��


        for(day_of_month = 1 ; day_of_month <= day ; day_of_month++){//��FOR�j��O�n�N����L�X��
        	if(day_of_month==X) {
        		if(day_of_month<10){  //�Y���@�ѬO�Ӧ�ƪ��L�k
		//color4
                    System.out.print(" "+(ansi().fg(color4).a(Integer.toString(X)).reset()+" "));
                    }else{  //�Q��ƪ��L�k
                    System.out.print(ansi().fg(color4).a(Integer.toString(X)).reset()+" ");
                    }
        	}else {
        		if(day_of_month<10){  //�Y���@�ѬO�Ӧ�ƪ��L�k
        			System.out.print(" ");
			//color5
				System.out.print(ansi().fg(color5).a(Integer.toString(day_of_month)).reset());
				System.out.print(" ");
        		}else{  //�Q��ƪ��L�k
				System.out.print(ansi().fg(color5).a(Integer.toString(day_of_month)).reset());
				System.out.print(" ");
        		} 
        	}//���IF�j��O���F�n�]�w�榡

           if (cal.get(Calendar.DAY_OF_WEEK) == 7&&day_of_month!=day) {  //�C��P�����h����
                      System.out.println();
                  }
           cal.add(Calendar.DAY_OF_MONTH, 1);
         }
        System.out.println("");
      } //end_printCalender_yy_mm()
      

}
