
class Example {

    public static void main(String[] args) {
        int a[]={1,1,2,3,3,3,4,5};
        int n=a.length;
        int x=0;
        for(int i=0;i<n;i++){
            x=x^a[i];
            System.out.print(x+" ");
        }
        
    }
}
