package Study;

public class MergeSort {
    int[] array;

//    MergeSort(int[] ar) {
//        array = ar;
//    }

    public static void main(String[] args) {
        int ar[] = {3, 2, 4, 1, 5};
        int br[] = ar;
        mergeSort(br, 0, br.length - 1);
        for (int i = 0; i < br.length; i++) {
            System.out.print(br[i] + " ");
        }
    }

    static void mergeSort(int[] ar, int l, int r) {
        if (l < r) {
            int q = (l + r) / 2;
            mergeSort(ar, l, q);
            mergeSort(ar, q + 1, r);
            merge(ar, l, q, r);
        }
    }

    static private void merge(int[] ar, int l, int q, int r) {
        int L[] = new int[q - l + 1];
        int R[] = new int[r - q];
        for (int i = 0; i < q + 1; i++) {
            L[i] = ar[i];
        }
        for (int i = q + 1; i <= r; i++) {
            R[r - i] = ar[i];
        }
        int i = 0;
        int j = 0;
        int k=l;
        for ( k = l; k < r; k++) {
            if (L[i] < R[j]) {
                ar[k] = L[i];
                i++;
            } else {
                ar[k] = R[j];
                j++;
            }
        }
        if (i == r) {
            for (k = j; k < r; k++,j++) {
                ar[k] = R[j];
            }
        }
        if (j == r) {
            for (k=k; k < r; k++, i++) {
                ar[k] = L[i];
            }
        }
    }
}
