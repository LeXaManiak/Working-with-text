package get_word;

public class Get_word_from_txt {

	public Get_word_from_txt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,x;
		
		if (args [0].length()>args [1].length())  //������� �� ���� ����� ����� ��������-Shorter � ������� Longer
		{
			x=args [1].length();
			
		}
		else 
		{
			x=args [0].length();
		}			
		
		
		
		System.out.println(args [0]);
		System.out.println(args [1]);
		
		i= WordSemiCoincidence (args [0], args [1]);

		
		System.out.println("���������="+i+" "+100*i/x+"%");
		
		
	}





public static int WordSemiCoincidence(String S1, String S2)//���������� ��� ��������� ������, ������ ���������� ����������
{
	int coincidences=0;
	String Longer, Shorter;
	
	
	if (S1.length()>S2.length())  //������� �� ���� ����� ����� ��������-Shorter � ������� Longer
	{
		Longer=S1;
		Shorter=S2;
		
	}
	else 
	{
		Longer=S2;
		Shorter=S1;
	}			
	
	Longer=Longer.toLowerCase();
	Shorter=Shorter.toLowerCase();
	
	
	
	System.out.println("�������="+Longer);
	System.out.println("������="+Shorter);
	
	
	
	
	//����� ����������-������� �� i Shorter ������������ Longer
	

	
	for (int i=0 ; i<=(Longer.length()-Shorter.length()) ; i++)
	{ 
		int _coincidences=0;//���������� ���������� � ������ ������
		
		System.out.println(Longer);	
	
		for (int j=0 ; j<Shorter.length() ; j++)//������ ���������� ���������� ������ Longer �� ������� Shorter ��������� �� i
		{
			
			if (  Longer.charAt(j+i) == Shorter.charAt(j) ){_coincidences++;}
			
		}
		
		if (_coincidences>coincidences) coincidences=_coincidences;
		
		
		
		for (int j=0 ; j<i ; j++)
		{
			
			
			System.out.print(" ");}
		
		System.out.println(Shorter+" "+_coincidences+" "+coincidences);	
	}
	
	
	return coincidences;
}


}