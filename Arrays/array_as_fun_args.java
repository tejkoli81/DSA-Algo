package Arrays;

public class array_as_fun_args {
        public static void update(int mark[],int Nonchangable){
            int Nonchange=10;
            for(int i=0;i<mark.length;i++){
                System.out.println("After "+(mark[i]+1));// call by Reference means sending reference
            }

        }
    public static void main(String[] args) {
        int marks[]={97,87,90};
        int Nonchangable=5;
        for(int i=0;i<marks.length;i++){
            System.out.println("Before "+marks[i]);
        }
        update(marks,Nonchangable);
        System.out.println(Nonchangable);//call by value means sending copy 
        

        
    }
}
