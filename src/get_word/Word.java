package get_word;

public class Word {

	String typing[];//�������-��� ����� ������� ����� ��������� ��������� SET
	int Used;//������� ��� ����� ����������� � ������
	
	public Word(String S) //����������� ������-�������� � ������ �����
	
	{
		typing[0]=S;
		Used=1;
	}
		// TODO Auto-generated constructor stub
		
	public boolean FindCoincidence(String S)//���������� ��� ��������� ����� ����� �� ������� S, ���� 100% ����������, ���������� true
	{
		
		
		return true;
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
	
	
		
		public void addWord(String S)
		
		{
	
	
	
	
	}

}
