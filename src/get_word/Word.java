package get_word;

public class Word {

	String typing[];//—ловарь-все формы данного слова применить коллекцию SET
	int Used;//сколько раз слово встретилось в тексте
	
	public Word(String S) // онструктор класса-начинаем с первой формы
	
	{
		typing[0]=S;
		Used=1;
	}
		// TODO Auto-generated constructor stub
		
	public boolean FindCoincidence(String S)//—равнивает все имеющиес€ формы слова со строкой S, если 100% совпадение, возвращает true
	{
		
		
		return true;
	}
		
		
		public static int WordSemiCoincidence(String S1, String S2)//—равнивает две текстовые строки, выдает количество совпадений
		{
			int coincidences=0;
			String Longer, Shorter;
			
			
			if (S1.length()>S2.length())  //находим из двух строк более короткую-Shorter и длинную Longer
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
			
			
			
			System.out.println("ƒлиннее="+Longer);
			System.out.println(" ороче="+Shorter);
			
			
			
			
			//самое интересное-двигаем на i Shorter относительно Longer
			

			
			for (int i=0 ; i<=(Longer.length()-Shorter.length()) ; i++)
			{ 
				int _coincidences=0;//количество совпадений в данной строке
				
				System.out.println(Longer);	
			
				for (int j=0 ; j<Shorter.length() ; j++)//“еперь сравниваем побуквенно строку Longer со строкой Shorter сдвинутой на i
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
