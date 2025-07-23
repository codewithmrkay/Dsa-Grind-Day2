public class Dynamic {

    int[] arr;
    int index;

    public Dynamic(int data) {
        arr = new int[data];
        index = 0;
    }

    public void add(int val) {
        if(index>=arr.length){
            int[] demo = new int[arr.length*2];
            for(int i = 0;i<index;i++){
                demo[i]=arr[i];
            }
            arr=demo;
        }
        // System.out.println("new array length"+arr.length);
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
    public void reverseArr(){
        int j = index-1;
        for(int i = 0;i<j;i++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        
    }
    public static void main(String[] args) {
        Dynamic array = new Dynamic(4);
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(3);
        array.add(22);
        array.add(44);
        array.add(46);
        array.add(48);
        array.add(58);
        // System.out.print("My Array :");
        array.print();
    }
}



