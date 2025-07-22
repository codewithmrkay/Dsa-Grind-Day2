public class MaxItem {

    int[] arr;
    int index;

    public MaxItem(int data) {
        arr = new int[data];
        index = 0;
    }

    public void add(int val) {
        arr[index] = val;
        index++;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                System.out.print(arr[i]);
                System.out.print("]");
                return;
            }
            System.out.print(arr[i] + " ,");
        }
    }

    public void remove(int ind) {
        if (ind >= index) {
            System.out.println("check array size boi");
            return;
        }
        for (int i = ind; i < index - 1; i++) {
            arr[i] = arr[i + 1];
        }
        index--;
    }

    public int MaxElm() {
        int result = arr[0];
        for (int i = 0; i < index; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
    public int MinElm(){
        int result = arr[0];
        for(int i = 0;i<index;i++){
            if(arr[i]<result){
                result=arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MaxItem array = new MaxItem(4);
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(-3);
        System.out.print("My Array :");
        array.print();
        System.out.println("\n");
        System.out.print("Max Item :" + array.MaxElm());
        System.out.println("\n");
        System.out.print("Min Item :" + array.MinElm());
    }
}
