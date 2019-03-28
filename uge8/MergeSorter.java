  import java.util.Collections;
  import java.util.ArrayList;
  import java.util.List;
  import java.util.concurrent.ThreadLocalRandom;

  public class MergeSorter {
      public static void MergeSort(int[] A) {
          MergeSort(A, 0, A.length-1);
      }

      public static void MergeSort(int[] A,int p,int r) {
          if(p < r) {
              int q = (p+r)/2; //Integer division by default since they're integers.
              MergeSort(A,p,q);
              MergeSort(A,q+1,r);
              Merge(A,p,q,r);
          }
      }

      public static void Merge(int[] A,int p,int q,int r) {
          System.err.println("Merge called with: p=" + p + ", q=" + q + ", r=" + r);
          int n1 = q-p+1;
          int n2 = r-q;
          int[] L = new int[n1+1];
          int[] R = new int[n2+1];
          for(int i = 0; i < n1; i++) {
              L[i] = A[p+i];
          }
          for(int j = 0; j < n2; j++) {
              System.err.println("R Copy-iteration: " + j);
              System.err.println("  Copying element at A index: " + (q+1+j));
              R[j] = A[q+1+j];
          }
          L[n1] = Integer.MAX_VALUE;
          R[n2] = Integer.MAX_VALUE;
          int i = 0;
          int j = 0;
          for(int k = p; k <= r; k++) {
              System.err.println("Iteration k=" + k);
              if(L[i] <= R[j]) {
                  A[k] = L[i];
                  i++;
              } else {
                  A[k] = R[j];
                  j++;
              }
          }
      }

      public static int[] SortedArray(int n) {
          int[] A = new int[n];
          for(int i = 0; i < n; i++) {
              A[i] = (i+1);
          }
          return A;
      }

      public static int[] ReverseSortedArray(int n) {
          int[] A = new int[n];
          for(int i = 0; i < n; i++) {
              A[i] = (n-i);
          }
          return A;
      }

      public static int[] RandomArray(int n) {
          int[] A = new int[n];
          ThreadLocalRandom generator = ThreadLocalRandom.current();
          for(int i = 0; i < n; i++) {
              //Avoid having Integer.MAX_VALUE in the input.
              int random_int = generator.nextInt();
              while(random_int == Integer.MAX_VALUE) {
                  random_int = generator.nextInt();
              }
              A[i] = random_int;
          }
          return A;
      }

      public static void ArrayPrettyPrint(int[] A) {
          System.out.print("[" + A[0]);
          for(int i = 1; i < A.length; i++) {
              System.out.print(", " + A[i]);
          }
          System.out.println("]");
      }

      public static double MergeSort_RuntimeTest_RandomInput(int n) {
          int[] input;
          long start,end;

          System.out.println("n = " + n);
          //Best case.
          long[] runtimes = new long[3];
          for(int i = 0; i < 3; i++) {
              input = RandomArray(n);
              start = System.currentTimeMillis();
              MergeSort(input);
              end = System.currentTimeMillis();
              //This print freezes emacs because of the size of the output.
              //System.out.println("Sorted List Input:");
              //ArrayPrettyPrint(input);
              runtimes[i] = end-start;
              System.out.println("Took " + runtimes[i] + " milliseconds.");
          }
          long average = ((runtimes[0]+runtimes[1]+runtimes[2])/3);
          System.out.println("Average time: " + average);
          double normalized_average = (average/(n*(Math.log(n)/Math.log(2))));
          System.out.println("Average normalized by runtime form at input size: " + normalized_average + "\n");

          return normalized_average;
      }

      public static void main(String[] args) {
          double[] normalized_average_runtimes = new double[5];

          for(int i = 1; i <= 5; i++) {
              normalized_average_runtimes[i-1] = MergeSort_RuntimeTest_RandomInput(i*3000);
          }


          double average_normalized = 0;
          for(double d :  normalized_average_runtimes) {
              average_normalized += d;
          }
          average_normalized /= normalized_average_runtimes.length;

          System.out.println("Average normalized runtime: " + average_normalized);

          double[] deviations = new double[normalized_average_runtimes.length];
          for(int i = 0; i < deviations.length; i++) {
              deviations[i] = Math.abs(normalized_average_runtimes[i]-average_normalized);
          }

          double average_deviation = 0;
          for(double d :  deviations) {
              average_deviation += d;
          }
          average_deviation /= deviations.length;

          System.out.println("Average deviation from normalized average: " + average_deviation);
      }
  }
