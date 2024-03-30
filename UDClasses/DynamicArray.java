/*
Md Yasir Khan
BTech
Jamia Millia Islamia, New Delhi
*/

package UDClasses;

public class DynamicArray {
    private int data[];
    private int index;

    public DynamicArray(){
        data = new int[5];
        index = 0;
    }

    public int size(){
        return index;
    }

    public void add(int i){
        if(index == data.length){
            restucture();
        }
        data[index] = i;
        index++;
    }

    private void restucture(){
        int temp[] = data;
        data = new int[data.length*2];
        for(int i = 0; i< temp.length; i++)
            data[i] = temp[i];
    }

    public void set(int i, int d){
        if(i > index){
            System.out.println("This index is not present");
            return;
        }
        if(i == index)
            this.add(d);
        else
            data[i] = d;
    }

    public int get(int i){
        return data[i];
    }

    public boolean isEmpty(){
        if(this.size() == 0)
            return true;
        return false;
    }

    public void print(){
        for(int i = 0; i < index; i++ )
            System.out.print(data[i] + " ");
    }

    public void print(int i){
        System.out.println(data[i]);
    }
}
