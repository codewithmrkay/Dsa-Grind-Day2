public class MyArray{
    int[] arr;
    int index;
    public MyArray(int data){
        arr=new int[data];
        index=0;
    }
    public void add(int val){
        arr[index]=val;
        index++;
    }
    public void print(){
        System.out.print("[");
        for(int i =0;i<index;i++){
            if(i==index-1){
                System.out.print(arr[i]);
                System.out.print("]");
                return;
            }
            System.out.print(arr[i]+" ,");
        }
    }
    public void remove(int ind){
        if(ind>=index){
            System.out.println("check array size boi");
            return;
        }
        for(int i = ind;i<index-1;i++){
            arr[i]=arr[i+1];
        }
        index--;
    }
    public static void main(String[] args) {
        MyArray array = new MyArray(4);
        array.add(20);
        array.add(30);
        array.add(36);
        array.add(43);
        System.out.println("before remove :");
        array.print();
        System.out.println("\nafter remove :");
        array.remove(2);
        array.print();
        
    }
}