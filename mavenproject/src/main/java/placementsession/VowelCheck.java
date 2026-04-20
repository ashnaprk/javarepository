package placementsession;

public class VowelCheck {

	public static void main(String[] args) {
		char ch='a';
		System.out.println("Alaphabet:" +ch);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Is a vowel");
		break;
		default:
		System.out.println("Is a consonant");
		
		}

	}

}
