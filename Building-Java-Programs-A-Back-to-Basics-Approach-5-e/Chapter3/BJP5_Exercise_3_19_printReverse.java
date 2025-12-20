public static void printReverse(String input){
    String reversus = "";
    for(int i = 0; i < input.length(); i++){
        reversus = input.charAt(i) + reversus;
    }
    System.out.println(reversus);
}