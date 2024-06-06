package praktek1;

public class node{
    private int nilai;
    private node next;
    private String nama;
    
    //inisialisasi node
    public node(int nilai){
        this.nilai=nilai;
    }

    //setter & Getter

    public void setnama(String nama){
        this.nama=nama;
    }

    public String getnama(){
        return nama;
    }
    public void setnext(node next){
        this.next=next;
    }
    public int getnilai(){
        return nilai;
    }
    public node getnext(){
        return next;
    }
}