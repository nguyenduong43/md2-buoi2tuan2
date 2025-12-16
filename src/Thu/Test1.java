package Thu;

public class Test1 {
    public static void main(String[] args) {
//        GeometricObject x=new Hinhtron(6);
//        x.hienthi();
//        GeometricObject y=new Hinhvuong(4,5);
//        y.hienthi();
        Object[] o=new Object[2];
        o[0]=new Hinhtron(4);
        o[1]=new Hinhvuong(4,5);
        for (int i=0;i<o.length;i++){
            if (o[i] instanceof Resizeable){
                System.out.println(((Resizeable) o[i]).tang());
            }
            if(o[i] instanceof color){
                System.out.println(((color) o[i]).howToColor());
            }

        }
    }
}
