
class AlphabetRunner{

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
		int i= alphabet.getLength();
        System.out.println("length is:"+i);
        alphabet.setAlphabet('A');
        alphabet.setAlphabet('B');
        alphabet.setAlphabet('C');
        alphabet.setAlphabet('D');
        alphabet.displayElements();
    }
}


