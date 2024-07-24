
class Alphabet {
    public char alphabets[] = new char[4];
    public int index = 0;

    public int getLength() {
        return this.alphabets.length;
    }

    public void setAlphabet(char alphabet) {
        if (this.index < this.getLength()) {
            System.out.println("Array is not full");
            System.out.println("Alphabet is: " + alphabet);
            this.alphabets[index] = alphabet;
            index++;
        } else {
            System.out.println("Array is full");
        }
    }

    public void displayElements() {
        for (int index = 0; index < this.getLength(); index++) {
            System.out.println("Alphabets are: " + alphabets[index]);
        }
    }

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        alphabet.setAlphabet('A');
        alphabet.setAlphabet('B');
        alphabet.setAlphabet('C');
        alphabet.setAlphabet('D');
        alphabet.displayElements();
    }
}


