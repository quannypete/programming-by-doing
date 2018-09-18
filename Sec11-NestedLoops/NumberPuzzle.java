class NumberPuzzle{
  public static void main(String[] args) {

    for(int i =1; i < 60; i++){
      for (int j = 1; j < 60; j++){
        if ((i + j) == 60 && Math.abs(i - j) == 14) {
            System.out.print("(" + i + ", " + j + ")\n");
        }
      }
    }
  }

}
