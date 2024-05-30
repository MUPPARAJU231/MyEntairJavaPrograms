package practice.exam;

import java.util.Arrays;

public class CopyofArrayReverse
{
		public static void main(String[] args) 
		{
			String name[]=new String[4];
			name[0]="Ram";
			name[1]="Sita";
			name[2]="Radha";
			name[3]="Gopi";
			
			String namecopy[]=new String[name.length];
			for(int i=0;i<name.length;i++)
			{
				namecopy[i]=name[name.length-1-i];
			}
			System.out.println(Arrays.toString(name));
			System.out.println(Arrays.toString(namecopy));
			
		}

}
