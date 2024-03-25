// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
      new Main();
    }
  public Main(){
    int[] numbers = {100, -2000000, 0, 14, -1000, 56324, 66};
    int[] moreNumbers = new int[1000];
    moreNumbers[200] = 25;
    System.out.println(moreNumbers[200]);
    printArray(numbers);
    Sorter s = new Sorter();

    printArray(numbers);
  
    }
    
    void printArray(int[] numbers){
      for(int n:numbers){
        System.out.print(n);
        System.out.print(", ");
      }
      System.out.println("\n");
    
    }
  
  }