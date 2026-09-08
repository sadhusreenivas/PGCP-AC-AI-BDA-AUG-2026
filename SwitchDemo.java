class SwitchDemo{
	public static void main(String[] args) {
		
		String color = args[0];

		switch(color.toLowerCase()){
		case "cyan": System.out.println("sky is cyan");break;
	    case "magenta":System.out.println("dress is magenta");break;
	    case "yellow":System.out.println("sunflower is yellow"); break;
	    case "knight":System.out.println("knight is beautiful");break;

         default: System.out.println("Pls enter CMYK colors only");
		}

	}
}