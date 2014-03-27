/* Program Utama */
/* Mochamad Lutfi Fadlan */
/* 13512087 */
import java.lang.reflect.*;
import java.util.*;
public class Test
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		try{
		String pack = scan.nextLine();
		Class Orang = Class.forName(pack+"Orang");
		Object O1 = Orang.newInstance();
		Object O2 = Orang.newInstance();
		Object O3 = Orang.newInstance();
		Class Rumah = Class.forName(pack+"Rumah");
		Object R1 = Rumah.newInstance();
		
		Class noparams[] = {};
		Class paramInt[] = new Class[1];
		paramInt[0] = Integer.TYPE;
		
		Method OrangSetId = Orang.getDeclaredMethod("setId",paramInt);
		OrangSetId.invoke(O1,1);
		OrangSetId.invoke(O2,2);
		OrangSetId.invoke(O3,3);
		
		Method RumahSetId = Rumah.getDeclaredMethod("setId",paramInt);
		RumahSetId.invoke(R1,1);
		
		Method OrangPrintId = Orang.getDeclaredMethod("printId",noparams);
		OrangPrintId.invoke(O1,(Object[])null);
		OrangPrintId.invoke(O2,(Object[])null);
		OrangPrintId.invoke(O3,(Object[])null);
		
		Method OrangSetHome = Orang.getDeclaredMethod("setHome",new Class[]{Rumah});
		OrangSetHome.invoke(O2,R1);
		OrangSetHome.invoke(O3,R1);
		
		Method OrangSetBapak = Orang.getDeclaredMethod("setBapak",new Class[]{Orang});
		OrangSetBapak.invoke(O2,O3);
		OrangSetBapak.invoke(O1,O2);
		
		Method OrangPrintIdHome = Orang.getDeclaredMethod("printIdHome",noparams);
		OrangPrintIdHome.invoke(O1,(Object[])null);
		OrangPrintIdHome.invoke(O2,(Object[])null);
		OrangPrintIdHome.invoke(O3,(Object[])null);
		
		Method OrangPrintIdBapak = Orang.getDeclaredMethod("printIdBapak",noparams);
		OrangPrintIdBapak.invoke(O1,(Object[])null);
		OrangPrintIdBapak.invoke(O2,(Object[])null);
		OrangPrintIdBapak.invoke(O3,(Object[])null);
		
		}catch(Exception a){}
	}
}
